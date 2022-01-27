package testNG_advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_SupportLoan_001 {
	
	@DataProvider
	public String[] sendMobileInfo()
	{
		String[] arr = {"iphone","redmi","poco","oneplus"};
		return arr;
	}
	
	@Test(dataProvider = "sendMobileInfo")
	public void ceateARequest(String mobileName)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobileName,Keys.ENTER);
		driver.quit();
	}
	

}
