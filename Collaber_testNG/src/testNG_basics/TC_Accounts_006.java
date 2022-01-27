package testNG_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Accounts_006 {
	
	@Test(timeOut = 10000 , dependsOnGroups = {"SmokeTest", "AdhocTest"})
	public void modifyAccount() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		//Thread.sleep(11000);
		driver.get("https://www.oyorooms.com/");
		driver.quit();
	}

}
