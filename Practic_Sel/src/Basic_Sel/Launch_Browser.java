package Basic_Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		
	//Firefox Launch	
		//WebDriver driver=new FirefoxDriver();
		
	//Chrome Launch
		System.setProperty("webdriver.chrome.driver","G:\\Software testing\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();			
		
		
	//IE Launch	
	/*	System.setProperty("webdriver.ie.driver","G:\\Software testing\\iedriver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();    */
		
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

}
