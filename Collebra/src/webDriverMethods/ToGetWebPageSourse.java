package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWebPageSourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		String titleOfThePage=driver.getPageSource();
        System.out.println(titleOfThePage);

	}

}
