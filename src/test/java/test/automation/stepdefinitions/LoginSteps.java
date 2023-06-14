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
    public void openScoiops() throws InterruptedException {
        loginScreen.validateOnLoginScreen();
        Thread.sleep(5000);
    }
    @When("on the login screen")
    public void onLoginScreen() throws InterruptedException {
        loginScreen.validateOnLoginScreen();
        boolean actual = loginScreen.validateOnLoginScreen();
        Assert.assertTrue(actual);
        Thread.sleep(5000);
    }
    @And("I input incomplete email")
    public void inputIncompleteEmail() throws InterruptedException {
        loginScreen.inputFieldEmail("nice");
        Thread.sleep(1000);
    }
    @Then("I get result the message")
    public void getMessage(){

    }

// Verify Email field outline when user feeling with email type //
    @And ("I input email")
    public void inputRightEmail() throws InterruptedException {
        loginScreen.inputFieldEmail("absor@gmail.com");
        Thread.sleep(1000);
    }

// Verify password field outline when user feeling password //
    @And("I input password")
    public void inputRightPassword() throws InterruptedException {
        loginScreen.inputFieldPassword("11223344");
        Thread.sleep(1000);
    }

// User can type a text, symbol, and number in email field
    @And ("Click login with email field")
    public void clickloginEmail(){}
    @And("Input email field")
    public void insertEmailField() throws InterruptedException {
        loginScreen.inputFieldPassword("absor123@gmail.com");
        Thread.sleep(1000);
    }

// User can type a text, symbol, and number in password field
    @And ("Click login with password field")
    public void clickPASSField(){}
    @And ("Input password field")
    public void inputPASSField() throws InterruptedException {
        loginScreen.inputFieldPassword("1122ABCD");
        Thread.sleep(1000);
    }

// Verify user can log in with account SOCIOPS
    @And ("I click Login Button")
    public void clickLoginButton() throws InterruptedException {
        loginScreen.clickButtonLogin();
        Thread.sleep(1000);
    }
    @Then ("I am on dashboard page")
    public void onDashboard(){
    }

// Verify user can't log in without input password
    @And ("I input blank password")
    public void inputBlankPass() throws InterruptedException {
        loginScreen.inputFieldPassword("");
        Thread.sleep(1000);
    }
    @Then ("I get message")
    public void getMessageNotify(){}

 // Verify user can't log in without input email
    @And ("I input blank email")
    public void inputBlankEmail() throws InterruptedException {
        loginScreen.inputFieldEmail("");
        Thread.sleep(1000);
    }
    @And ("I input  password")
    public void inputPassword(){}

//Verify User can't log in with unregister email
    @And ("I input unregister email")
    public void inputUnregistEmail() throws InterruptedException {
        loginScreen.inputFieldEmail("elisandra@mail.com");
        Thread.sleep(1000);
    }
    @And ("I input unregister password")
    public void inputunregistPass() throws InterruptedException {
        loginScreen.inputFieldPassword("HaiElisa12");
        Thread.sleep(1000);}

// Verify user can't log in with inccorect password
    @And ("I input incorrect password")
    public void incorrectPassword() throws InterruptedException {
        loginScreen.inputFieldPassword("123?{++<");
        Thread.sleep(1000);
    }
}
