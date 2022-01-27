package testNG_advanced;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	String EXCEL_PATH = "./test_Resource/testData.xlsx";
	public File absPath=new File(EXCEL_PATH);
	public Workbook workbook=null;
	
	
	 /**
	    * This method is used to read String data from an excel file
	    * @param sheetName provide the sheet name where you have the test data
	    * @param rowNum  provide the rowNum where you have test data
	    * @param cellNum provide the sheet name where you want to read
	    * @return it return the data in that respective sheet, row,cell in the form of string
	    */
	
	public String readStringData(String sheetName, int rowNum, int cellNum)
	{
		try {
			FileInputStream fis=new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	
	/**
	    * This method is used to read Boolean data from an excel file
	    * @param sheetName provide the sheet name where you have the test data
	    * @param rowNum  provide the rowNum where you have test data
	    * @param cellNum provide the sheet name where you want to read
	    * @return it return the data in that respective sheet, row,cell in the form of string
	    */
	
	
	public boolean readBooleanData(String sheetName, int rowNum, int cellNum)
	{
		try 
		{
			FileInputStream fis=new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		    
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (EncryptedDocumentException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
	}
	
	/**
	    * This method is used to read Numeric data from an excel file
	    * @param sheetName provide the sheet name where you have the test data
	    * @param rowNum  provide the rowNum where you have test data
	    * @param cellNum provide the sheet name where you want to read
	    * @return it return the data in that respective sheet, row,cell in the form of string
	    */
	
	public double readNumberData(String sheetName, int rowNum, int cellNum)
	{
		try {
			FileInputStream fis=new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}
	
	/**
	    * This method is used to read Date data from an excel file
	    * @param sheetName provide the sheet name where you have the test data
	    * @param rowNum  provide the rowNum where you have test data
	    * @param cellNum provide the sheet name where you want to read
	    * @return it return the data in that respective sheet, row,cell in the form of string
	    */
	
	public Date readDateData(String sheetName, int rowNum, int cellNum)
	{
		try {
			FileInputStream fis=new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getDateCellValue();
	}
	
	public String readAnyDataFromExcelInString(String sheetName, int rowNum, int cellNum)
	{
		try {
			FileInputStream fis=new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
	}
	
	public String[][] getMultipleData(String sheetName)
	{
		try {
			FileInputStream fis=new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int phyRowCount = workbook.getSheet(sheetName).getPhysicalNumberOfRows();
		int	phyCellCount = workbook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();
		
		String[][] sarr = new String[phyRowCount][phyCellCount];
		
		for(int i=0;i<phyRowCount;i++)
		{
			for(int j=0;j<phyCellCount;j++) 
			{
				sarr[i][j] = workbook.getSheet(sheetName).getRow(i).getCell(j).toString();
			}
		}
		return sarr;
	}
	
}

