package IntializeBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {
	
	WebDriver driver;
	@Test
	public void initBrowser() throws NoAlertPresentException,InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Tools\\MavenWorkspace\\PulseApplication\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert();  //Switching to Alert
		String alertMessage = driver.switchTo().alert().getText();  // Capturing alert message.    
		System.out.println(alertMessage); // Displaying alert message
		Thread.sleep(5000);
		
        // Accepting alert		
        alert.accept();		

}
}
