package stepDefinations;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import manager.TestContext;

public class AppHooks {
	
	private TestContext testcontext;
	public AppHooks(TestContext context)
	{
		testcontext = context;
	}
	
	@Before()
	public void setUp() 
	{
		WebDriver driver = testcontext.getWebDriverManager().getDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@After()
	public void tearDown(Scenario scenario) throws IOException 
	{
		
		if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) testcontext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName().replaceAll(" ", "_"));
            
   		 File screenshot1 = ((TakesScreenshot) testcontext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
         String folderPath = "D:\\RestAssured\\BddFrameWork\\Screenshots\\";
         String fileName = scenario.getName().replaceAll(" ", "_") + ".png";
         FileHandler.copy(screenshot1, new File(folderPath + fileName));
         
        }
	

		testcontext.getWebDriverManager().getDriver().quit();
	}	

}