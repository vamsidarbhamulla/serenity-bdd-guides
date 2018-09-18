package com.serenitybdd.examples.screens;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.webdriver.servicepools.CurrentOS;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GlobalHeaderNavigationBar extends PageObject {

    @FindBy(css="#_desktop_user_info > div > a")
    private static WebElementFacade GET_LOGIN_SCREEN;

    @FindBy(css="#_mobile_user_info > div > a")
    private static WebElementFacade GET_MOBILE_LOGIN_SCREEN;

    public GlobalHeaderNavigationBar(WebDriver driver) {
        super(driver);
    }

    public void goToLoginScreen(){
        if(CurrentOS.getType() == CurrentOS.OSType.other)
            GET_MOBILE_LOGIN_SCREEN.click();
        else GET_LOGIN_SCREEN.click();
    }
}
