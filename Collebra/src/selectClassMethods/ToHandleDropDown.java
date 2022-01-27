package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
		
		//TO CHECK MULTIPLE OR SINGLE DROP DOWN
		
		/*WebElement dayListBox = driver.findElement(By.id("day"));
		Select select = new Select(dayListBox);
		System.out.println(select.isMultiple());*/
		
		
		WebElement dayListBox = driver.findElement(By.id("day"));
		WebElement monthListBox = driver.findElement(By.id("month"));
		WebElement yearListBox = driver.findElement(By.id("year"));
		
		/*List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));
		for(WebElement ele : months)
		{
			System.out.println(ele.getText());
		}*/
		
		/*Select dayselect = new Select(dayListBox);
		System.out.println(dayselect.isMultiple());
		List<WebElement> dayListBoxOptions = dayselect.getOptions();
		for(WebElement ele : dayListBoxOptions)
		{
			System.out.println(ele.getText());
		}
		
		Select monthselect = new Select(monthListBox);
		System.out.println(monthselect.isMultiple());
		List<WebElement> monthListBoxOptions = monthselect.getOptions();
		for(WebElement ele : monthListBoxOptions)
		{
			System.out.println(ele.getText());
		}
		
		Select yearselect = new Select(yearListBox);
		System.out.println(yearselect.isMultiple());
		List<WebElement> yearListBoxOptions = yearselect.getOptions();
		for(WebElement ele : yearListBoxOptions)
		{
			System.out.println(ele.getText());
		}*/
		
		Select dayselect = new Select(dayListBox);
		System.out.println(dayselect.isMultiple());
		dayselect.selectByIndex(0);
		
		Select monthselect = new Select(monthListBox);
		System.out.println(monthselect.isMultiple());
		monthselect.selectByValue("12");
		
		Select yearselect = new Select(yearListBox);
		System.out.println(yearselect.isMultiple());
		yearselect.selectByVisibleText("2020");
		

	}

}
