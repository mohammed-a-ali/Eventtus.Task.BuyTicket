package steps;

import Browser.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BuyTicketPage;
import pages.BuyingTicketCompleted;
import pages.FillTicketDetailsPage;
import pages.PaymentPage;

public class BuyTicket extends Driver {

    BuyTicketPage buyTicket = new BuyTicketPage(driver);;
    FillTicketDetailsPage fillDetails = new FillTicketDetailsPage(driver);;
    BuyingTicketCompleted buyTicketFinished = new BuyingTicketCompleted(driver);;
    PaymentPage payment = new PaymentPage(driver);;
    Faker fake = new Faker();
    String firstTicketFName = fake.name().firstName();
    String firstTicketLName = fake.name().lastName();
    String firstTicketEmail = fake.internet().emailAddress();
    String secondTicketFName = fake.name().firstName();
    String secondTicketLName = fake.name().lastName();
    String secondTicketEmail = fake.internet().emailAddress();


    @When("I open {string} event")
    public void IOpenEvent(String eventName) {
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
        fillDetails.fillTicketDetails(firstTicketFName, firstTicketLName, firstTicketEmail, secondTicketFName, secondTicketLName, secondTicketEmail);
    }

    @Then("Order confirmation appears")
    public void orderConfirmationAppears() {
        String confirmationMSG = buyTicketFinished.orderConfirmation();
        Assert.assertEquals(confirmationMSG, "Thank you for your order!");
    }

    @When("I open FIFA2022 event")
    public void iOpenFIFAEvent() {
        buyTicket.SelectFifa();
    }

    @And("I fill Credit Card Data")
    public void iFillCreditCardData() {
        payment.fillCreditCardData();
    }

    @And("I click Pay button")
    public void iClickPayButton() {
        fillDetails.clickPayButton();
    }

    @And("I select Credit Card")
    public void iSelectCreditCard() {
        payment.selectCreditCard();
    }

    @And("I click Submit button")
    public void iClickSubmitButton() {
        fillDetails.clickSubmitButton();
    }
}
