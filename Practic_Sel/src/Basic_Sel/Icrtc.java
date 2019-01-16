package Basic_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Icrtc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","G:\\Software testing\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input")).sendKeys("Pune");
	driver.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("Mumbai");
	
	}

}
