package test.automation.pages;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import test.automation.hooks.AppiumHelper;
import test.automation.pageobject.BasePageObject;

public class VolunteerScreen extends BasePageObject {

    AppiumHelper helper = new AppiumHelper(getDriver());

    By fieldAddLinkOfThePost1() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Tambahkan link\"]");
    }

    By fieldAddLinkOfThePost2() {
        return MobileBy.xpath("//android.view.View/android.widget.EditText");
    }

    By btnSimpanAmbilAksi() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Simpan\"]");
    }

    By btnSimpanAddLink() {
        return MobileBy.AccessibilityId("Simpan");
    }

    By btnDaftarVolunteer() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");
    }

    By btnAmbilAksi() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Ambil aksi\"]");
    }

    By btnBackToHomeScreen() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Kembali ke beranda\"]");
    }

    By btnlihatSelengkapnyaTindakan() {
        // button lihat selengkapnya masih error digantikan ke button aksi
        return MobileBy.xpath(
                "//android.widget.ImageView[@content-desc=\"Aksi 1\n"
                        + "Upload foto kamu saat menggunakan sabuk pengaman di media sosial\"]");
    }

    By detailHowToJoinAksi() {
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Cara ikutan\n" + //
                "Pada dasarnya, fungsi sabuk pengaman adalah untuk melindungi penumpang, baik dalam kondisi biasa maupun darurat. Lakukan aksimu dengan mengunggah foto memakai sabuk pengaman saat bepergian dan bagikan ke sosial media milik kamu. Jangan lupa gunakan tagar #SampaiTujuanDenganAman\"]");
    }

    By detailVolunteerTitle() {
        return MobileBy.AccessibilityId("Detail Volunteer");
    }

    By alertSuccess() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Selamat!\"]");
    }

    By alertFailed() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Oh tidak, maaf!\"]");
    }

    public void inputLinkOfThePost(String link) {
        helper.scrollDown();
        click(fieldAddLinkOfThePost1());
        click(fieldAddLinkOfThePost2());
        sendKeys(fieldAddLinkOfThePost2(), link);
    }

    public void clickDaftarVolunteerButton() {
        click(btnDaftarVolunteer());
    }

    public void clickAmbilAksiButton() {
        click(btnAmbilAksi());
    }

    public void clickSimpanButtonAmbilAksi() {
        click(btnSimpanAmbilAksi());
    }

    public void clickSimpanAddLinkButton() {
        click(btnSimpanAddLink());
    }

    public void clickBackToHomeScreenButton() {
        click(btnBackToHomeScreen());
    }

    public void clickLihatSelengkapnyaTindakan() {
        helper.scrollDown();
        // helper.wait(2000);
        click(btnlihatSelengkapnyaTindakan());
    }

    public void checkSuccessNotification() {
        isDisplayed(alertSuccess());
    }

    public void checkFailedNotification() {
        isDisplayed(alertFailed());
    }

    public void checkDetailVolunteer() {
        isDisplayed(detailVolunteerTitle());
    }

    public void checkDetailHowToJoinAksi() {
        isDisplayed(detailHowToJoinAksi());
    }

}
