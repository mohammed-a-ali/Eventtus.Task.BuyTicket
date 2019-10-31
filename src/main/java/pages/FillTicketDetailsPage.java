package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

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

    @FindBy (xpath = "//*[text()='Submit']")
    WebElement submitButton;

    public void fillTicketDetails(String ftfName, String ftlName, String ftEmail, String stfName, String stlName, String stEmail)
    {
        clickButton(fillTicketDetailsRadio);
        setTextElementText(firstTicketFName, ftfName);
        setTextElementText(firstTicketLName, ftlName);
        setTextElementText(firstTicketEmail, ftEmail);
        setTextElementText(secondTicketFName, stfName);
        setTextElementText(secondTicketLName, stlName);
        setTextElementText(secondTicketEmail, stEmail);
        clickButton(submitButton);
    }

}
