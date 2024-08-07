package com.saucedemo.pc.pages;

import com.saucedemo.pc.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public WebDriver driver;

    public static By FINISH_BUTTON = By.xpath("//button[@id='finish']");

    public CheckoutPage(WebDriver driver ) {
        this.driver=driver;
        checkPageLoaded();
        clickFinishButton();
    }

    public void clickFinishButton() {
        clickElement(driver,FINISH_BUTTON, "FINISH_BUTTON");
        new ConfirmationPage(driver);
    }

    public void checkPageLoaded(){
        checkPageLaunched(driver, getClass().getSimpleName() );
    }

}
