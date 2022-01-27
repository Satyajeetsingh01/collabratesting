package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseOneWindowAmongNine {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.zomato.com/");
		driver.get("https://www.naukri.com/");
		//driver.get("https://www.swiggy.com/");
	//	driver.get("https://www.kalkifashion.com/");
	//	driver.get("https://www.skillrary.com/");
	//	driver.get("https://www.qspyders.com/");
		
		String expectedTitle = "ICICI";
		Set<String> allWindowId = driver.getWindowHandles();
		
		for(String windowId:allWindowId)
		{
			driver.switchTo().window(windowId);
			String actualPageTitle = driver.getTitle();
			if(expectedTitle.equals(actualPageTitle))
					{
				       driver.close();
					}
		}

	}

}
