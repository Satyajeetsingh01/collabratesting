package selectClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Satya/Downloads/dropDown.html");
		
		WebElement multiSelectDropDown = driver.findElement(By.id("m1"));
		Select select = new Select(multiSelectDropDown);
		
		System.out.println(select.isMultiple());
		/*select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByIndex(3);
		select.selectByValue("1");
		Thread.sleep(2000);
		select.selectByVisibleText("Mango");
		Thread.sleep(2000);
		select.deselectByIndex(0);
		Thread.sleep(2000);
		select.deselectByValue("2");
		Thread.sleep(2000);
		select.deselectByVisibleText("Grapes");
		Thread.sleep(2000);
		select.deselectAll();*/
		
		select.selectByValue("7");
		Thread.sleep(2000);
		select.selectByValue("6");
		Thread.sleep(2000);
		select.selectByValue("5");
		Thread.sleep(2000);
		
		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());

	}

}
