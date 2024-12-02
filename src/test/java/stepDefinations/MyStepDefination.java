//package stepDefinations;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.*;
//import manager.PageObjectManager;
//import pageLayer.CheckoutCompletePage;
//import pageLayer.CheckoutOverviewPage;
//import pageLayer.HomePage;
//import pageLayer.LoginPage;
//import pageLayer.YourCartPage;
//import pageLayer.YourInformationPage;
//
//public class MyStepDefination {
//	WebDriver driver;
//	PageObjectManager obj_manager;
//	
//	 LoginPage loginpage_obj;
//	 HomePage homepage_obj;
//	 YourCartPage yourcartpage_obj;
//	 YourInformationPage informationPage_obj;
//	 CheckoutCompletePage checkoutcomplete_obj;
//	 CheckoutOverviewPage checkoutOverview_obj;
//	
//	@Given("lonch the browser and open Url")
//	public void lonch_the_browser_and_open_url() 
//	{
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		//----------OBJ Cretion-------------
//		obj_manager = new PageObjectManager(driver);
//		loginpage_obj = obj_manager.getLoginPage();
//		homepage_obj = obj_manager.getHomePage();
//		yourcartpage_obj = obj_manager.getYourCartPage();
//		informationPage_obj = obj_manager.getYourInfoPage();
//		checkoutcomplete_obj = obj_manager.getCheckoutComplete();
//		checkoutOverview_obj = obj_manager.getCheckoutOverview();
//		
//	}
//
//	@When("enter username and password and click on login button")
//	public void enter_username_and_password_and_click_on_login_button() 
//	{
//		loginpage_obj.enterUsername("standard_user");
//		loginpage_obj.enterPassword("secret_sauce");
//		loginpage_obj.clickOnLoginButton();
//	}
//	
//	// login with direct approch
//	
//	@When("enter username as {string} and password as {string} and click on login button")
//	public void enter_username_as_and_password_as_and_click_on_login_button(String username, String password) 
//	{		
//		loginpage_obj.enterUsername(username);
//		loginpage_obj.enterPassword(password);
//		loginpage_obj.clickOnLoginButton();
//	}
//	
//	//Login With Outile and Example concept
//	
//	@When("enter userName as {string} and passWord as {string} and click on login button")
//	public void enter_user_name_as_and_pass_word_as_and_click_on_login_button(String username, String password)
//	{	
//		loginpage_obj.enterUsername(username);
//		loginpage_obj.enterPassword(password);
//		loginpage_obj.clickOnLoginButton();
//	}
//
//	//Login With Single line Data 
//	@When("enter UserName and PassWord and click on login button")
//	public void enter_user_name_and_pass_word_and_click_on_login_button(DataTable dataTable) 
//	{
//		List<List<String>> data = dataTable.asLists();
//		loginpage_obj.enterUsername(data.get(0).get(0));
//		loginpage_obj.enterPassword(data.get(0).get(1));
//		loginpage_obj.clickOnLoginButton(); 
//	}
//	
//	
//	@Then("user is logged in")
//	public void user_is_logged_in()
//	{	String expectedURL = "https://www.saucedemo.com/inventory.html";
//		String actualURL = driver.getCurrentUrl();
//		Assert.assertEquals(actualURL, expectedURL);
//	}
//	
//	//Buy Product
//	
//	@When("click on Add to cart button")
//	public void click_on_add_to_cart_button() throws InterruptedException 
//	{	
//		homepage_obj.clickOnAddToCartButton();
//		Thread.sleep(2000);
//	}
//	
//	@When("click on cart icon and click checkout button")
//	public void click_on_cart_icon_and_click_checkout_button() throws InterruptedException 
//	{
//		homepage_obj.clickOnCartIcon();
//		yourcartpage_obj.clickOnCheckoutButton();
//		Thread.sleep(2000);
//	}
//	
//	@When("enter name and postal code")
//	public void enter_name_and_postal_code() throws InterruptedException 
//	{	
//		informationPage_obj.enterFirstname();
//		informationPage_obj.enterLastname();
//		informationPage_obj.enterPostalCode();
//		Thread.sleep(2000);
//	}
//	
//	@When("click on continue button and finish button")
//	public void click_on_continue_button_and_finish_button() throws InterruptedException 
//	{
//		informationPage_obj.clickOnContinueButton();
//		checkoutOverview_obj.clickOnFinishButton();
//		Thread.sleep(2000);
//	}
//	
//	@Then("varify order placed sucessfuly")
//	public void varify_order_placed_sucessfuly() 
//	{
//		String Expected_Result = "Thank you for your order!";
//		String Actual_Result= checkoutcomplete_obj.getSuccessPurchaseMsg();
//		Assert.assertEquals(Expected_Result, Actual_Result);
//	}
//}
