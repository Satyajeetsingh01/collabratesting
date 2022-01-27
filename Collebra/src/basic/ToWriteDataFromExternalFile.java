package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ToWriteDataFromExternalFile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("E:\\Selenium\\second.txt");
		fos.write('a');
		fos.write('b');
		fos.write(' ');
		fos.write('c');
		fos.write('d');
		

	}

}
