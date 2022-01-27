package takingScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingWebPageScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		//File tempFile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println(tempFile);
		
		//Thread.sleep(5000); // it will delete automatically when the program is terminated
		
		// TAKESS FOR WEBPAGE
		File destFile =new File("./errorshots/swiggy.png");
		FileUtils.copyFile(tempFile, destFile); //it replace your screenshot.
		//tempFile.renameTo(destFile);
		
		
		
		// TAKESS FOR ELEMENT
		/*File weScreenShot = driver.findElement(By.xpath("//a[.='FIND FOOD']")).getScreenshotAs(OutputType.FILE);
		File webDestFile = new File("./errorshots/element1.png");
		weScreenShot.renameTo(webDestFile);*/
		
		
		driver.findElement(By.id("")).findElement(By.name("")).findElement(By.id(""));
		

	}

}
