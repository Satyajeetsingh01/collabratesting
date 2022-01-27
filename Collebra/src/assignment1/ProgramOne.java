//WAS TO GET THE TITLE,URL,PAGE SOURCE OF FLIPKART WEBSITE
package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
		
		String getCurrentUrl = driver.getCurrentUrl();
		System.out.println(getCurrentUrl);
		
		String getPgeSource = driver.getPageSource();
		System.out.println(getPgeSource);
		
		

	}

}
