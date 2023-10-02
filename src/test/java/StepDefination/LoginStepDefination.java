package StepDefination;

import Utilities.Database;
import Utilities.TestContextSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.sql.SQLException;

public class LoginStepDefination {
    public TestContextSetup testContextSetup;

    public LoginStepDefination(TestContextSetup testContextSetup){
        this.testContextSetup=testContextSetup;
    }

    @When("user entered valid id and password")
    public void userEnteredValidIdAndPassword() throws SQLException, ClassNotFoundException {
        testContextSetup.pageObjectManager.getloginPage().doLogin(Database.getString("email"), Database.getString("password_hash"));
    }

    @Then("logged in successful")
    public void loggedInSuccessful() {
        System.out.println("login success");
    }

}
