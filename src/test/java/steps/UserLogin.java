package steps;

import Browser.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.UserRegistrationPage;

public class UserLogin extends Driver {

    HomePage homeObject = new HomePage(driver);
    UserRegistrationPage registerObject = new UserRegistrationPage(driver);
    String username = "hania.ahmed@gmail.com";
    String password = "ka3bool";
    String fullName = "Haniaahmed2";

    @When("I entered the login data")
    public void iEnteredTheLoginData() {
        homeObject.login(username, password);
    }

    @Then("I am logged in")
    public void IamLoggedIn() {
        String userNameCheck = registerObject.checkUserNameAfterRegister();
        Assert.assertEquals(fullName, userNameCheck);
    }

    @And("I log out")
    public void ILogOut() {
        registerObject.logOut();
    }
}
