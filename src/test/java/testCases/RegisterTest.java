package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.RegisterPage;

public class RegisterTest extends BaseClass {

	
	@Test(groups = { "valid" })
	public void register() throws Exception {
		
		driver.get("https://practice.automationtesting.in/");
		RegisterPage reg = new RegisterPage(driver);
		reg.openMyAccountPage();
		reg.enterEmail("adkf@gmail.com");
		reg.enterPassword("jfj#224");
		reg.clickRegisterBtn(); 
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().equals("My Account – Automation Practice Site"));
		
	}
	

}
