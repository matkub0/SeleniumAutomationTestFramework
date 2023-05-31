package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static org.testng.Assert.assertTrue;

public class PositiveLoginTest extends TestBase {

    @Test
    @Description("The goal of this test is to log in using proper username and password" +
            " and check if Dog Banner is displayed after")
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
