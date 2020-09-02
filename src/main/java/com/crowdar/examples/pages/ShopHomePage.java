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

    private final String BUTTON_SIGNIN_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";
    private final String HOME_ELEMENT_CSS_SELECTOR ="#home-page-tabs > li.active > a";
    private final String EMAIL_BOX_CSS_SELECTOR = "#email";
    private final String PASSWORD_BOX_CSS_SELECTOR = "#passwd";
    private final String BUTTON_SIGNIN_GREEN_XPATH = "//*[@id='SubmitLogin']/span";
    private final String TITLE_H1_CSS_SELECTOR = "#center_column > h1";
    private final String TITLE_H3_CSS_SELECTOR = " #create-account_form > h3";



    public void go() {
        navigateToCompleteURL();
    }

    public void clickSignInButton(){
        clickElement(By.cssSelector(BUTTON_SIGNIN_CSS_SELECTOR));
    }

    public void clickSinginGreenButton(){
        clickElement(By.xpath(BUTTON_SIGNIN_GREEN_XPATH));
    }

    public void verifyHomePage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(TITLE_H3_CSS_SELECTOR)),"El elemento no es visible");
    }

    public void verifyNyAccountPage(){
        Assert.assertTrue(isElementVisible(By.cssSelector(TITLE_H1_CSS_SELECTOR)),"El elemento no es visible");
    }


    public void setTextEmailBox(){
        WebElement input = driver.findElement(By.cssSelector(EMAIL_BOX_CSS_SELECTOR));
        input.clear();
        input.sendKeys("luisjivillalba@gmail.com");
    }
    public void setTextPasswordBox(){
        WebElement input = driver.findElement(By.cssSelector(PASSWORD_BOX_CSS_SELECTOR));
        input.clear();
        input.sendKeys("asd123");
    }





}
