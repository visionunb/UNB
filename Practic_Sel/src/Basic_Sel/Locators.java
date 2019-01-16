package Basic_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;


public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		  
		driver.navigate().to("https://www.facebook.com/");
		
	//by ID
	//	driver.findElement(By.id("email")).sendKeys("akki3001");
//		driver.findElement(By.id("pass")).sendKeys("3001");
	
	//by name	
		//driver.findElement(By.name("email")).sendKeys("akash");
		//driver.findElement(By.name("pass")).sendKeys("abcd");
		
	//by xpath
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("akash");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("akash");
	}

}
