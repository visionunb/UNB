package Basic_Sel;

import org.apache.poi.xssf.eventusermodel.XSSFBReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	//XPATH FOR COMPANY NAME	
		//*[@id='customers']/tbody/tr[2]/td[1]
		//*[@id='customers']/tbody/tr[3]/td[1]
		//*[@id='customers']/tbody/tr[7]/td[1]
		
	String Beforexpath_com="//*[@id='customers']/tbody/tr["	;
	String Afterxpath_com="]/td[1]"	;
	
	
	String Beforexpath_con="//*[@id='customers']/tbody/tr[";
	String Afterxpath_con="]/td[2]"	;
	
	String Beforexpath_cou="//*[@id='customers']/tbody/tr[";
	String Afterxpath_cou="]/td[3]"	;
	

	for(int i=2;i<=7;i++) {
		String actualpath=Beforexpath_com+i+Afterxpath_com;
		String companyname = driver.findElement(By.xpath(actualpath)).getText();
		System.out.println(companyname);
		
		String actualcontact=Beforexpath_con+i+Afterxpath_con;
		String contactname = driver.findElement(By.xpath(actualcontact)).getText();
		System.out.println(contactname);
		
		String actualcountry=Beforexpath_cou+i+Afterxpath_cou;
		String countryname = driver.findElement(By.xpath(actualcountry)).getText();
		System.out.println(countryname);
	}
		
	}

}
