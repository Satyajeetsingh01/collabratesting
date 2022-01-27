//WAS TO MOVE THE WINDOW TO THESE COORDINATES(100,50)
package assignment1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Point point=new Point(100,50);
        driver.manage().window().setPosition(point);
	}

}
