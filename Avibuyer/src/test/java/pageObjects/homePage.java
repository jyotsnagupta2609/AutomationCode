package pageObjects;

import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.waitHelper;

public class homePage {
	public WebDriver ldriver;
	waitHelper waithelper;
	
	public homePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper = new waitHelper(ldriver);
	}
	By popupClose = By.xpath("//a[@class='js-modal-close']");
	By ScheduleOrderMenu = By.xpath("//li[@id='ScheduleOrder']");
	By ManageScheduleOrder = By.xpath("//li[@id='ManageScheduleOrder']");
	By PopupTextArea = By.xpath("//input[@id='txtLayoutMembersearch']");
	By PopupSearchResultClick = By.xpath("//*[contains(text(),'100500 Prime Pharmacy') and @class='ui-menu-item']");
	By SelectPrimePharmacy = By.xpath("//*[@id=\"layoutMembers\"]/tbody/tr");
	
	// Action Methods
	
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	public void closePopup() {
		ldriver.findElement(popupClose).click();
	}
	public void ScheduleOrderMenu() {
		ldriver.findElement(ScheduleOrderMenu).click();
	}
	public void ManageScheduleOrder() {
		ldriver.findElement(ManageScheduleOrder).click();
	}
	public void PopupTextArea(String id) {
	    ldriver.findElement(PopupTextArea).sendKeys(id);
    }
	public void PopupSearchResultClick(String textToSelect) {
		
		try {
			
			 //  WebDriverWait wait = new WebDriverWait(ldriver,30);
			 //  wait.until(ExpectedConditions.visibilityOf(autoOptions));
			   WebElement autoOptions = ldriver.findElement(By.id("ui-id-2"));
			   waitHelper.WaitForlement(autoOptions, 30);

			   List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			   for(WebElement option : optionsToSelect){
			          if(option.getText().equals(textToSelect)) {
			      //     System.out.println("Trying to select ........: "+textToSelect);
			              option.click();
			              break;
			          }
			      }
			  } catch (NoSuchElementException e) {
			   System.out.println(e.getStackTrace());
			  }
			  catch (Exception e) {
			   System.out.println(e.getStackTrace());
			  }
		}
	public void SelectPrimePharmacy() {
		
		ldriver.findElement(SelectPrimePharmacy).click();
	}

}
