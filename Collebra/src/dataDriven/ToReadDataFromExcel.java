package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		
		FileInputStream fis = new FileInputStream("./testResources/testData.xlsx");
		
		Workbook workBook = /*new HSSFWorkbook();*/ WorkbookFactory.create(fis); //.xlx or xlsx
		
		
		String data = workBook.getSheet("Sheet1").getRow(3).getCell(4).toString();
		System.out.println(data);

	}

}
