package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("http://www.guru99.com/software-testing.html");
((WebElement) driver.findElements(By.id("search_query_top"))).sendKeys("Agile");
WebDriverWait wait = new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_query_top")));
//waits 10 seconds until the icon is visible
driver.findElement(By.id("search_query_top")).click();
driver.close();
		
	}

}
