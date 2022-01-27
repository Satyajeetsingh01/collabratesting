package contacts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_contacts_001 {
	
	@Test
	public void demo()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}

}
