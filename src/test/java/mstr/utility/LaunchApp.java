package mstr.utility;
import mstr.config.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class LaunchApp {
	/*
Properties prop = new Properties();
	

	public void openBrowser(String browsernm) throws IOException
	{
		FileInputStream fis= new FileInputStream("F:\\Testing Workplace\\PageObjectModel\\config.properties");
	System.out.println(fis);
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{System.out.println("*****");
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeexepath"));
			Config.driver =new ChromeDriver();
			System.out.println("Chrome browser is opened successfully");
			
		}else if(prop.getProperty("browser").equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", prop.getProperty("ieexepath"));
			Config.driver= new InternetExplorerDriver();
			System.out.println("IE browser is opened successfully");
			
		}else
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxexepath"));
		    Config.driver = new FirefoxDriver();
		    System.out.println("Firefox browser is opened successfully");
		}
		
	}
	
	public void enterApplicationURL(String url)
	
	{
		Config.driver.get(url);
	}
	
	public void maximizeBrowser()
	{
		Config.driver.manage().window().maximize();
	}
	
	
	public void waittillLOginPageLoaded(int timeoutsecs)
	{
		Config.driver.manage().timeouts().pageLoadTimeout(timeoutsecs, TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) throws IOException
	{
		LaunchApp lc= new LaunchApp();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lc.maximizeBrowser();
		lc.waittillLOginPageLoaded(15);
		
	}
}	
	*/
	

	
	
	Properties prop  = new Properties();
	
	public void openBrowser(String browsernm) throws IOException 
	{
		FileInputStream fis= new FileInputStream("F:\\Testing Workplace\\PageObjectModel\\config.properties");  
		System.out.println(fis);
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeexepath"));
			Config.driver=  new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver", prop.getProperty("ieexepath"));
				Config.driver= new InternetExplorerDriver();
			}
			else
			{
				System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxexepath"));
				Config.driver = new FirefoxDriver();
			}
	}
	
	public void enterApplicationURL(String URL)
	{
		Config.driver.get(URL);
	}
	
	public void maximizeBrowser()
	{
		Config.driver.manage().window().maximize();
	}
	
	public void wailTillLoginPageLoad(int timeoutsecs)
	{
		Config.driver.manage().timeouts().pageLoadTimeout(timeoutsecs,TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) throws IOException
	{
		LaunchApp lapp= new LaunchApp();
		
		
		lapp.openBrowser("chrome");
		lapp.enterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lapp.maximizeBrowser();
		lapp.wailTillLoginPageLoad(15);
	}
	
}