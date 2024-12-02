package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage {
	
	public YourInformationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------OBJ Creation-------------------
	
	@FindBy(xpath=("//input[@id='first-name']"))
	private WebElement firstName;
	
	@FindBy(xpath=("//input[@id='last-name']"))
	private WebElement lastName;
	
	@FindBy(xpath=("//input[@id='postal-code']"))
	private WebElement postalCode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continue_button;
	
	//--------------Method Creation-------------------
	
	public void enterFirstname() 
	{
		firstName.sendKeys("ranjit");
	}
	
	public void enterLastname() 
	{
		lastName.sendKeys("vadar");
	}
	
	public void enterPostalCode() 
	{
		postalCode.sendKeys("416225");
	}
	
	public void clickOnContinueButton() 
	{
		continue_button.click();
	}
}
