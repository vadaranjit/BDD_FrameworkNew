package manager;

public class TestContext {
	
	private WebDriverManager webdrivermanager;
	private PageObjectManager pageobjectmanager;
	
	public TestContext()
	{
		webdrivermanager= new WebDriverManager();
		pageobjectmanager = new PageObjectManager(webdrivermanager.getDriver());
	}
	
	public WebDriverManager getWebDriverManager() 
	{
		return webdrivermanager;
	}
	
	public PageObjectManager getPageObjectManager() 
	{
		return pageobjectmanager;
	}
}
