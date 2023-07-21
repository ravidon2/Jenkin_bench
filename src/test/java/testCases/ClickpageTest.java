package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.ClickcasesPage;

public class ClickpageTest extends BaseClass {

	@Test
	public void testcase() throws InterruptedException {
		
		driver.get("https://practice.automationtesting.in/");
		ClickcasesPage tc = new ClickcasesPage(driver);
		tc.openTestcasesPage();
		Thread.sleep(5000);
		tc.clickTestCase1();
		Thread.sleep(5000);
		Assert.assertTrue(tc.testcase1.getText().equals("1. Home Page with three Sliders only"));
	}
}
