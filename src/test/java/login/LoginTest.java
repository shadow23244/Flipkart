package login;

import java.sql.Driver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utils.LoginUtils;

public class LoginTest {
	
	public LoginUtils loginUtils;
	public LoginTest() {
		loginUtils = new LoginUtils();
	}
	
	@BeforeClass
	public void intializeBrowser() {
		loginUtils.initializeDriver();
		loginUtils.driver.get("https://www.flipkart.com/");
	}

	@Test
	public void sampleTest() {
		// This is a placeholder test. Add your test logic here.
		System.out.println("Sample test executed.");
	}


}
