package TestNGTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/FeatureFile", glue = "StepDefination",
        plugin = {"json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumberreport.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed-scenarios.txt"},
        monochrome = true, tags = "@sanity")
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

    //to testcases in parallel
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
