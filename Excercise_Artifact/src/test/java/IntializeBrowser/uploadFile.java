package IntializeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class uploadFile {
	
	WebDriver driver;
	@Test
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Tools\\MavenWorkspace\\PulseApplication\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		
		 WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("D:\\Project_Work\\BDD\\Bose\\51386\\1.png");

	        // check the "I accept the terms of service" check box
	        driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	     //   driver.findElement(By.name("send")).click();

}
}
