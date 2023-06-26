package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class HomeScreen {
    
    By homeText(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc='Masuk']");
    }

    

}
