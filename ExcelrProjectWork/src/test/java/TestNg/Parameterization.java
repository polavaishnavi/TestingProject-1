package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
	@Parameters({"username","password"})
	@Test
	public void loginTest(String uname, String pwd) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		driver.quit();
	}
	
	@Parameters("browser")
	@Test
	public void printBrowserName(String browser)
	{
		System.out.println(browser);
	}
	
}




