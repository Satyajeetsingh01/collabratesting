package testNG_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Loans_101 {                  //Testng Class
	
	@Test(priority=1)   //BY DEFAULT PRIORITY IS ZERO,IF IT IS SAME IT WILL GO ALPHABETICAL
	public void dell()                 //Test Case
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dell.com/");
		driver.quit();
	}
	
	@Test(priority=-1)
	public void lenskart()                 //Test Case
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://lenskart.com/");
		driver.quit();
	}
	
	
	//HOW TO RUN SAME TEST CASE FOR MULTIPLE TIME BY WHICH PARAMETER=====INVOCATIONCOUNT 
	//for parallel=========threadPoolSize
	//@Test(invocationCount = 4 , threadPoolSize = 5) //if invocation is zero it will not execute the test case
	//it will execute 2-2 times parallely
	@Test(invocationCount = 4 , threadPoolSize = 2 , enabled = false)  //used to display your test case  
	public void lenovo()                 //Test Case
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://lenovo.com/");
		driver.quit();
	}
	
	

}
