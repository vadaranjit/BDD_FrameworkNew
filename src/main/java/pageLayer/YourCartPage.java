package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

	public YourCartPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------OBJ Creation-------------------
	
	@FindBy(xpath=("//button[@id='checkout']"))
	private WebElement checkout_button;
	
	@FindBy(xpath=("//button[@id='remove-sauce-labs-backpack']"))
	private WebElement remove_Button;
	
	
	//--------------Method Creation-------------------
	
	public void clickOnCheckoutButton() 
	{
		checkout_button.click();
	}
	
	public void clickOnRemoveButton() 
	{
		remove_Button.click();
	}
	
}
