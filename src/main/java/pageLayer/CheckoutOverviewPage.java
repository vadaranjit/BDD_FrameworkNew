package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
	
	public CheckoutOverviewPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------OBJ Creation-------------------
	
	@FindBy(xpath=("//button[@id='cancel']"))
	private WebElement cancel_button;
	
	@FindBy(xpath=("//button[@id='finish']"))
	private WebElement finish_Button;
	
	
	//--------------Method Creation-------------------
	
	public void clickOnCancelButton() 
	{
		cancel_button.click();
	}
	
	public void clickOnFinishButton() 
	{
		finish_Button.click();
	}
}
