package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageObjectManager;
import manager.TestContext;
import pageLayer.CheckoutCompletePage;
import pageLayer.CheckoutOverviewPage;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.YourCartPage;
import pageLayer.YourInformationPage;

public class BuyProductSteps {

	WebDriver driver;
	TestContext testcontext;
	
	 LoginPage loginpage_obj;
	 HomePage homepage_obj;
	 YourCartPage yourcartpage_obj;
	 YourInformationPage informationPage_obj;
	 CheckoutCompletePage checkoutcomplete_obj;
	 CheckoutOverviewPage checkoutOverview_obj;
	

	 
	 public BuyProductSteps(TestContext context) 
	 {
		 	testcontext = context;
		 	driver = testcontext.getWebDriverManager().getDriver(); 	
			loginpage_obj = testcontext.getPageObjectManager().getLoginPage();
			homepage_obj =  testcontext.getPageObjectManager().getHomePage();
			yourcartpage_obj =  testcontext.getPageObjectManager().getYourCartPage();
			informationPage_obj =  testcontext.getPageObjectManager().getYourInfoPage();
			checkoutcomplete_obj =  testcontext.getPageObjectManager().getCheckoutComplete();
			checkoutOverview_obj = 	 testcontext.getPageObjectManager().getCheckoutOverview();
		 
	 }
	

//	@When("enter username and password and click on login button")
//	public void enter_username_and_password_and_click_on_login_button() 
//	{
//		loginpage_obj.enterUsername("standard_user");
//		loginpage_obj.enterPassword("secret_sauce");
//		loginpage_obj.clickOnLoginButton();
//	}
//	
	@When("click on Add to cart button")
	public void click_on_add_to_cart_button() throws InterruptedException 
	{	
		homepage_obj.clickOnAddToCartButton();
		Thread.sleep(2000);
	}
	
	@When("click on cart icon and click checkout button")
	public void click_on_cart_icon_and_click_checkout_button() throws InterruptedException 
	{
		homepage_obj.clickOnCartIcon();
		yourcartpage_obj.clickOnCheckoutButton();
		Thread.sleep(2000);
	}
	
	@When("enter name and postal code")
	public void enter_name_and_postal_code() throws InterruptedException 
	{	
		informationPage_obj.enterFirstname();
		informationPage_obj.enterLastname();
		informationPage_obj.enterPostalCode();
		Thread.sleep(2000);
	}
	
	@When("click on continue button and finish button")
	public void click_on_continue_button_and_finish_button() throws InterruptedException 
	{
		informationPage_obj.clickOnContinueButton();
		checkoutOverview_obj.clickOnFinishButton();
		Thread.sleep(2000);
	}
	
	@Then("varify order placed sucessfuly")
	public void varify_order_placed_sucessfuly() 
	{
		String Expected_Result = "Thank you for your order!";
		String Actual_Result= checkoutcomplete_obj.getSuccessPurchaseMsg();
		Assert.assertEquals(Expected_Result, Actual_Result);
	}
}
