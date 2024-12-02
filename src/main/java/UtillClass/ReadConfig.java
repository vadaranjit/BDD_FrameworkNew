package UtillClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		String path = "C:\\Users\\RANJIT\\eclipse-workspace\\BddFrameWork\\resources\\config.properties";
		try 
		{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	public String getApplicationUrl()
	{
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getBrowserName()
	{
		String browser = pro.getProperty("browser_name");
		return browser;
	}

}

