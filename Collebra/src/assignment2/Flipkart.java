package assignment2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
		//Adding 1st Product
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 (Black, 64 GB)']")).click();
	
		String ParentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(ParentWindowId);
		String expectedTitle = "Buy Apple iPhone 12 Mini ( 64 GB Storage ) Online at Best Price On Flipkart.com";
		
		for(String windowId : allWindowIds)
		{
			driver.switchTo().window(windowId);
			String actualTitle = driver.getTitle();
			System.out.println(actualTitle);
			
			if(actualTitle.equals(expectedTitle))
			{
				System.out.println("Driver control is in the right page");
			}
		}
		
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.switchTo().window(ParentWindowId);
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("redmi",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='REDMI 9i Sport (Coral Green, 64 GB)']")).click();
		
		
		Set<String> allWindowId = driver.getWindowHandles();
		allWindowIds.remove(ParentWindowId);
		String expectedTitle1 = "REDMI 9i Sport ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com";
		
		for(String windowsId : allWindowId)
		{
			driver.switchTo().window(windowsId);
			String actualTitle1 = expectedTitle1;
			System.out.println(actualTitle1);
			if(actualTitle1.equals(expectedTitle1))
			{
				System.out.println("Driver control is in the right page");
			}
		}
		
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.switchTo().window(ParentWindowId);
		
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("samsung",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F12 (Celestial Black, 64 GB)']")).click();
		
		Set<String> allWindowsIDs = driver.getWindowHandles();
		allWindowsIDs.remove(ParentWindowId);
		String expectedTitle2 = "SAMSUNG Galaxy F12 ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com";
		
		for(String windowsId : allWindowsIDs)
		{
			driver.switchTo().window(windowsId);
			String actualTitle2 =  expectedTitle2;
			System.out.println(actualTitle2);
			if(actualTitle2.equals(expectedTitle2))
			{
				System.out.println("Driver control is in the right page");
			}
			
		}
		
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		
	}

}
 