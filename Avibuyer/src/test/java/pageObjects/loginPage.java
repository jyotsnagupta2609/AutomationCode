package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	public WebDriver ldriver;
	
	public loginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="txtLogIn")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement submit;
	
	public void setUserName(String uname) {
		username.clear();
		username.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	public void clickLogin() {
		submit.click();
	}

}
