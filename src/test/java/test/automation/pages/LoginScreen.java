package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    By LoginPage(){
        //
        ////android.widget.ImageView[@content-desc="Masuk ke akun Anda Masukkan email dan kata sandi Anda untuk masuk ke akun Atau lanjutkan dengan Tidak punya akun ?"]/android.widget.EditText[1]
        return MobileBy.xpath("");
    }
    By fieldEmail(){ 
        return MobileBy.xpath("\t\n"  +
                "//android.widget.ImageView[@content-desc=\"Masuk ke akun Anda Masukkan email dan kata sandi Anda untuk masuk ke akun Atau lanjutkan dengan Tidak punya akun ?\"]/android.widget.EditText[1]");
    }

    By fieldPassword() { 
        return MobileBy.xpath("\t\n" +
                "//android.widget.ImageView[@content-desc=\"Masuk ke akun Anda Masukkan email dan kata sandi Anda untuk masuk ke akun Atau lanjutkan dengan Tidak punya akun ?\"]/android.widget.EditText[2]");
    }

    By buttonLogin(){ 
        return MobileBy.xpath("\t\n" +
                "//android.widget.Button[@content-desc=\"Masuk\"]");
    }

    public void inputFieldEmail(String email) {
        click(fieldEmail());
        sendKeys(fieldEmail(),email);
    }

    public void inputFieldPassword(String password){
        click(fieldPassword());
        sendKeys(fieldPassword(),password);
    }

    public void clickButtonLogin(){ 
        click(buttonLogin());
    }

    public boolean validateOnLoginScreen() {
        return isDisplayed(buttonLogin());
    }
}
