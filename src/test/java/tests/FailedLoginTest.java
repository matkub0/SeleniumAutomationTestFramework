package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import page.objects.LoginPage;

import static org.testng.Assert.assertEquals;

public class FailedLoginTest extends TestBase {

    @Test
    @Description("The purpose of the test is to log in using incorrect login details and to check" +
            " whether the message about the incorrect details is displayed")
    public void asUserTryToLoginWithIncorrectLoginAndPassword() {

        LoginPage loginPage = new LoginPage();
        loginPage
                .typeIntoUserNameField("NotExistingLogin")
                .typeIntoPasswordField("NotProperPassword")
                .clickOnLoginButton();
        String errorMessage = loginPage.getErrorMessage();

        assertEquals(errorMessage, "Epic sadface: Username and password do not match any user in this service");
    }
}
