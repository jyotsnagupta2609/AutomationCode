package IntializeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginPage {
	WebDriver driver;
	@Test
	public void initBrowser() {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Tools\\MavenWorkspace\\PulseApplication\\Driver\\chromedriver.exe");
		String baseURL = "http://demo.guru99.com/test/login.html";
		driver = new ChromeDriver();
		driver.get(baseURL);
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("passwd"));
		WebElement submitButton = driver.findElement(By.id("SubmitLogin"));
		
		//Entering username and password
		email.sendKeys("jyotsna.gupta");
		password.sendKeys("12345");
		
		//Deleteing data in the text box
		email.clear();
		password.clear();
				
		email.sendKeys("jyotsna.gupta");
		password.sendKeys("12345");
		submitButton.click();
		System.out.println("Submit done with click........");
		driver.close();
		
	}

}
