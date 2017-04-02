package Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
	//by id
		driver.findElement(By.name("search_query_top")).sendKeys("DRESSES");
		
	//by name
		driver.findElement(By.name("search_query")).sendKeys("DRESSES");
		
	//by css selector
		driver.findElement(By.cssSelector(".search_query.form-control.ac_input")).sendKeys("DRESSES");
		
	//by class name
		driver.findElement(By.className("sf-with-ul")).click();
		
	//by tagname
		WebElement divisions=driver.findElement(By.className("columns-container"));
		List divlist= (List) divisions.findElement(By.tagName("div"));
		System.out.println("number of divisions inside class: columns-container are " +divlist.size());
		
	//by link text
		driver.findElement(By.linkText("Our stores")).click();
		
	//by partial link text
		driver.findElement(By.partialLinkText("slip")).click();
		
	//by xpath
		driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys("abc@xyz.com");
		
		
	}

}
