package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseParentWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.close();

	}

}
