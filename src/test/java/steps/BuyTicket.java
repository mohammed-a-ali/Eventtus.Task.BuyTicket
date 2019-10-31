package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BuyTicketPage;
import pages.BuyingTicketCompleted;
import pages.FillTicketDetailsPage;
import runner.Hooks;

import static Browser.Driver.driver;

public class BuyTicket extends Hooks {

    BuyTicketPage buyTicket;
    FillTicketDetailsPage fillDetails;
    BuyingTicketCompleted buyTicketFinished;
    Faker fake = new Faker();
    String firstTicketFName = fake.name().firstName();
    String firstTicketLName = fake.name().lastName();
    String firstTicketEmail = fake.internet().emailAddress();
    String secondTicketFName = fake.name().firstName();
    String secondTicketLName = fake.name().lastName();
    String secondTicketEmail = fake.internet().emailAddress();


    @When("I open {string} event")
    public void IOpenEvent(String eventName) {
        buyTicket = new BuyTicketPage(driver);
        buyTicket.selectEvent(eventName);
    }

    @And("I click {string} button")
    public void IClickButton(String buttonName) {
        buyTicket.GetTickets(buttonName);
    }

    @And("I click Register button")
    public void IClicksRegisterButton() {
        buyTicket.RegisterTickets();
        /*String checkRegisterTicketsPage = buyTicket.CheckRegisterTicketsPage();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        Assert.assertEquals(checkRegisterTicketsPage, "Register your tickets");*/
    }

    @And("I select Fill ticket details")
    public void iSelectFillTicketDetails() {
        fillDetails = new FillTicketDetailsPage(driver);
        fillDetails.fillTicketDetails(firstTicketFName, firstTicketLName, firstTicketEmail, secondTicketFName, secondTicketLName, secondTicketEmail);
    }

    @Then("Order confirmation appears")
    public void orderConfirmationAppears() {
        buyTicketFinished = new BuyingTicketCompleted(driver);
        String confirmationMSG = buyTicketFinished.orderConfirmation();
        Assert.assertEquals(confirmationMSG, "Thank you for your order!");
    }
}