package StepDefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	WebDriverWait wait;

	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation_Tools\\MavenWorkspace\\PulseApplication\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/v4/");
	}

	@When("^Enter the Username (.+) and Password (.+)$")
	public void enter_the_Username_and_Password(String username, String password) throws Throwable {
		WebElement usernameField = driver.findElement(By.name("uid"));
		WebElement passwordField = driver.findElement(By.name("password"));
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(usernameField),
				ExpectedConditions.visibilityOf(passwordField)));
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);

	}

	@Then("^Reset the credential$")
	public void Reset_the_credential() throws Throwable {
		WebElement loginButton = driver.findElement(By.name("btnReset"));
		WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'Guru99 Bank')]"));
		wait.until(ExpectedConditions.visibilityOf(loginButton));
		loginButton.click();
		wait.until(ExpectedConditions.visibilityOf(title));
		//File src = title.getScreenshotAs(OutputType.FILE);
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src,
				new File("D:\\AutomationTestingTools\\Eclipse\\pulseAttendance\\CucumberWithSelenium\\Screenshot"));
		driver.quit();
	}
}