package TestNG;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	@Test()
	@Parameters({"username","password"})
	public void LoginTest(String username,String password) {
	System.out.println("username is=="+username);
	System.out.println("password is=="+password);
}
}
