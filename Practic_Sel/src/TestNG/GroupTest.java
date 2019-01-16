   package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups= {"Sanity","regression","database"})
	public void setup() {
		System.out.println("(groups= {Sanity,regression,database})");
		
	}
	@Test(groups= {"Sanity","regression"})
	public void test() {
		System.out.println("(groups= {Sanity,regression})");
		
	}
	
	@Test(groups= {"Sanity","database"})
	public void test1() {
		System.out.println("(groups= {Sanity,database})");
	}
	
	@Test(groups= {"Sanity"})
	public void test2() {
		System.out.println("(groups= {Sanity})");
	}
	@Test(groups= {"database"})
	public void test3() {
		System.out.println("(groups= {database})");
	}
}
