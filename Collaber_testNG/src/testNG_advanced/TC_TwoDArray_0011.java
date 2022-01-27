package testNG_advanced;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_TwoDArray_0011 {
	
	@DataProvider
	public String[][] credentials() throws EncryptedDocumentException, IOException{
		ExcelLib lib = new ExcelLib();
		return lib.getMultipleData("Sheet2");
		
		/*FileInputStream fis = new FileInputStream("./test_Resource/testData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet dataSheet = workbook.getSheet("Sheet2");
		int rowCount = dataSheet.getPhysicalNumberOfRows();
		int colCount = dataSheet.getRow(0).getPhysicalNumberOfCells();
		
		String sarr[][] = new String[rowCount-1][colCount];
		
		for(int i=0,k=1;i<rowCount-1;i++,k++)
		{
			for(int j=0;j<colCount;j++) 
			{
				sarr[i][j] = dataSheet.getRow(k).getCell(j).toString();
			}
		}
		return sarr;*/
	}
	
	@Test(dataProvider="credentials")
	public void readMultipleDataFromExcel(String[] data)
	{
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		/*driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(data[0]);
		driver.findElement(By.name("pwd")).sendKeys(data[1]);
		driver.findElement(By.id("loginButton")).click();*/
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
		System.out.println(data[4]);
		System.out.println(data[5]);
		System.out.println(data[6]);
		System.out.println(data[7]);
		System.out.println(data[8]);
		System.out.println("==============================================");

}
}
