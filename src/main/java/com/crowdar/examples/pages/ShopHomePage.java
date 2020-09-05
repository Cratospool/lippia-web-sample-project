package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShopHomePage extends PageBaseShop {


    public ShopHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "";
    }

    private final By BUTTON_SIGNIN_CSS_SELECTOR = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
    private final String HOME_ELEMENT_CSS_SELECTOR = "#home-page-tabs > li.active > a";
    private final String EMAIL_BOX_CSS_SELECTOR = "#email";
    private final String PASSWORD_BOX_CSS_SELECTOR = "#passwd";
    private final By BUTTON_SIGNIN_GREEN_XPATH = By.id("//*[@id='SubmitLogin']/span");
    private final String TITLE_H1_CSS_SELECTOR = "#center_column > h1";
    private final String TITLE_H3_CSS_SELECTOR = " #create-account_form > h3";


    public void go() {
        navigateToCompleteURL();
    }

    public void verifyLoginScreen(){
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_H1_CSS_SELECTOR)).getText(),"AUTHENTICATION");
    }

    public void verifyNyAccountPage() {
        Assert.assertTrue(isElementVisible(By.cssSelector(TITLE_H3_CSS_SELECTOR)), "El elemento no es visible");
    }


    public void setTextEmailBox(String email) {
        WebElement input = driver.findElement(By.cssSelector(EMAIL_BOX_CSS_SELECTOR));
        input.clear();
        input.sendKeys(email);
    }

    public void setTextPasswordBox(String pass) {
        completeField(By.cssSelector(PASSWORD_BOX_CSS_SELECTOR),pass);
    }

    public void clickButton(String button) {
        By locator = null;
        switch (button) {
            case "Sign in":
                locator = BUTTON_SIGNIN_CSS_SELECTOR;
                break;
            case "Sign in verde":
                locator = BUTTON_SIGNIN_GREEN_XPATH;
                break;
        }
            if (isElementPresent(locator) && locator != null) {
                this.click(locator);
            }
        }

    public void redirectScreen(String pantalla){
        switch (pantalla){
            case "Login":
                verifyLoginScreen();
                break;
            case "My Account":
                verifyNyAccountPage();
                break;
        }
    }
}
