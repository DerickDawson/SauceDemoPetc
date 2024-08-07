package com.saucedemo.pc.pages;

import com.saucedemo.pc.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourInformationPage extends BasePage {
    public WebDriver driver;

    public static By FIRST_NAME = By.xpath("//input[@id='first-name']");
    public static By LAST_NAME = By.xpath("//input[@id='last-name']");
    public static By POSTAL_CODE = By.xpath("//input[@id='postal-code']");
    public static By CONTINUE_BUTTON = By.xpath("//input[@id='continue']");

    public static String first_name = "John";
    public static String last_name = "Doe";
    public static String postal_code = "2148";

    public YourInformationPage(WebDriver driver ) {
        this.driver=driver;
        checkPageLoaded();
        enterCustomerInfo();
    }

    public void enterCustomerInfo() {
        sendKeysFunction(driver,FIRST_NAME,first_name);
        sendKeysFunction(driver,LAST_NAME,last_name );
        sendKeysFunction(driver,POSTAL_CODE,postal_code);
        clickElement(driver,CONTINUE_BUTTON, "CONTINUE_BUTTON");
        new CheckoutPage(driver);
    }

    public void checkPageLoaded(){
        checkPageLaunched(driver, getClass().getSimpleName() );
    }

}
