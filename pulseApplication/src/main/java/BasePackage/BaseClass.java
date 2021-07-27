package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	@Test
	public void initBrowser() {
	 System.setProperty("webdriver.chrome.driver", "D:\\Study\\Automation_Stuff\\Ofc_Project\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.pulse.datamatics.com/");
		driver.findElement(By.name("emp_code")).clear();
		driver.findElement(By.name("emp_code")).sendKeys("36963");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Majesco@12345");
		driver.findElement(By.id("button")).click();	
		driver.close();
	}

}
