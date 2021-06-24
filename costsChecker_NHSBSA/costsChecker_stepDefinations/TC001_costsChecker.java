package costsChecker_stepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import costsChecker_PageObjects.echecker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_costsChecker {
	private WebDriver driver;
	echecker ec = new echecker(driver);

	@Given("^I am a person from Wales$")
	public void i_am_a_person_from_wales() throws Throwable {

		wait(3000);
		ec.cookBtn();
		ec.nxtBtn();
		ec.waleschbx();
		ec.nxtBtn();
	}

	@When("^I put my circumstances into the Checker tool$")
	public void i_put_my_circumstances_into_the_checker_tool() throws Throwable {
		driver.findElement(By.xpath("//input[@id='dob-day']")).sendKeys("02");
		driver.findElement(By.xpath("//input[@id='dob-month']")).sendKeys("08");
		driver.findElement(By.xpath("//input[@id='dob-year']")).sendKeys("1995");
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
		ec.nochbx();
		ec.nxtBtn();

	}

	@Then("^I should get a result of whether I will get help or not$")
	public void i_should_get_a_result_of_whether_i_will_get_help_or_not() throws Throwable {
		String actTitle = driver.getTitle();
		String expTitle = "You get help with health costs - Check what help you could get to pay for NHS costs - NHSBSA";
		if (actTitle.equals(expTitle)) {
			System.out.println("Passed - Actual Title:" + actTitle + " Expected Title" + expTitle);

		}
		assertEquals(actTitle, expTitle);
		System.out.println(actTitle);

	}

}
