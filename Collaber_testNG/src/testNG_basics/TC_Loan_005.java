package testNG_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loan_005 {
	
	@Test(groups = "AdhocTest", priority = 3)  //failed
	public void repayLoan() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		//int i = 1/0;
		driver.quit();

}

}
