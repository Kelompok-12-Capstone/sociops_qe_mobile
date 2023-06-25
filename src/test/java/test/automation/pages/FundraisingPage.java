package test.automation.pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class FundraisingPage extends BasePageObject {

    //Scenario1

    By homeScreen() {
        return MobileBy.xpath("//android.widget.HorizontalScrollView/android.widget.EditText");
    }

    By fundraisingButton() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Galang Dana\"]");
    }


    By donasiSekarangButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Donasi sekarang\"]");
    }

    By donasiSekarangButton1() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Donasi sekarang\"]");
    }

    By chooseNominalButtoon() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Rp2.000\"]");
    }

    By pilihPembayaranButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Pilih pembayaran\"]");
    }

    By paymentMethodField() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Choose payment method\"]");
    }

    By choosePaymentMethod() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"BNI Virtual Account\"]");
    }

    By clickBayarButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Bayar\"]");
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


    public void iClickDonasiSekarangButoon() {
        click(donasiSekarangButton());
    }


    public void iClickDonasiSekarangButton1() {
        click(donasiSekarangButton1());
    }


    public void iChooseNominalForFundraising() {
        click(chooseNominalButtoon());
    }

    public void iClickPilihPembayaranButton() {
        click(pilihPembayaranButton());
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


    public void iClickPergiKeMitransButton() {
        click(pergiKeMitrans());
    }

    public void iOnThePaymentSuccesScreen() {
         isDisplayed(notifikasiPembayaran());
    }
}
