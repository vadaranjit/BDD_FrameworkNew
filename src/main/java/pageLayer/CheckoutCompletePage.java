package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {
	
	public CheckoutCompletePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------OBJ Creation-------------------
	
	@FindBy(xpath=("//h2[contains(text(),'Thank you for your order!')]"))
	private WebElement success_msg;
	
	//--------------Method Creation-------------------
	
		public String getSuccessPurchaseMsg() 
		{
			String msg = success_msg.getText();
			return msg;
		}
	
}
