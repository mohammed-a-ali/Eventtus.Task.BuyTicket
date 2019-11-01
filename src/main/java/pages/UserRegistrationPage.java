package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user_user_profile_attributes_full_name")
    WebElement fullNameTextBox;

    @FindBy(id = "user_username")
    WebElement userNameTextBox;

    @FindBy(id = "user_email")
    WebElement emailTextBox;

    @FindBy (id = "user_password")
    WebElement passwordTextBox;

    @FindBy (id = "user_password_confirmation")
    WebElement confirmPassword;

    @FindBy (name = "commit")
    WebElement registerButton;

    @FindBy (xpath = "//li[@class='dropdown logged-in'] | //button[@class='btn-link btn btn-secondary']")
    WebElement userAvatar;

    @FindBy (xpath = "//a[@href='/logout'] | //button[@class='btn dropdown-item']")
    WebElement logoutLink;

    @FindBy (xpath = "//h5[@class='userName']")
    WebElement userNameLable;

    public void userRegistration(String fullName, String userName, String email, String password)
    {
        setTextElementText(fullNameTextBox, fullName);
        setTextElementText(userNameTextBox, userName);
        setTextElementText(emailTextBox, email);
        setTextElementText(passwordTextBox, password);
        setTextElementText(confirmPassword, password);
        clickButton(registerButton);
    }

    public void logOut()
    {
        userAvatar.click();
        logoutLink.click();
    }

    public String checkUserNameAfterRegister()
    {
        return userNameLable.getText();
    }
}
