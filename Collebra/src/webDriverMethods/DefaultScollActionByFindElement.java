package webDriverMethods;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultScollActionByFindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.urbanladder.com/");
		
		String text = driver.findElement(By.linkText("Careers")).getText();
		System.out.println(text);
		

	}

}
