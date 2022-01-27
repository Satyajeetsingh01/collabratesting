//WAS TO CLICK ON AN ELEMENT USING ID

package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTwelve {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("satya");;

	}

}
