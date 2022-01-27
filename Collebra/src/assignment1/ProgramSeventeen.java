//WAS TO GET LINKTEXT OF THE ELEMENT

package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramSeventeen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		WebElement getLinkText = driver.findElement(By.linkText("Forgotten password?"));
		System.out.println(getLinkText);

	}

}
