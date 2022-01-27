//WAS TO CLICK ON AN ELEMENT USING NAME

package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramThirteen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.actitime.com/login.do");
		
		driver.findElement(By.name("pwd")).sendKeys("1234");

	}

}
