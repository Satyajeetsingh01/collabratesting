package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class waitingImplicitly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		
		//ImplicitWait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.instagram.com/");
		  driver.findElement(By.name("username")).sendKeys("satya");
		
		
		//Explicitwait()
		/*WebDriverWait explicitWait = new WebDriverWait(driver,10);
		driver.get("https://www.instagram.com/");             
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("satya");*/
		
		//Fluentwait
		/*FluentWait fWait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(300, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		driver.get("https://www.instagram.com/");
		fWait.until(ExpectedConditions.titleIs(""));
		driver.findElement(By.name("username")).sendKeys("satya");*/
		  
		
		
		

	}

}
