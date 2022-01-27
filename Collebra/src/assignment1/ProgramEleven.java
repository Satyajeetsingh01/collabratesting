//WAS TO CLICK ON THE ELEMENT OF THE SPECIFIED TITLED WINDOW

package assignment1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramEleven {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//String parentwindow = driver.getWindowHandle();
		
		String expectedTitle="ICICI";
		Set<String> allWindowsId = driver.getWindowHandles();
		
		for(String windowId : allWindowsId)
		{
			driver.switchTo().window(windowId);
			String actualTitle = driver.getTitle();
			
			if(actualTitle.equals(expectedTitle))
			{
				driver.findElement(By.tagName("a")).click();
			}
		}
		//driver.switchTo().window(parentwindow);
		

	}

}
