package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover 
{
	@Test
	public void hover()
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Actions actions = new Actions(driver);
	    actions
	    .moveToElement(driver.findElement(By.id("menu_admin_Organization")))
	    .moveToElement(driver.findElement(By.id("menu_admin_viewLocations")))
	    .click()
	    .perform();
	}
}
	


