package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownList {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("June");
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByIndex(30);
		
		Select year= new Select(driver.findElement(By.id("year")));
		year.selectByValue("1993");
		
	}

}
