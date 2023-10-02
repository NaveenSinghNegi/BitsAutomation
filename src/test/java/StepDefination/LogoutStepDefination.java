package StepDefination;

import Utilities.TestContextSetup;
import io.cucumber.java.en.And;

public class LogoutStepDefination {

    public TestContextSetup testContextSetup;

    public LogoutStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
    }

    @And("click on profile button and click on logout")
    public void clickOnProfileButtonAndClickOnLogout() {
        testContextSetup.pageObjectManager.getHomePage().clickProfileBtn();
        testContextSetup.pageObjectManager.getHomePage().clickLogoutBtn();
    }

}
