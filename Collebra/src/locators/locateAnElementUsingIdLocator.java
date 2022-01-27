package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateAnElementUsingIdLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.actitime.com/login.do");
		
		WebElement userNameTextField = driver.findElement(By.id("username"));
		userNameTextField.sendKeys("Satyajeet");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("Abcd123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginButton")).click();

	}

}
