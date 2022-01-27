package dataDriven;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/*
 * 
 * @author Satyajeet
 *
 */
public class ExcelLib {
	
	static String excelPath = "./testResources/testData.xlsx";
	
	 /**
	    * This method is used to read String data from an excel file
	    * @param sheetName provide the sheet name where you have the test data
	    * @param rowNum  provide the rowNum where you have test data
	    * @param cellNum provide the sheet name where you want to read
	    * @return it return the data in that respective sheet, row,cell in the form of string
	    */
	
	public static String readStringData(String sheetName, int rowNum, int cellNum)
	{
		Workbook workbook=null;;
		try {
			File absPath=new File(excelPath);
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
	
	
	public static boolean readBooleanData(String sheetName, int rowNum, int cellNum)
	{
		Workbook workbook=null;
		try 
		{
			File absPath=new File(excelPath);
			FileInputStream fis=new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		    
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (EncryptedDocumentException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
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
	
	public static double readNumberData(String sheetName, int rowNum, int cellNum)
	{
		Workbook workbook=null;;
		try {
			File absPath=new File(excelPath);
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
	
	public static Date readDateData(String sheetName, int rowNum, int cellNum)
	{
		Workbook workbook=null;;
		try {
			File absPath=new File(excelPath);
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
	
}
