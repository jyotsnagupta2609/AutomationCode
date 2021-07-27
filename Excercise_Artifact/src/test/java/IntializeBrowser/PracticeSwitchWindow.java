package IntializeBrowser;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchWindow {

		public static WebDriver driver;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\Automation_Tools\\MavenWorkspace\\PulseApplication\\Driver\\chromedriver.exe");
			
		    WebDriver driver = new ChromeDriver();
		    driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	        driver.manage().window().maximize();
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        // Store and Print the name of the First window on the console
	        String handle= driver.getWindowHandle();
	        
	        WebElement Element =  driver.findElement(By.linkText("Demo Website for Practice Automation"));
	        
	     /*   JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", Element); */

	        System.out.println(handle);

	        // Click on the Button "New Message Window"
	        Element.click();

	        // Store and Print the name of all the windows open	              
	        Set handles = driver.getWindowHandles();
	        System.out.println(handles);

	        // Pass a window handle to the other window
	        for (String handle1 : driver.getWindowHandles()) {

	        	System.out.println("New window" + handle1);
	        	driver.switchTo().window(handle1);
	        	}

	        // Closing child window
	         driver.close();

	        // Close Original window
	         driver.quit();

	}

}
