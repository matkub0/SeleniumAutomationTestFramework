package tests;

import org.testng.annotations.Test;
import page.objects.LoginPage;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTest extends TestBase {

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {

        LoginPage loginPage = new LoginPage();
        boolean isAppLogoDisplayed = loginPage
                .typeIntoUserNameField("standard_user")
                .typeIntoPasswordField("secret_sauce")
                .clickOnLoginButton()
                .isAppLogoDisplayed();

        assertTrue(isAppLogoDisplayed);
    }
}
