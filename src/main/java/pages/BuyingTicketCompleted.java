package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyingTicketCompleted extends PageBase {
    public BuyingTicketCompleted(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(linkText = "//h2[@class='confirmation__title']")
    WebElement orderCompleted;


    public String orderConfirmation()
    {
        return orderCompleted.getText();
    }
}
