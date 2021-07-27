package IntializeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class linkText {
	WebDriver driver;
	@Test
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Tools\\MavenWorkspace\\PulseApplication\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/link.html");
		//link Text
		//driver.findElement(By.linkText("click here")).click();
		
		//Partial link text
		driver.findElement(By.partialLinkText("here")).click();
		System.out.println("Page title is :" + driver.getTitle());
		driver.close();
}
}
