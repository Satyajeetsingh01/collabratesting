package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDriven.ExcelLib;
import pomRepo.LoginPage;

public class Login {

	public static void main(String[] args) {
		
		String testUrl = ExcelLib.readStringData("Sheet3", 0, 0);
		String username = ExcelLib.readStringData("Sheet3", 0, 1);
		String password = ExcelLib.readStringData("Sheet3", 0, 2);
		String expctedLoginPageTitle = ExcelLib.readStringData("Sheet3", 1, 0);
		String expectedHomePageTitle = ExcelLib.readStringData("Sheet3", 1, 1);
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(testUrl);
		String actualLoginPageTitle = driver.getTitle();
		if(actualLoginPageTitle.equals(expctedLoginPageTitle))
		{
			System.out.println("Login page is displayed successfully");
		}
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getUserNameTextField().sendKeys(username);
		//driver.navigate().refresh();
		loginPage.getPasswordTextField().sendKeys(password);
		loginPage.getLoginButton().click();
		String actualHomePageTitle = driver.getTitle();
		if(actualHomePageTitle.equals(expectedHomePageTitle))
		{
			System.out.println("Login is successfull");
		}
		
		/*HomePage homepage = new HomePage(driver);
		homePage.getUserModulelink.click()*/

	}

}
