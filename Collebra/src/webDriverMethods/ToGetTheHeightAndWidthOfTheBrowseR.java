package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheHeightAndWidthOfTheBrowseR {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		Dimension dimension=driver.manage().window().getSize();
		int height=dimension.getHeight();
		int width=dimension.getWidth();
		System.out.println("Height:"+height+"Width :"+width);
	}

}
