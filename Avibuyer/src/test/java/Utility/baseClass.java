package Utility;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.homePage;
import pageObjects.loginPage;


public class baseClass {
	
	public static WebDriver driver;
	public loginPage lp;
	public homePage hp;
	
	public WebDriver getDriver() {
		if(driver == null) {
			String projectPath = System.getProperty("user.dir");
	
			System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Project Path..." + projectPath);
		}
		return driver;
	
//	@Test
//	public void setupDriver() throws IOException
//	{
//	String projectPath = System.getProperty("user.dir");
//	
//	System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromedriver.exe");
//	driver = new ChromeDriver();
//	System.out.println("Project Path..." + projectPath);
}

}
