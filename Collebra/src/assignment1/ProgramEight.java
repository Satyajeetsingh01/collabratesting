//WAS TO CLOSE ONLY CHILD WINDOWS OF NAUKRI.COM

package assignment1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramEight {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
			driver.close();
		}
		

	}

}
