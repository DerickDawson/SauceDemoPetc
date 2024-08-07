package com.saucedemo.pc.pages;

import com.saucedemo.pc.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourCartPage extends BasePage {
    public WebDriver driver;

    public static By CHECKOUT_BUTTON = By.xpath("//button[@id='checkout']");

    public YourCartPage(WebDriver driver ) {
        this.driver=driver;
        checkPageLoaded();
        clickCheckoutButton();
    }

    public void clickCheckoutButton() {
        clickElement(driver,CHECKOUT_BUTTON, "CHECKOUT_BUTTON");
        new YourInformationPage(driver);
    }

    public void checkPageLoaded(){
        checkPageLaunched(driver, getClass().getSimpleName() );
    }

}
