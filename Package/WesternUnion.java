package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WesternUnion {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.westernunion.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//span[@class='btn-secondary btn btn-block']")).click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.id("country")).click();
	driver.findElement(By.xpath(".//span[contains(text(),'India')]")).click();
	
	driver.quit();
	
}
}