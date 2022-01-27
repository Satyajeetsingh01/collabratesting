package webDriverMethods;

import java.net.MalformedURLException;
//import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistory {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.skillrary.com/");
		Thread.sleep(2000);
		driver.get("https://www.zomato.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		//URL url=new URL("https://www.zomato.com/");
		//driver.navigate().to("https://www.zomato.com/");

	}

}
