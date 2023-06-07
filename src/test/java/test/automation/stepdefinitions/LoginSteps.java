package test.automation.stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.LoginScreen;

public class LoginSteps {
    LoginScreen loginScreen = new LoginScreen();

// Verify Email field outline when user feeling without email type or incomplete email //
    @Given("I am open app socioPs")
    public void openScoiops(){
        loginScreen.validateOnLoginScreen();
    }
    @When("on the login screen")
    public void onLoginScreen(){
        loginScreen.validateOnLoginScreen();
        boolean actual = loginScreen.validateOnLoginScreen();
        Assert.assertTrue(actual);
    }
    @And("I input incomplete email")
    public void inputIncompleteEmail(){
        loginScreen.inputFieldEmail("nice");
    }
    @Then("I get result the message")
    public void getMessage(){

    }

// Verify Email field outline when user feeling with email type //
    @And ("I input email")
    public void inputRightEmail(){
        loginScreen.inputFieldEmail("absor@gmail.com");
    }

// Verify password field outline when user feeling password //
    @And("I input password")
    public void inputRightPassword(){
        loginScreen.inputFieldPassword("11223344");
    }

// User can type a text, symbol, and number in email field
    @And ("Click login with email field")
    public void clickloginEmail(){}
    @And("Input email field")
    public void insertEmailField(){
        loginScreen.inputFieldPassword("absor123@gmail.com");
    }

// User can type a text, symbol, and number in password field
    @And ("Click login with password field")
    public void clickPASSField(){}
    @And ("Input password field")
    public void inputPASSField(){
        loginScreen.inputFieldPassword("1122ABCD");
    }

// Verify user can log in with account SOCIOPS
    @And ("I click Login Button")
    public void clickLoginButton(){
        loginScreen.clickButtonLogin();
    }
    @Then ("I am on dashboard page")
    public void onDashboard(){

    }

// Verify user can't log in without input password
    @And ("I input blank password")
    public void inputBlankPass(){
        loginScreen.inputFieldPassword("");
    }
    @Then ("I get message")
    public void getMessageNotify(){}

 // Verify user can't log in without input email
    @And ("I input blank email")
    public void inputBlankEmail(){
        loginScreen.inputFieldEmail("");
    }
    @And ("I input  password")
    public void inputPassword(){}

//Verify User can't log in with unregister email
    @And ("I input unregister email")
    public void inputUnregistEmail(){
        loginScreen.inputFieldEmail("elisandra@mail.com");
    }
    @And ("I input unregister password")
    public void inputunregistPass(){
        loginScreen.inputFieldPassword("HaiElisa12");}

// Verify user can't log in with inccorect password
    @And ("I input incorrect password")
    public void incorrectPassword(){
        loginScreen.inputFieldPassword("123?{++<");
    }
}
