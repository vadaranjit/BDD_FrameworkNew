package manager;

import org.openqa.selenium.WebDriver;

import pageLayer.CheckoutCompletePage;
import pageLayer.CheckoutOverviewPage;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.YourCartPage;
import pageLayer.YourInformationPage;

public class PageObjectManager {
	
	private WebDriver driver;
	
	private LoginPage loginpage_obj;
	private HomePage homepage_obj;
	private YourCartPage yourcartpage_obj;
	private YourInformationPage informationPage_obj;
	private CheckoutCompletePage checkoutcomplete_obj;
	private CheckoutOverviewPage checkoutOverview_obj;
	
	public PageObjectManager (WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public LoginPage getLoginPage() 
	{
		if(loginpage_obj==null) 
		{
			loginpage_obj = new LoginPage(driver);
		}	
		return loginpage_obj;
	}
	
	public HomePage getHomePage() 
	{
		if(homepage_obj==null) 
		{
			homepage_obj = new HomePage(driver);
		}	
		return homepage_obj;
	}
	
	public YourCartPage getYourCartPage() 
	{
		if(yourcartpage_obj==null) 
		{
			yourcartpage_obj = new YourCartPage(driver);
		}	
		return yourcartpage_obj;
	}
	
	public YourInformationPage getYourInfoPage() 
	{
		if(informationPage_obj==null) 
		{
			informationPage_obj = new YourInformationPage(driver);
		}	
		return informationPage_obj;
	}
	
	public CheckoutCompletePage getCheckoutComplete() 
	{
		if(checkoutcomplete_obj==null) 
		{
			checkoutcomplete_obj = new CheckoutCompletePage(driver);
		}	
		return checkoutcomplete_obj;
	}
	
	public CheckoutOverviewPage getCheckoutOverview() 
	{
		if(checkoutOverview_obj==null) 
		{
			checkoutOverview_obj = new CheckoutOverviewPage(driver);
		}	
		return checkoutOverview_obj;
	}
	

}
