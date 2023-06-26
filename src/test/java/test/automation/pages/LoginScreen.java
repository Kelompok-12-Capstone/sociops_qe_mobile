package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    By fieldEmail(){ 
        return MobileBy.xpath("//android.widget.EditText[1]");
    }

    By fieldPassword() { 
        return MobileBy.xpath("//android.widget.EditText[2]");
    }

    By buttonLogin(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc='Masuk']");
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

    public void validateOnLoginScreen(){
        isDisplayed(buttonLogin());
    }
}
