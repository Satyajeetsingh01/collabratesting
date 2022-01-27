package testNG_advanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_SupportLoan_0011 {
	
	@DataProvider(name="SearchProducts",parallel = true)//By using parallel it will execute all the window at a time.
	public String[] sendMobileInfo()
	{
		Workbook workbook = null;
		try {
			FileInputStream fis = new FileInputStream("./test_Resource/testData.xlsx");
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Sheet dataSheet = workbook.getSheet("Sheet1");
		int rowCount = dataSheet.getPhysicalNumberOfRows();
		
		String[] arr = new String[rowCount];
		
		for(int i=0;i<rowCount;i++)
		{
		arr[i] = dataSheet.getRow(i).getCell(0).getStringCellValue();
      	}
		return arr;
	}
	
	@Test(dataProvider = "SearchProducts")
	public void ceateARequest(String mobileName)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobileName,Keys.ENTER);
		driver.quit();
	}
	


}
