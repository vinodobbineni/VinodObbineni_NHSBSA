package costsChecker_stepDefinations;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static String browser = "firefox";
	public static WebDriver driver;
	public String baseURL ="https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start";
	public static Logger logger;
@BeforeClass
public void setup() {
	logger = Logger.getLogger("UserStory_EligibityChecker");
	
	PropertyConfigurator.configure("Log4j.properties");
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			}
	else if(browser.equals("firefox")){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
			}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(baseURL);
}
public void wait (int wait) throws InterruptedException {
Thread.sleep(wait);
}
/*@AfterClass
public void TearDown(){
	driver.close();
	}*/
}