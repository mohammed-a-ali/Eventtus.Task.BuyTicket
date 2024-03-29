package steps;

import Browser.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistration extends Driver {

    HomePage homeObject ;
    UserRegistrationPage registerObject;
    Faker fakeData = new Faker();
    String fullName = fakeData.name().fullName();
    String username = fakeData.name().username();
    String email = fakeData.internet().emailAddress();
    String password = fakeData.number().digits(8).toString();

    @Given("I am on the home page")
    public void I_am_on_the_home_page() {
        //homeObject = new HomePage(driver);
    }

    @When("I click on register link")
    public void i_click_on_register_link() {
        homeObject = new HomePage(driver);
        homeObject.openRegistrationPage();
        Assert.assertTrue(driver.getCurrentUrl().contains("signup"));
    }

    @And("I entered the user data")
    public void i_entered_the_user_data() {
        registerObject = new UserRegistrationPage(driver);
        registerObject.userRegistration(fullName, username, email, password);
    }

    @Then("The registration page displays successfully")
    public void the_registration_page_displays_successfully() {
        String userNameCheck = registerObject.checkUserNameAfterRegister();
        Assert.assertEquals(fullName, userNameCheck);
        System.out.println("Full Name : "+ fullName + " User Name : " + username + " Email : " + email + " Password : " + password);
        //registerObject.logOut();
    }
}
