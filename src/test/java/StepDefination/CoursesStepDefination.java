package StepDefination;

import Utilities.TestContextSetup;
import io.cucumber.java.en.And;

public class CoursesStepDefination {
    public TestContextSetup testContextSetup;

    public CoursesStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
    }


    @And("User clicks on my courses button and my Courses page loaded")
    public void userClicksOnMyCoursesButtonAndMyCoursesPageLoaded() {
        testContextSetup.pageObjectManager.getHomePage().getCourseNameBtn();
    }
}
