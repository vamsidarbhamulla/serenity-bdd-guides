package com.serenitybdd.examples.steps;

import com.serenitybdd.examples.screens.GlobalHeaderNavigationBar;
import com.serenitybdd.examples.screens.LoginScreen;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    String actor;

    GlobalHeaderNavigationBar globalHeaderNavigationBar;

    LoginScreen loginScreen;


    @Step("#actor is a registered member")
    public void IsARegisteredMember(){
        globalHeaderNavigationBar.openAt("http://www.serenitybddpractice.com");
    }

    @Step("#actor should be able to sign in with their account")
    public void signInWithTheirAccount(String userName, String password){
        globalHeaderNavigationBar.goToLoginScreen();
        loginScreen.login(userName, password);

    }

    @Step("#actor should be able to view their profile")
    public void checkProfile(){

    }
}

