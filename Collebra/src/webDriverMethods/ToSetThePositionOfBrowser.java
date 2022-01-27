package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetThePositionOfBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.skillrary.com/");
				Point point=new Point(100,50);
                driver.manage().window().setPosition(point);

	}

}
