package costsChecker_Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 


@RunWith(Cucumber.class)
@CucumberOptions(features=".//costsChecker_feature//CostsChecker.feature",
glue = "stepDefinitions"
)
public class TestRunner {

}
