package test.automation.pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class FundraisingPage extends BasePageObject {

    //Scenario1

    By homeScreen() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Beranda Tab 1 of 4\"]");
    }

    By fundraisingButton() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Galang Dana\"]");
    }

    By fundraisingScreen() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Galang dana\"]");
    }

    By donasiSekarangButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Donasi sekarang\"]");
    }

    By detailFundraisingScreen() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Detail galang dana\"]");
    }

    By donasiSekarangButton1() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Donasi sekarang\"]");
    }

    By pilihJumlahPembayaranScreen() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Pilih jumlah pembayaran\"]");
    }

    By chooseNominalButtoon() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Rp2.000\"]");
    }

    By pilihPembayaranButton() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Rp2.000\"]");
    }

    By konfirmasiDonasiScreen() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Konfirmasi donasi\"]");
    }

    By paymentMethodField() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Choose payment method\"]");
    }

    By choosePaymentMethod() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"BNI Virtual Account\"]");
    }

    By clickBayarButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Bayar\"]\n");
    }

    By kodePembayaranScreen() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Kode pembayaran\"]");
    }

    By pergiKeMitrans() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pergi ke midtrans\"]");
    }

    By notifikasiPembayaran() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Notifikasi pembayaran\"]\n");
    }

    public void iOnTheHomeScreen() {
        isDisplayed(homeScreen());
    }

    public void iClickFundraisingButton() {
        click(fundraisingButton());
    }

    public void iOnTheFundraisingScreen() {
         isDisplayed(fundraisingScreen());
    }

    public void iClickDonasiSekarangButoon() {
        click(donasiSekarangButton());
    }

    public void iOntheDetailFundraisingScreen() {
         isDisplayed(detailFundraisingScreen());
    }

    public void iClickDonasiSekarangButton1() {
        click(donasiSekarangButton1());
    }

    public void iOnthePilihJumlahPembayaranScreen() {
         isDisplayed(pilihJumlahPembayaranScreen());
    }

    public void iChooseNominalForFundraising() {
        click(chooseNominalButtoon());
    }

    public void iClickPilihPembayaranButton() {
        click(pilihPembayaranButton());
    }

    public void iOnTheKonfirmasiDonasiScreen() {
         isDisplayed(konfirmasiDonasiScreen());
    }

    public void iClickPaymentMethodField() {
        click(paymentMethodField());
    }

    public void iChoosePaymentMethodField() {
        click(choosePaymentMethod());
    }

    public void iClickBayarButton() {
        click(clickBayarButton());
    }

    public void iOnTheKodePembayaranScreen() {
         isDisplayed(kodePembayaranScreen());
    }

    public void iClickPergiKeMitransButton() {
        click(pergiKeMitrans());
    }

    public void iOnThePaymentSuccesScreen() {
         isDisplayed(notifikasiPembayaran());
    }
}
