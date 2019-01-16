package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	//HARD ASSERTION
/*	
 @Test
 public void test() {
	 
	 String name="Akash Shinde";
	 System.out.println("test 1 start");
	 Assert.assertTrue(name.contains("Vijay"),"name is not matching ");
	 System.out.println("test 1 completed");
	 
 }
 @Test
 public void test2() {
	 System.out.println("test 2 started");
	 Assert.assertTrue(false);
	 System.out.println("test 2 completed");
 }*/
	
	//SOFT ASSERTION
	@Test
	public void softassert() {
		SoftAssert assertion = new SoftAssert();
		
		String name="Akash Shinde";
		System.out.println("test 1 started");
		Assert.assertEquals(12, 13);
		System.out.println("test 1 ended");
		assertion.assertAll();
		
	}
	
	
}
