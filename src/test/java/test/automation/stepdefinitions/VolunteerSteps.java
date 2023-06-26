package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HomeScreen;
import test.automation.pages.VolunteerScreen;

public class VolunteerSteps {

    HomeScreen homeScreen = new HomeScreen();

    VolunteerScreen volunteerScreen = new VolunteerScreen();

    /// Positive

    @Given("I am on the home screen")
    public void onTheLoginScreen() {
        homeScreen.validateOnHomeScreenSearch();
    }

    // @And("I click volunteer button")
    // public void clickVolunteerButtonHome() {
    //     homeScreen.clickVolunteerButtonHome();
    // }

    @And("I click volunteer button home")
    public void clickVolunteerButtonHome(){
        homeScreen.clickVolunteerButtonHome();
    }

    @And("I click daftar button from the campaign")
    public void clickDaftarVolunteerButton() {
        volunteerScreen.clickDaftarVolunteerButton();
    }

    @And("I click Ambil Aksi button")
    public void clickAmbilAksiButton() {
        volunteerScreen.clickAmbilAksiButton();
    }

    @When("I add link of the post")
    public void typeLinkOfThePost() {
        String link = "https://drive.gogle.com/";
        volunteerScreen.inputLinkOfThePost(link);
        volunteerScreen.clickSimpanAddLinkButton();
    }

    @And("I click simpan button ambil aksi")
    public void clickSimpanButtonAmbilAksi() {
        volunteerScreen.clickSimpanButtonAmbilAksi();
    }

    @And("I click Kembali ke beranda")
    public void clickBackToHomeScreenButton() {
        volunteerScreen.clickBackToHomeScreenButton();
    }

    @When("I click lihat selengkapnya tindakan button")
    public void clickLihatSelengkaptnyaTindakan() {
        volunteerScreen.clickLihatSelengkapnyaTindakan();
    }

    @Then("I will get success notification")
    public void checkSuccessNotification() {
        volunteerScreen.checkSuccessNotification();
    }

    @Then("I will go to the home screen")
    public void checkBackToHomeScreen() {
        homeScreen.validateOnHomeScreenSearch();
    }

    @Then("I will see detail of the volunteer")
    public void checkDetailVolunteer() {
        volunteerScreen.checkDetailVolunteer();
    }

    @Then("I will see details of action to take when join volunteer")
    public void checkDetailHowToJoinAksi() {
        volunteerScreen.checkDetailHowToJoinAksi();
    }

    /// Negative

    @Then("I will get failed notification")
    public void checkFailedNotification() {
        volunteerScreen.checkFailedNotification();
    }

}
