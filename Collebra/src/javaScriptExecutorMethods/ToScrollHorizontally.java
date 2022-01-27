package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollHorizontally {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		
		//scrollBy and scrollTo method
		/*JavascriptExecutor js = (JavascriptExecutor) driver;  //typecasted
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,1500)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-500)"); //scroll in reverse direction*/
		
		
		//scrollIntoView Method
		WebElement elementScroll = driver.findElement(By.partialLinkText(" LEARN MORE"));
		JavascriptExecutor js = (JavascriptExecutor) driver;  //typecasted
		Thread.sleep(3000);
		js.executeScript(".arguments[0].scrollIntoView(true)",elementScroll);

	}

}
