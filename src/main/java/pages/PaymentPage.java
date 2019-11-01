package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage extends PageBase {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//*[text()='Credit Card']")
    WebElement creditCardRadio;


    @FindBy (id = "cardNumber")
    WebElement cardNumber;

    @FindBy (id = "cardHolderName")
    WebElement cardHolderName;

    @FindBy (id = "expiryDateMonth")
    WebElement monthExDate;

    @FindBy (id = "expiryDateYear")
    WebElement yearExDate;

    @FindBy (id = "cardSecurityCode")
    WebElement cvv;

    @FindBy (xpath = "//*[text()='Confirm']")
    WebElement confirmButton;

    public void selectCreditCard()
    {
        clickButton(creditCardRadio);
    }

    public void fillCreditCardData()
    {
        setTextElementText(cardNumber, "4035300539804083 ");
        setTextElementText(cardHolderName, "Daniel Rodriguez");
        setTextElementText(monthExDate, "06");
        setTextElementText(yearExDate, "26");
        setTextElementText(cvv, "303"); //202
        clickButton(confirmButton);
    }

}
