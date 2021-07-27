package IntializeBrowser;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

	@Test
	public class AnnotationWithParameter {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "D:\\Automation_Tools\\MavenWorkspace\\PulseApplication\\Driver\\chromedriver.exe";
    public WebDriver driver; 
    public String expected = null;
    public String actual = null;
          
    @BeforeTest
      public void launchBrowser() {
          System.out.println("launching chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver= new ChromeDriver();
          driver.get(baseUrl);
          System.out.println("before Test"); 
      }
      
     @BeforeMethod
      public void verifyHomepageTitle() {
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
          System.out.println("before method"); 
      }
     @Test(priority = 0)
      public void register(){
          driver.findElement(By.linkText("REGISTER")).click() ;
          expected = "Register: Mercury Tours";
          actual = driver.getTitle();
          Assert.assertEquals(actual, expected);
          System.out.println("Test 0"); 
      }
     @Test(priority = 1)
      public void support() {
            driver.findElement(By.linkText("SUPPORT")).click() ;
            expected = "Under Construction: Mercury Tours";
            actual = driver.getTitle();
            Assert.assertEquals(actual, expected);
            System.out.println("Test 1"); 
      }
     @AfterMethod
      public void goBackToHomepage ( ) {
            driver.findElement(By.linkText("Home")).click() ;
            System.out.println("after method"); 
      }
       
     @AfterTest
      public void terminateBrowser(){
          driver.close();
          System.out.println("after Test"); 
      }
}