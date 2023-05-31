package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(css = "[data-test='error']")
    private WebElement warning;

    @FindBy(className = "login_password")
    private WebElement test;


    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage typeIntoUserNameField(String username) {
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.sendKeys(username);
        log().info("Typed into User Name Field {}", username);
        return this;
    }

    public LoginPage typeIntoPasswordField(String password) {
        WaitForElement.waitUntilElementIsVisible(passwordField);
        passwordField.sendKeys(password);
        log().info("Typed into Password Field {}", password);
        return this;
    }

    public InventoryPage clickOnLoginButton() {
        loginButton.click();
        log().info("Clicked on Login Button");
        return new InventoryPage();
    }

    public String getErrorMessage() {
        WaitForElement.waitUntilElementIsVisible(warning);
        String warningText = warning.getText();
        log().info("Returned warning message was: {}", warningText);
        return warningText;
    }
}
