package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------OBJ Creation-------------------
	
	@FindBy(xpath=("//button[@id='react-burger-menu-btn']"))
	private WebElement threeLines_menu;
	
	@FindBy(xpath=("//a[@id='logout_sidebar_link']"))
	private WebElement logout_Button;
	
	@FindBy(xpath=("//button[@id='add-to-cart-sauce-labs-backpack']"))
	private WebElement addToCart_Button;
	
	@FindBy(xpath= ("//a[@class='shopping_cart_link']"))
	private WebElement cart_Icon;
	
	//--------------Method Creation-------------------
	
	public void clickOnThreeLineIcon() 
	{
		threeLines_menu.click();
	}
	
	public void clickOnLogoutLinkText() 
	{
		logout_Button.click();
	}
	
	public void clickOnAddToCartButton() 
	{
		addToCart_Button.click();
	}
	
	public void clickOnCartIcon() 
	{
		cart_Icon.click();
	}
}
