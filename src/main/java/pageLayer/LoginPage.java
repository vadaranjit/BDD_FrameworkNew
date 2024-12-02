package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------OBJ Creation-------------------
	
	@FindBy(xpath=("//input[@id='user-name']"))
	private WebElement userName;
	
	@FindBy(xpath=("//input[@id='password']"))
	private WebElement password;
	
	@FindBy(xpath=("//input[@id='login-button']"))
	private WebElement login_button;
	
	//--------------Method Creation-------------------
	
	public void enterUsername(String username) 
	{
		userName.sendKeys(username);
	}
	
	public void enterPassword(String password1) 
	{
		password.sendKeys(password1);
	}
	
	public void clickOnLoginButton() 
	{
		login_button.click();
	}
}
