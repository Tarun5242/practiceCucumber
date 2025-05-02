package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Log in']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(linkText="Logout")
	@CacheLookup
	WebElement lnklg;
	
	public void SetEmail(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	public void setpassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
	}
	public void clicklogin() {
		btnLogin.click();
	}
	public void clicklogout() {
		lnklg.click();
	}
	
	

}
