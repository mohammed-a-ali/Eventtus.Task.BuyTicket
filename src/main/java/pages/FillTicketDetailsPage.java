package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FillTicketDetailsPage extends PageBase {

    public FillTicketDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "BuyerEach")
    WebElement fillTicketDetailsRadio;

    @FindBy (xpath = "//div[@class='collapse__content collapse show']//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]")
    WebElement firstTicketFName;

    @FindBy (xpath = "//div[@class='collapse__content collapse show']//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")
    WebElement firstTicketLName;

    @FindBy (xpath = "//div[@class='collapse__content collapse show']//div[2]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//input[1]")
    WebElement firstTicketEmail;

    @FindBy (xpath = "//div[@class='collapse__content collapse show']//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]")
    WebElement secondTicketFName;

    @FindBy (xpath = "//div[@class='collapse__content collapse show']//div[3]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")
    WebElement secondTicketLName;

    @FindBy (xpath = "//div[@class='collapse__content collapse show']//div[3]//div[1]//div[1]//div[1]//div[3]//div[1]//div[1]//input[1]")
    WebElement secondTicketEmail;

    @FindBy (xpath = "(//div[@class='d-flex justify-content-between']//button[@class='ticket-questions-btn btn-unstyled -save btn btn-link'][contains(text(),'Save')])[1]")
    WebElement FirstTicketDataSave;

    @FindBy (xpath = "(//div[@class='d-flex'])[2]")
    WebElement SecondTicketDataSave;

    @FindBy (xpath = "//*[text()='Submit']")
    WebElement submitButton;

    @FindBy (xpath = "//*[text()='Pay']")
    WebElement PayButton;

    public void fillTicketDetails(String ftfName, String ftlName, String ftEmail, String stfName, String stlName, String stEmail)
    {
        clickButton(fillTicketDetailsRadio);
        setTextElementText(firstTicketFName, ftfName);
        setTextElementText(firstTicketLName, ftlName);
        setTextElementText(firstTicketEmail, ftEmail);
        clickButton(FirstTicketDataSave);
        setTextElementText(secondTicketFName, stfName);
        setTextElementText(secondTicketLName, stlName);
        setTextElementText(secondTicketEmail, stEmail);
        clickButton(SecondTicketDataSave);
    }
    public void clickSubmitButton()
    {
        clickButton(submitButton);
    }
    public void clickPayButton()
    {
        clickButton(PayButton);
    }

}
