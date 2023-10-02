package StepDefination;

import Utilities.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.*;

import java.io.IOException;

public class PreAndPostConditionsHooks {

    public TestContextSetup testContextSetup;

    public PreAndPostConditionsHooks(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
    }

    @BeforeStep
    public void beforeEachStep(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            String screenshotName=scenario.getName().replaceAll(" ", "_");
            byte[] fileContent=testContextSetup.pageObjectManager.getGenericUtilitiesFunctions().takeScreenshot();
            scenario.attach(fileContent,"image/png", screenshotName);
        }
        else{
            String screenshotName=scenario.getName().replaceAll(" ", "_");
            byte[] fileContent=testContextSetup.pageObjectManager.getGenericUtilitiesFunctions().takeScreenshot();
            scenario.attach(fileContent,"image/png", screenshotName);
        }
    }

    @After
    public void afterEachScenario(){
        testContextSetup.pageObjectManager.getGenericUtilitiesFunctions().closeBrowser();
    }

}
