package IntializeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropDown {
	WebDriver driver;
	@Test
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Tools\\MavenWorkspace\\PulseApplication\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		//drpCountry.selectByVisibleText("ANTARCTICA");
		drpCountry.selectByIndex(2);
		//drpCountry.selectByVisibleText("Banana");
		//drpCountry.selectByValue(1);
		
	}

}
