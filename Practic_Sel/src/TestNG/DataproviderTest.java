package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	
	@DataProvider(name="data")
	public Object[][]dataprovider(){
	 Object[][]obj=new Object[2][2];
	 obj[0][0]="akash";
	 obj[0][1]="akash12";
	 obj[1][0]="vrushabh";
	 obj[1][1]="vrushabh12";
	 
	 
	return obj;
	
	}
	@Test(dataProvider="data")
	public void logintest(String username,String password) {
		System.out.println("username is" +username+" "+"password is"+password);
		
	}
}
