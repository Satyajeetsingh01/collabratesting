package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToTrello {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait explicitWait =new WebDriverWait()
		
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("satyajeetsingh.official@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Satya@123");
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[text()='Satyajeet']")).click();
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
		WebElement srcElement = driver.findElement(By.xpath("//span[text()='oops']"));
		WebElement dstElement = driver.findElement(By.xpath("//h2[text()='Java']/../..//span[text()='Add a card']"));
		
		//actions.dragAndDrop(srcElement, dstElement).perform(); //1st method
		
		//actions.dragAndDropBy(srcElement, 270, 158).perform(); //2nd method
		
		/*actions.clickAndHold(srcElement).moveByOffset(520, 157).perform(); //Third method
		Thread.sleep(3000);
		actions.release().perform(); //fourth method*/
		
		actions.clickAndHold(srcElement).perform(); //fifth method
		actions.release(dstElement).perform(); //sixth element 
		
		
		
		
		


	}

}
