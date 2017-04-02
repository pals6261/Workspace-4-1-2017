package Package;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class AssertVerify {
	
	// assert class can be found in testng and there is no verify in testng
		@Test
	public void testMethod() {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Bradley_University");
		
		String heading= driver.findElement(By.id("firstHeading")).getText();
		// assert will stop the execution if it fails.
		Assert.assertEquals(heading, "Bradley University");
		driver.close();
		}

}
