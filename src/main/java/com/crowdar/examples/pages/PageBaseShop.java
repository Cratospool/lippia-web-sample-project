package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.sql.Driver;

public class PageBaseShop extends PageBaseWeb {

    public PageBaseShop(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = " http://automationpractice.com/";
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

}
