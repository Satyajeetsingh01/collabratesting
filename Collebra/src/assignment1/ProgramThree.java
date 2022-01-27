//WAS TO RESIZE THE WINDOW TO 100 WIDTH AND 200 HEIGHT

package assignment1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramThree {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Dimension dimension =new Dimension(100,200);
		driver.manage().window().setSize(dimension);

	}

}
