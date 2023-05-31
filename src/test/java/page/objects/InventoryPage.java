package page.objects;

import driver.manager.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class InventoryPage extends BasePage {

    @FindBy(className = "app_logo")
    private WebElement appLogo;

    public InventoryPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
    @Step("Getting is app logo is displayed")
    public boolean isAppLogoDisplayed() {
        WaitForElement.waitUntilElementIsVisible(appLogo);
        boolean isDisplayed = appLogo.isDisplayed();
        log().info("Returning status of banner after login: {}", isDisplayed);
        return isDisplayed;
    }
}
