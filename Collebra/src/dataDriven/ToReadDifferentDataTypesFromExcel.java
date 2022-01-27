package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDifferentDataTypesFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
        FileInputStream fis = new FileInputStream("./testResources/testData.xlsx");
		
		Workbook workBook =  WorkbookFactory.create(fis);
		Row row1 = workBook.getSheet("sheet1").getRow(1);
		String data1 = row1.getCell(2).getStringCellValue();
		boolean data2 = row1.getCell(3).getBooleanCellValue();
		Date data3 = row1.getCell(4).getDateCellValue();
		LocalDateTime data4 = row1.getCell(4).getLocalDateTimeCellValue();
		double data5 = row1.getCell(5).getNumericCellValue();
		
		System.out.println(data1+","+data2+","+data3+","+data4+","+data5);
		

	}

}
