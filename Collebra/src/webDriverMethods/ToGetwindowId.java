package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetwindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.navigate().to("https://www.skillrary.com/");
		String windowId=driver.getWindowHandle();
		System.out.println(windowId);*/  //for single window Id
		
		driver.navigate().to("https://www.naukri.com/");
		Set<String> allWindowsId = driver.getWindowHandles();
		
		for(String windowId : allWindowsId)
		{
			System.out.println(windowId);
		}
		driver.quit();
	}

}
