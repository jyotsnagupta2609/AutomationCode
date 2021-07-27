package IntializeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class radioAndCheckBox {
	WebDriver driver;
	@Test
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Tools\\MavenWorkspace\\PulseApplication\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		radio1.click();
		radio2.click();
		
		WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkBox2 = driver.findElement(By.id("vfb-6-1"));
		
		checkBox1.click();
		checkBox2.click();
		
		//Check which checkBox is selected
		if(radio1.isSelected()) {
			System.out.println("radio 1 is selected");
		} else {
			System.out.println("radio 1 is NOT selected");
		}
		
	
	}

}
