package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ClickcasesPage {

	WebDriver driver;
	
	public ClickcasesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	@FindBy(how = How.XPATH , using = "//*[@id=\"menu-item-224\"]/a")
	WebElement testcases;
	
	@FindBy(how = How.XPATH , using = "	//*[@id=\"accordion-222-sub_row_1-0-1-0-0\"]/ul/li[1]/div[1]/a\r\n"
			+ "")
	public
	WebElement testcase1;
		
	public void openTestcasesPage() {
		 
		testcases.click();
	}
	
	public void clickTestCase1()
	{
		testcase1.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
	}
}
