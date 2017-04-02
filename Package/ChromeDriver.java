package Package;

import org.openqa.selenium.WebDriver;

public class ChromeDriver {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver= (WebDriver) new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	}

	public Object manage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object findElementByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
