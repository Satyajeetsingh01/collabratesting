package webDriverMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToEnterDataInToActiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/"); 
		
		WebElement activeElement = driver.switchTo().activeElement();
		System.out.println(activeElement.getTagName());
		

	}

}
