package pageObjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegisterPage {
		
		WebDriver driver;
		public RegisterPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
			
		}

		@FindBy(how = How.XPATH , using = "//*[@id=\"menu-item-50\"]/a")
		WebElement myAccount;
		
		@FindBy(id="reg_email")
		WebElement txtEmail;
		
		@FindBy(id="reg_password")
		WebElement txtPassword;
		
		@FindBy(name="register")
		WebElement registerBtn;
		
		public void openMyAccountPage() {
			 
			myAccount.click();
		}
		
		
		public void enterEmail(String email)
		{
			txtEmail.sendKeys(email);
		}
		
		public void enterPassword(String pwd)
		{
			txtPassword.sendKeys(pwd);
		}
		
		public void clickRegisterBtn()
		{
			registerBtn.click();
		}
	
}
