package IntializeBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElements {
	WebDriver driver;
	@BeforeTest
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Tools\\MavenWorkspace\\PulseApplication\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");		
		}
	@Test(enabled=false)
	public void getElements()
	{
		List<WebElement> elements = driver.findElements(By.name("name"));
		System.out.println("Number of Elements :" + elements.size());
		
		for(int i=0;i<elements.size();i++) {
			System.out.println("Radio button text :" + elements.get(i).getAttribute("value"));	
	}
	}

}
