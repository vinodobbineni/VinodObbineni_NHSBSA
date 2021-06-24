package eligibilityChecker_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class echecker {
	WebDriver Idriver;
	
	
	

	public echecker(WebDriver rdriver) {
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy (xpath ="//input[@id='next-button']")
	WebElement nxtbtn;
	@FindBy (xpath ="//button[@id='nhsuk-cookie-banner__link_accept']")
	WebElement cookbtn;
	@FindBy (xpath ="//label[@id='label-no']")
	WebElement nochbx;
	@FindBy (xpath ="//label[@id='label-wales']")
	WebElement waleschbx;
	
	public void nochbx() {
		nochbx.click();
	}
	
	public void waleschbx() {
		waleschbx.click();
	}
	
	public void cookBtn() {
		cookbtn.click();
	}
	public void nxtBtn() {
		nxtbtn.click();
	}

}
