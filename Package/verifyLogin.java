package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ramyareddyrakasi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mamatha");
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
