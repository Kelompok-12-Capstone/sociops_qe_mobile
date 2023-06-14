package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject{
    By Loginscreens(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Masuk ke akun Anda Masukkan email dan kata sandi Anda untuk masuk ke akun Atau lanjutkan dengan Tidak punya akun ?\"]");}
    By registButton(){
        return MobileBy.xpath("\t\n" +
                "//android.widget.Button[@content-desc=\"Buat akun\"]");
    }
    By registEmailFill(){
        return MobileBy.xpath("\t\n" +
                "//android.widget.ImageView[@content-desc=\"Buat akun baru! Buat akun Anda dan dapatkan akses pertama ke campaign dan komunitas Sociops Atau lanjutkan dengan Sudah punya akun?\"]/android.widget.EditText[1]");
    }
    By registPasswordFill(){
        return MobileBy.xpath("\t\n" +
                "//android.widget.ImageView[@content-desc=\"Buat akun baru! Buat akun Anda dan dapatkan akses pertama ke campaign dan komunitas Sociops Atau lanjutkan dengan Sudah punya akun?\"]/android.widget.EditText[2]");
    }
    By registAccount(){return MobileBy.xpath("//android.widget.Button[@content-desc=\"Buat akun\"]");}

    public void clickButtonBuatAkun(){
        click(registButton());
    }
    public void inputEmailRegist(String email){
        click(registEmailFill());
        sendKeys(registEmailFill(),email);
    }
    public void inputPassRegist(String password){
        click(registPasswordFill());
        sendKeys(registPasswordFill(),password);
    }
    public void clickToRegist(){
        click(registAccount());
    }
}
