//WAS TO GET THE CURRENT WINDOWID OF FACEBOOK.COM

package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	    String currentWindowId = driver.getWindowHandle();
	    System.out.println(currentWindowId);

	}

}
