package com.herokuapp.internet.pages;

import com.aventstack.extentreports.Status;
import com.herokuapp.internet.customlisteners.CustomListeners;
import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(tagName = "i")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/h2[1]")
    WebElement secureAreaText;

    @CacheLookup
    @FindBy(name = "username")
    WebElement invalidUserNameField;


    @CacheLookup
    @FindBy(name = "password")
    WebElement validPasswordField;

    @CacheLookup
    @FindBy(tagName = "i")
    WebElement loginButton1;

    @CacheLookup
    @FindBy(xpath = "//div[@id='flash-messages']//div[1]")
    WebElement yourUsernameIsInvalid;

    @CacheLookup
    @FindBy(name = "username")
    WebElement validUserNameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement invalidPasswordField;

    @CacheLookup
    @FindBy(tagName = "i")
    WebElement loginButton2;

    @CacheLookup
    @FindBy(xpath = "//div[@id='flash-messages']//div[1]")
    WebElement yourPasswordIsInvalid;

    public void enterUsername(String userName) {
        Reporter.log("enterUsername" +userName+ usernameField.toString());
        sendTextToElement(usernameField, userName);
        CustomListeners.test.log(Status.PASS,"enterUsername"+userName);
    }

    public void enterPassword(String password) {
        Reporter.log("enterPassword" +password+passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS,"enterPassword"+password);
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"clickOnLoginButton");
    }

    public String getTextSecureArea() {
        Reporter.log("getTextSecureArea" + secureAreaText.toString());
        CustomListeners.test.log(Status.PASS,"getTextSecureArea");
        return getTextFromElement(secureAreaText);
    }

    public void invalidUsername(String userName) {
        Reporter.log("invalidUsername" + userName+ invalidUserNameField.toString());
        sendTextToElement(invalidUserNameField, userName);
        CustomListeners.test.log(Status.PASS,"invalidUsername"+userName);
    }

    public void validPassword(String password) {
        Reporter.log("validPassword" + password+ validPasswordField.toString());
        sendTextToElement(validPasswordField, password);
        CustomListeners.test.log(Status.PASS,"validPassword"+password);
    }

    public void clickOnLoginButton1() {
        Reporter.log("clickOnLoginButton1" + loginButton1.toString());
        clickOnElement(loginButton1);
        CustomListeners.test.log(Status.PASS,"clickOnLoginButton1");
    }

    public String getErrorMessage() {
        Reporter.log("getErrorMessage" + yourUsernameIsInvalid.toString());
        CustomListeners.test.log(Status.PASS,"getErrorMessage");
        return getTextFromElement(yourUsernameIsInvalid);

    }

    public void validUsername(String userName) {
        Reporter.log("validUsername" + userName+ validUserNameField.toString());
        sendTextToElement(validUserNameField, userName);
        CustomListeners.test.log(Status.PASS,"validUsername"+userName);
    }

    public void invalidPassword(String password) {
        Reporter.log("invalidPassword" + password+ invalidPasswordField.toString());
        sendTextToElement(invalidPasswordField, password);
        CustomListeners.test.log(Status.PASS,"invalidPassword"+password);
    }

    public void clickOnLoginButton2() {
        Reporter.log("clickOnLoginButton2" + loginButton2.toString());
        clickOnElement(loginButton2);
        CustomListeners.test.log(Status.PASS,"clickOnLoginButton2");
    }

    public String getErrorMessageForInvalidPassword() {
        Reporter.log("getErrorMessageForInvalidPassword" + yourPasswordIsInvalid.toString());
        CustomListeners.test.log(Status.PASS,"getErrorMessageForInvalidPassword");
        return getTextFromElement(yourPasswordIsInvalid);
    }
}




