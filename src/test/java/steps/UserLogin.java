package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.UserRegistrationPage;
import runner.Hooks;

import static Browser.Driver.driver;

public class UserLogin extends Hooks {

    HomePage homeObject = new HomePage(driver);
    UserRegistrationPage registerObject;
    String username = "hania.ahmed@gmail.com";
    String password = "ka3bool";
    String fullName = "Haniaahmed2";

    @When("I entered the login data")
    public void iEnteredTheLoginData() {
        homeObject.login(username, password);
    }

    @Then("The user is logged in")
    public void theUserIsLoggedIn() {
        registerObject = new UserRegistrationPage(driver);
        String userNameCheck = registerObject.checkUserNameAfterRegister();
        Assert.assertEquals(fullName, userNameCheck);

    }
}
