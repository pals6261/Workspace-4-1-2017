package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxChecked {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		
		driver.findElement(By.id("Email")).sendKeys("ramyar.automation@gmail.com");
		
		driver.findElement(By.id("next")).click();
		
		// steps to find checkbox checked
		boolean ischecked;
		ischecked = driver.findElement(By.id("PersistentCookie")).isSelected();
		System.out.println(" CheckBox checked? : "+ischecked);
		driver.close();
		
	}

}
