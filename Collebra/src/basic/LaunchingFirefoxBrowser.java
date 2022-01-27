package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", 
				"./Drivers/geckodriver.exe");
        FirefoxDriver driver1=new FirefoxDriver();
        driver1.get("https://www.flipkart.com/");

	}

}
