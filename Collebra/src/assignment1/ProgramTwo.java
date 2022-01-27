//WAS TO PERFORM BROWSER NAVIGATION, FORWARD ,BACK AND REFRESH
package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		

	}

}
