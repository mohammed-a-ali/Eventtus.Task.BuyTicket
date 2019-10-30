package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(linkText = "Create new account")
    WebElement registerLink;

    @FindBy (id = "user_login")
    WebElement userNameTextBox;

    @FindBy (id = "user_password")
    WebElement passwordTextBox;

    @FindBy (id = "submit")
    WebElement LoginButton;

    public void openRegistrationPage()
    {
        clickButton(registerLink);
    }

    public void login(String userName, String password)
    {
        setTextElementText(userNameTextBox, userName);
        setTextElementText(passwordTextBox, password);
        clickButton(LoginButton);
    }
}
