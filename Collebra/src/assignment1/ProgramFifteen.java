//WAS TO CLICK ON AN ELEMENT USING LINKTEXT

package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramFifteen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		

	}

}
