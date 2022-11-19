package javaConcepts;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFileproperty {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		
		FileReader fileReader=new FileReader("config.properties");
		
		Properties properties=new Properties();
		properties.load(fileReader);
		
		String firefox= properties.getProperty("FirefoxBrowser");
		String chrome= properties.getProperty("chromeBrowser");
		String DriverLocation= properties.getProperty("driverlocation");
		
		if(chrome.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", DriverLocation );
			driver=new ChromeDriver();
		}
		else if(firefox.equals("firefox"))
				{
			System.setProperty("webdriver.chrome.driver", DriverLocation );
			driver=new FirefoxDriver();
				}
		
		driver.get("https://www.google.com");
		
	}

}
