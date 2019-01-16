package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Allannotation {

	@Test
  public void login() {
	  System.out.println("login");
  }
	
	@Test
	public void check() {
		System.out.println("check");
		
	}
	@Test
	public void signout() {
		System.out.println("signout");
		
	}
	
	
	
  @BeforeMethod
  public void beforeMethod() {
	  
	 System.out.println("beforem");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterm");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
	
  }
  @org.testng.annotations.BeforeSuite
  public void BeforeSuite() {
	  System.out.println("beforesuite");
  }
 

}
