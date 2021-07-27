package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homePage;
import pageObjects.loginPage;

public class Steps extends baseClass {
	
	public WebDriver driver;
	public loginPage lp;
	public homePage hp;
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	    lp = new loginPage(driver);
	}

	@When("user open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	 }

	@When("user enter email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String username, String password) {
		lp.setUserName(username);
		lp.setPassword(password);
	}

	@When("click on login")
	public void click_on_login() {
		lp.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		if(driver.getPageSource().contains("Object reference not set to an instance of an object.")) {
	    	driver.close();
	    	Assert.assertTrue(false);
	    } else
	    {
	    	Assert.assertEquals(title, driver.getTitle());
	    }
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
	   driver.quit();
	}

	// HOME PAGE STEPS DFINITION
	
		@Given("user is on home page")
		public void user_is_on_home_page() throws InterruptedException {
			hp = new homePage(driver);
			Assert.assertEquals("Avibuyer - Home Page", hp.getPageTitle());
			 Thread.sleep(2000);
		  //System.out.println("I am on home page.....");				
		}

		@When("I close select pharmacy popup window")
		public void i_close_select_pharmacy_popup_window() {
		   hp.closePopup();
		}

		@Then("click on Schedule Order menu")
		public void click_on_schedulr_order_menu() {
			hp.ScheduleOrderMenu();
		}

		@Then("click on Manage schedule order submenu")
		public void click_on_manage_schedule_order_submenu() throws InterruptedException {
		    hp.ManageScheduleOrder();
		    Thread.sleep(2000);
		}

		@Then("I can see pharmacy popup window")
		public void i_can_see_pharmacy_popup_window() {
		    
		}

		@Then("I enter pharmacy id as {string} in text area in popup window")
		public void i_enter_pharmacy_id_as_in_text_area_in_popup_window(String string) {
		  hp.PopupTextArea(string);
		}

		@Then("I can select first search result {string}")
		public void i_can_select_first_search_result(String string) {
			hp.PopupSearchResultClick(string);
		}

		@Then("I click on search result")
		public void i_click_on_search_result() {
			hp.SelectPrimePharmacy();
		}

		@Then("I navigate to {string} page")
		public void i_navigate_to_page(String string) {
			Assert.assertEquals("Avibuyer - Home Page", hp.getPageTitle());
			}

}
