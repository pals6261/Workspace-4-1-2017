package Package;

import java.io.File;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Screenshot {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//taking screen shot using TakesScreenshot interface 
		//import org.openqa.selenium.TakesScreenshot;
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// saving the screenshot 
		File path = new File("C:\\selenium\\screenshot.jpg");
		try{
			FileUtils.copyFile(screenshot, path);
		}
		catch(Exception e)
		{
			System.out.println("File did not save: "+e.getMessage());
			
		}
		driver.close();
		
	}
	
}
