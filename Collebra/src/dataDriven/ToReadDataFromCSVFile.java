package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class ToReadDataFromCSVFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("./testResources/testData.csv");
		
		CSVReader csvReader = new CSVReader(fr);
		
		//Read everthing
		/*List<String[]> allData = csvReader.readAll();
		for(String[] sarr : allData)
		{
			for(String d : sarr)
			{
				System.out.println(d);
			}
		}
		
		//Throw null pointerException
		String[] data = csvReader.readNext();
		for(String d : data)
		{
			System.out.println(d);
		}*/
		
		//directly read
		/*String[] usernameData = csvReader.readNext();
		System.out.println(usernameData[1]);
		
		String[] passwordData = csvReader.readNext();
		System.out.println(passwordData[1]);*/
		
		List<String[]> usernameData = csvReader.readAll();
		System.out.println(usernameData.size());
		String[] lineData = usernameData.get(3);
		System.out.println(lineData[1]);
		
		
		//read next full line
		/*String[] data = csvReader.readNext();
		for(String d : data)
		{
			System.out.println(d);
		}
		
		String[] data2 = csvReader.readNext();
		for(String d : data2)
		{
			System.out.println(d);
		}
		
		String[] data3 = csvReader.readNext();
		for(String d : data3)
		{
			System.out.println(d);
		}*/
		
		

	}

}
