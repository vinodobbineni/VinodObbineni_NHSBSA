package eligibilityChecker_TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import eligibilityChecker_PageObjects.echecker;

public class TC001_EChecker extends BaseClass {

	@Test
	public void EChecker() throws InterruptedException {
		echecker ec = new echecker(driver);
		wait(3000);
		ec.cookBtn();
		ec.nxtBtn();
		// select Wales
		ec.waleschbx();
		ec.nxtBtn();
		//Enter DOB	
		driver.findElement(By.xpath("//input[@id='dob-day']")).sendKeys("02");
		driver.findElement(By.xpath("//input[@id='dob-month']")).sendKeys("08");
		driver.findElement(By.xpath("//input[@id='dob-year']")).sendKeys("1995");
		ec.nxtBtn();
		// Give circumstances into checker tool
		ec.nochbx();
		ec.nxtBtn();
		ec.nochbx();
		ec.nxtBtn();
		ec.nochbx();
		ec.nxtBtn();
		ec.nochbx();
		ec.nxtBtn();
		ec.nochbx();
		ec.nxtBtn();
		ec.nochbx();
		ec.nxtBtn();
		ec.nochbx();
		ec.nxtBtn();
		ec.nochbx();
		ec.nxtBtn();
		// Page Title Validation
		String actTitle= driver.getTitle();
		String expTitle = "You get help with health costs - Check what help you could get to pay for NHS costs - NHSBSA";
		if (actTitle.equals(expTitle)) {
			System.out.println("Passed - Actual Title:"+actTitle+" Expected Title"+expTitle);
			
		}
		assertEquals(actTitle, expTitle);
		System.out.println(actTitle);

	}
}
