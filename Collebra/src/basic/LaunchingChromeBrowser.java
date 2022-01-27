package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"./Drivers/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        
        //System.setProperty("webdriver.gecko.driver", 
				//"C:\\Users\\Satya\\OneDrive\\Desktop\\selenium\\selenium downloads\\geckodriver.exe");
        //FirefoxDriver driver1=new FirefoxDriver();
	}

	}


