package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraNavBarElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.myntra.com/");
		
		List<WebElement> navElem1 = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		
		for(WebElement ele : navElem1)
		{
			System.out.println(ele.getText());
		}
		
		
		//Thread.sleep(5000);

	}

}
