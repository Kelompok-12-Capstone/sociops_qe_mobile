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

    // scenario1
    @Given("I on the home screen")
    public void onTheHomeScreen() {
        fundraisingPage.iOnTheHomeScreen();
    }

    @When("I click fundraising button")
    public void clickFundraisingButton() {
        fundraisingPage.iClickFundraisingButton();
    }

    @And("I on the fundraising screen")
    public void OnTheFundraisingScreenAndSeeDetailFundraisingProgram() {
        fundraisingPage.iOnTheFundraisingScreen();
    }

    @And("I click donasi sekarang button")
    public void clickDonasiSekarangButton() {
        fundraisingPage.iClickDonasiSekarangButoon();
    }

    @And("I on the detail fundraising screen")
    public void onTheDetailFundraisingScreen() {
        fundraisingPage.iOntheDetailFundraisingScreen();
    }

    @And("I click donasi sekarang button1")
    public void clickDonasiSekarangButton1() {
        fundraisingPage.iClickDonasiSekarangButton1();
    }

    @And("I on the pilih jumlah pembayaran screen")
    public void onThePilihJumlahPembayaranScreen() {
        fundraisingPage.iOnthePilihJumlahPembayaranScreen();
    }

    @And("I choose nominal for fundraising")
    public void chooseNominalForFundraising() {
        fundraisingPage.iChooseNominalForFundraising();
    }

    @And("I click pilih pembayaran button")
    public void clickPilihPembayaranButton() {
        fundraisingPage.iClickPilihPembayaranButton();
    }

    @And("I on the konfirmasi donasi screen")
    public void onTheKonfirmasiDonasiScreen() {
        fundraisingPage.iOnTheKonfirmasiDonasiScreen();
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

    @And("I on the kode pembayaran screen")
    public void onTheKodePembayaranScreen() {
        fundraisingPage.iOnTheKodePembayaranScreen();
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
