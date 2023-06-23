package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.LoginScreen;
import test.automation.pages.HomeScreen;

public class LoginSteps {
    LoginScreen loginScreen = new LoginScreen();
    HomeScreen homeScreen = new HomeScreen();

    @Given("I am on the login screen")
    public void onTheLoginScreen(){
        loginScreen.validateOnLoginScreen();
    }

    @When("I input correct email")
    public void inputFieldEmail(){
        String email = "andira@gmail.com";
        loginScreen.inputFieldEmail(email);
    }

    @And("I input correct password")
    public void inputFieldPassword(){
        String password = "12345678";
        loginScreen.inputFieldEmail(password);
    }

    @When("I click button login")
    public void clickButtonLogin() {
        loginScreen.clickButtonLogin();
    }

    @Then("I get result the message")
    public void validateOnHomeScreen() {
        homeScreen.validateOnHomeScreen();
    }


}
