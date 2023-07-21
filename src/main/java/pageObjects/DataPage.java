package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DataPage {

WebDriver driver;
	
	public DataPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"menu-item-251\"]/a")
	WebElement demoSite;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/a")
	WebElement more;
	
	@FindBy(how = How.XPATH , using = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/ul/li[2]/a")
	WebElement dynamicdata;
	
	@FindBy( id=  "save")
	WebElement getdynamicdataBtn;
	
	public void openDemoSitePage() {
		 
		demoSite.click();
	}
	
	public void clickMore() {
		 
		more.click();
	}
	
	public void clickdynamicdata()
	{
		dynamicdata.click();
	}
	
	public void clickgetdynamicdataBtn()
	{
		getdynamicdataBtn.click();
	}
}
