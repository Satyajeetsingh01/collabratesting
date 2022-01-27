//WAS TO CLOSE ONLY PARENT WINDOW IN NAUKRI.COM

package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		driver.close();

	}

}
