package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.AdditemPage;

public class AdditemTest extends BaseClass {

	@Test(groups = { "valid" })
	public void addtobasket() throws InterruptedException {
		
		driver.get("https://practice.automationtesting.in/");
		AdditemPage atb = new AdditemPage(driver);
		logger.info("Click on Shop");
		atb.openShopPage();
		atb.clickAddToBasket();
		atb.clickViewBasket();
		Thread.sleep(5000);
		String item = atb.item.getText();
		Thread.sleep(5000);
		Assert.assertTrue(item.equals("HTML5 WebApp Develpment"));

	}
}
