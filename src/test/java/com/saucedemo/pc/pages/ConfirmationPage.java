package com.saucedemo.pc.pages;

import com.saucedemo.pc.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage extends BasePage {
    public WebDriver driver;

    public static By CONFIRMATION_TEXT = By.xpath("//h2[text()='Thank you for your order!']");
    public static String expectedText = "Thank you for your order!";

    public ConfirmationPage(WebDriver driver ) {
        this.driver=driver;
        checkPageLoaded();
        checkConfirmationPageText();
    }

    public void checkConfirmationPageText() {
        checkText(driver,CONFIRMATION_TEXT, expectedText);
    }

    public void checkPageLoaded(){
        checkPageLaunched(driver, getClass().getSimpleName() );
    }

}
