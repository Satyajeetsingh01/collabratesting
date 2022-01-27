package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLocateAnElementUsingClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		
		WebElement categoriesButton = driver.findElement(By.className("dropdown-toggle"));
		categoriesButton.click();
		
		//driver.findElement(By.name("q")).sendKeys("cs");;
		//searchElement.sendKeys("computer science");
		
		
		
	}

}
