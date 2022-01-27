package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMakeBrowserWindowFullscreen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
	 

	}

}
