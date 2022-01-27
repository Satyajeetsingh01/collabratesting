package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ToReadDataFromExternalFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//File abs = new File("E:\\Selenium\\first.txt");
		//System.out.println(abs);
		
		/*FileInputStream fis = new FileInputStream("E:\\Selenium\\first.txt");
		int data=fis.read();
		System.out.println((char)data);*/
		
		FileInputStream fis = new FileInputStream("E:\\Selenium\\first.txt");
		int data=fis.read();
		while(data!=-1)
		{
			System.out.print((char)data);
			//update
			data=fis.read();
			Thread.sleep(1000);
		}
		
		

	}

}
