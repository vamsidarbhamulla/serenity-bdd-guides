package com.serenitybdd.examples.tests;

import com.serenitybdd.examples.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed
    WebDriverFacade webdriver;

    @Steps
    LoginSteps carla;

    @Test
    public void checkUserSuccessfullyLogin(){
        // Given
        carla.IsARegisteredMember();

        // When
        carla.signInWithTheirAccount("carla_the_online_customer@getnada.com","password");

        // Then
        carla.checkProfile();
    }
}
