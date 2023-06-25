package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.automation.pages.FundraisingPage;

public class FundraisingStep {

    @Steps
    FundraisingPage fundraisingPage;

    //scenario1
    @Given("I on the home screen")
    public void onTheHomeScreen() {
        fundraisingPage.iOnTheHomeScreen();
    }

    @When("I click fundraising button")
    public void clickFundraisingButton() {
        fundraisingPage.iClickFundraisingButton();
    }


    @And("I click donasi sekarang button")
    public void clickDonasiSekrangButton() {
        fundraisingPage.iClickDonasiSekarangButoon();
    }


    @And("I click donasi sekarang button1")
    public void clickDonasiSekrangButton1() {
        fundraisingPage.iClickDonasiSekarangButton1();
    }



    @And("I choose nominal for fundraising")
    public void chooseNominalForFundraising() {
        fundraisingPage.iChooseNominalForFundraising();
    }

    @And("I click pilih pembayaran button")
    public void clickPilihPembayaranButton() {
        fundraisingPage.iClickPilihPembayaranButton();
    }


    @And("I click payment method field")
    public void clickPaymentMethodField() {
        fundraisingPage.iClickPaymentMethodField();
    }

    @And("I choose payment method field")
    public void choosePaymentMethodField() {
        fundraisingPage.iChoosePaymentMethodField();
    }

    @And("I click bayar button")
    public void clickBayarButton() {
        fundraisingPage.iClickBayarButton();
    }


    @And("I click pergi ke mitrans after success payment")
    public void clickPergiKeMitransAfterSuccessPayment() {
        fundraisingPage.iClickPergiKeMitransButton();
    }

    @Then("I on the payments success screen")
    public void onThePaymentsSuccessScreen() {
        fundraisingPage.iOnThePaymentSuccesScreen();
    }

}
