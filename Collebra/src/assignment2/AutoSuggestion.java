package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.google.com/"); 
		
		driver.findElement(By.name("q")).click();
		List<WebElement> listOfSuggestions = driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]"));
		List<WebElement> dataForSuggestions = driver.findElements(By.xpath("//li[@role='presentation' and @jsaction]"));
		
		System.out.println(listOfSuggestions.size());
		
		for(WebElement ele : dataForSuggestions)
		{
			System.out.println(ele.getText());
		}
		
		

	}

}
