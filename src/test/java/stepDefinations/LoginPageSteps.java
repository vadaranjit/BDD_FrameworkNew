package stepDefinations;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTable.TableConverter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageObjectManager;
import manager.TestContext;
import manager.WebDriverManager;
import pageLayer.CheckoutCompletePage;
import pageLayer.CheckoutOverviewPage;
import pageLayer.HomePage;
import pageLayer.LoginPage;
import pageLayer.YourCartPage;
import pageLayer.YourInformationPage;


public class LoginPageSteps {
	
	 private WebDriver driver;	 
	 private TestContext testcontext;
	 
	 LoginPage loginpage_obj;
	 
	 public LoginPageSteps(TestContext context)
	 {
		 testcontext = context;
		 driver = context.getWebDriverManager().getDriver();
	 } 
	 
	@Given("lonch the browser and open Url")
	public void lonch_the_browser_and_open_url() 
	{
//		driver = testcontext.getWebDriverManager().getDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//----------OBJ Cretion-------------
		loginpage_obj = testcontext.getPageObjectManager().getLoginPage();

		
		
	}

	@When("enter username and password and click on login button")
	public void enter_username_and_password_and_click_on_login_button() 
	{
		loginpage_obj.enterUsername("standard_user");
		loginpage_obj.enterPassword("secret_sauce");
		loginpage_obj.clickOnLoginButton();
	}
	
	// login with direct approch
	
	@When("enter username as {string} and password as {string} and click on login button")
	public void enter_username_as_and_password_as_and_click_on_login_button(String username, String password) 
	{		
		loginpage_obj.enterUsername(username);
		loginpage_obj.enterPassword(password);
		loginpage_obj.clickOnLoginButton();
	}
	
	//Login With Outile and Example concept
	
	@When("enter userName as {string} and passWord as {string} and click on login button")
	public void enter_user_name_as_and_pass_word_as_and_click_on_login_button(String username, String password)
	{	
		loginpage_obj.enterUsername(username);
		loginpage_obj.enterPassword(password);
		loginpage_obj.clickOnLoginButton();
	}

	//Login With Single line Data 
	@When("enter UserName and PassWord and click on login button")
	public void enter_user_name_and_pass_word_and_click_on_login_button(DataTable dataTable) 
	{
		List<List<String>> data = dataTable.asLists();
		loginpage_obj.enterUsername(data.get(0).get(0));
		loginpage_obj.enterPassword(data.get(0).get(1));
		loginpage_obj.clickOnLoginButton(); 
	}
	
	
	@Then("user is logged in")
	public void user_is_logged_in()
	{	String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@Given("I have the following users:")
	public void i_have_the_following_users(DataTable dataTable) {
	    
	    
	}
}
