package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.customlisteners.CustomListeners;
import com.herokuapp.internet.pages.LoginPage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})
    public void  UserShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedText = "Secure Area";
        Assert.assertEquals(loginPage.getTextSecureArea(),expectedText,"Secure Area");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyTheUsernameErrorMessage(){
        loginPage.invalidUsername("tomsmith1");
        loginPage.validPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton1();
        String expectedMessage = "Your username is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.getErrorMessage(),expectedMessage,"Your username is invalid!\n" +
                "×");
    }
    @Test(groups = "regression")
    public void verifyThePasswordErrorMessage(){
        loginPage.validUsername("tomsmith");
        loginPage.invalidPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton2();
        String expectedMessage = "Your password is invalid!\n" +
                "×";
        Assert.assertEquals(loginPage.getErrorMessageForInvalidPassword(),expectedMessage,"Your password is invalid!\n" +
                "×");

    }
}
