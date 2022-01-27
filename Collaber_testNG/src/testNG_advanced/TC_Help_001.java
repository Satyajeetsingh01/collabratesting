package testNG_advanced;

import org.testng.annotations.Test;

public class TC_Help_001 {
	
	@Test(dataProviderClass=TC_TwoDArray_0011.class,dataProvider = "credentials")
	public void validateUsersModules(String[] data)
	{
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
