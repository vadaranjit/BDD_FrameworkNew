package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UtillClass.ReadConfig;

public class WebDriverManager {
	
	private ReadConfig read_config;
	private WebDriver driver;
	 
	public WebDriverManager() 
	{
		read_config = new ReadConfig();
	}
	
	public WebDriver createBrowser() 
	{
		String browser = read_config.getBrowserName();
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) 
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.print("Please Provide Correct Browser Name");
		}
		
		return driver;
	}
	
	public WebDriver getDriver() 
	{
		if(driver == null) 
		{
			driver = createBrowser();
		}
		return driver;
	}

}
