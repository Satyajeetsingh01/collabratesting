package assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {
		//Test Data
		String testUrl = "https://www.instagram.com/";
		String username = "SATYAJEET";
		String password = "SATYA123";
		String expectedLoginTitle = "";
		String expectedHomePageTitle ="";
		
		//Step1: Open the browser Enter the url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is launched successfully");
    	driver.manage().window().maximize();
    	System.out.println("Browser is maximized successfully");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get(testUrl);
    	String actualPageTitle = driver.getTitle();
    	if(actualPageTitle.equals(expectedLoginTitle))
    	{
    		System.out.println("login page is displayed successfully");
    	}
    	else
    	{
    		System.out.println("login page is not displayed successfully");
    	}
    	
    	//step 2:Enter Username into Username Textfield
         WebElement usernameTextField = driver.findElement(By.cssSelector("input[aria-label=\'Phone number, username, or email\']"));
          usernameTextField.clear();
          usernameTextField.sendKeys(username);
          String actualUserNameEntered = usernameTextField.getAttribute("value");
          if(actualUserNameEntered.equals(username))
          {
        	  System.out.println("username is entered successfully");
          }
          else
          {
        	  System.out.println("username is not entered successfully");
          }
          
       // step 3.Enter Password into Password TextField   
         WebElement passwordTextField = driver.findElement(By.cssSelector("input[aria-label=\'Password\']"));
         passwordTextField.clear();
         passwordTextField.sendKeys(password);
         String actualPasswordEntered = passwordTextField.getAttribute("value");
         if(actualPasswordEntered.equals(password))
         {
       	  System.out.println("password is entered successfully");
         }
         else
         {
       	  System.out.println("password is not entered successfully");
         }
         
       //step 4: Click on Login Button 
        driver.findElement(By.xpath("./html/body/div[1]/section/main/article/div[2]/div[1]/div[1]/form/div[1]/div[3]/button/div")).click();
        //explicitWait.until(ExpectedConditions.titleIs(expectedHomePageTitle))
        String actualHomePageTitle =driver.getTitle();
        if(actualPageTitle.equals(expectedHomePageTitle))
        {
        	System.out.println("homepage is launched successfully");
        }
        else
        {
        	System.out.println("homepage is not launched successfully");
        }
      
       driver.quit();

	}

}