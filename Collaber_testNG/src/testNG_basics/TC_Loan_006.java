package testNG_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loan_006 {
	
	@Test(groups = "SmokeTest" , priority = 4) //skipped
	public void deleteLoan() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vtu.ac.in/");
		driver.quit();

}

}
