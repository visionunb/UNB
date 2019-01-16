package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest {

	@Test
	public void logintest() {
		WebDriver driver=new FirefoxDriver();
		Reporter.log("browser launch");
		driver.manage().window().maximize();
		Reporter.log("browser maximize ");
		
	}
}
