package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdditemPage {

WebDriver driver;
	
	public AdditemPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	@FindBy(how = How.XPATH , using = "//a[contains(text(),'Shop')]")
	WebElement shop;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"content\"]/ul/li[4]/a[2]")
	public
	WebElement additemtobasket;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"content\"]/div[2]/a")
	WebElement viewbasket;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[3]/a")
	public
	WebElement item;
	
	public void openShopPage() {
		 
		shop.click();
	}
	
	public void clickAddToBasket() {
		 
		additemtobasket.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
	}
	
	public void clickViewBasket()
	{
		viewbasket.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
	}
	
}
