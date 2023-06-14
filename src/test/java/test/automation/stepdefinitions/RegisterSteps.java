package test.automation.stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.LoginScreen;
import test.automation.pages.RegisterScreen;

public class RegisterSteps {
    LoginScreen loginScreen = new LoginScreen();
    RegisterScreen registerScreen = new RegisterScreen();


// Verify register feature
    @Given ("I Open SOCIOPS Apps")
    public void openApps() throws InterruptedException {
        loginScreen.validateOnLoginScreen();
        boolean actual = loginScreen.validateOnLoginScreen();
        Assert.assertTrue(actual);
        Thread.sleep(5000);
    }
    @And ("I am on the login page and scroll down")
    public void loginPageScroll(){
        loginScreen.validateOnLoginScreen();
    }
    @When ("Click Buat Akun")
    public void buatakunClicked(){
        registerScreen.clickButtonBuatAkun();
    }
    @And ("Input email and password")
    public void inputEmailPassword() throws InterruptedException {
        registerScreen.inputEmailRegist("elisa@mail.com");
        Thread.sleep(1000);
        registerScreen.inputPassRegist("12312389");
        Thread.sleep(1000);
    }
    @And ("Click Register")
    public void clickRegister() throws InterruptedException {
        registerScreen.clickToRegist();
        Thread.sleep(1000);
    }

// Verify user can't register with invalid email
    @And ("Input invalid email and password")
    public void inputInvalidEmailPass() throws InterruptedException {
        registerScreen.inputEmailRegist("absorrr1111");
        Thread.sleep(1000);
    }
    @Then ("i get messages registration")
    public void getMessRegist(){}

// Verify user cannot create account with email that already exist
    @And ("Input already registered email and password")
    public void inputRegisteredEmail() throws InterruptedException {
        registerScreen.inputEmailRegist("absor@gamil.com");
        Thread.sleep(1000);
    }

// Verify user cannot create account with invalid password
    @And ("Input email and 6 char password")
    public void inputInvalidPass() throws InterruptedException {
        registerScreen.inputPassRegist("AAAB26");
        Thread.sleep(1000);
    }
}
