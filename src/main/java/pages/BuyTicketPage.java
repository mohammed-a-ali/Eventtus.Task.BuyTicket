package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BuyTicketPage extends PageBase {
    public BuyTicketPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//h3[contains(text(),'Test Automation')]")
    WebElement TestAutomationEvent;

    public final static String btnName= "Get Tickets";

    @FindBy (xpath = "//*[text()='"+btnName+"']")
    WebElement GetTicketsBtn;

    @FindBy (xpath = "//*[text()='Register']")
    WebElement registerButton;

    @FindBy (xpath = "//select[@name='select']")
    WebElement ticketsNumber;

    @FindBy (xpath = "//*[text()='Register your tickets']")
    WebElement RegisterTicketsPage;

    public void selectEvent(String eventName)
    {
        clickButton(TestAutomationEvent);
    }

    public void GetTickets(String buttonsName)
    {
        clickButton(GetTicketsBtn);
    }

    public void RegisterTickets()
    {
        Select ticketsCount = new Select(ticketsNumber);
        ticketsCount.selectByIndex(2);
        clickButton(registerButton);
    }

    public String CheckRegisterTicketsPage ()
    {
        return RegisterTicketsPage.getText();
    }

}
