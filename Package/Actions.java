package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.westernunion.com/us/en/home.html");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementByXPath(".//span[@class='btn-secondary btn btn-block']").click();
		/*WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
		we use it when we fing by id*/
		
		driver.findElementById("country").click();
		
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElementByXPath(".//span[contains(text(),'India')]").click();
		Thread.sleep(5000);
		driver.quit();
	}

}

/*driver.findElementById("txtSendAmount").clear();
driver.findElementById("txtSendAmount").click();
driver.findElementById("txtSendAmount").sendKeys("500");*/
/*driver.navigate().back();
driver.navigate().forward();*/
//driver.navigate().refresh();