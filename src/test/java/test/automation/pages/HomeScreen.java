package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.waits.WaitUntilTargetIsReady;
import net.thucydides.core.annotations.Step;

import static org.mockito.Mockito.timeout;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.interactions.touch.Move;
import org.openqa.selenium.support.ui.ExpectedConditions;

import test.automation.pageobject.BasePageObject;

public class HomeScreen extends BasePageObject{
    
    By homeText(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }

    By searchBar(){
        return MobileBy.xpath("//android.widget.HorizontalScrollView/android.widget.EditText");
    }

    By volunteerButtonHome(){
        return MobileBy.xpath("//android.widget.ImageView[@content-desc=\"Volunteer\"]");
    }

    public void validateOnHomeScreen(){
        isDisplayed(homeText());
    }

    public void validateOnHomeScreenSearch(){
        isDisplayed(searchBar());
    }

    public void clickVolunteerButtonHome(){
        click(volunteerButtonHome());
    }

}
