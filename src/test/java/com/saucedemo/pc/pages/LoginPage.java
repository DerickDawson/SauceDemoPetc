package com.saucedemo.pc.pages;

import com.saucedemo.pc.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public WebDriver driver;

    public static By USER_NAME = By.xpath("//input[@id='user-name']");
    public static By PASSWORD = By.xpath("//input[@id='password']");
    public static By LOGIN_BUTTON = By.xpath("//input[@id='login-button']");

    public static String user_name = "standard_user";
    public static String password = "secret_sauce";

    public LoginPage (WebDriver driver ) {
        this.driver=driver;
        checkPageLoaded();
        login();
    }

    private void login() {
        sendKeysFunction(driver, USER_NAME, user_name);
        sendKeysFunction(driver, PASSWORD, password);
        clickElement(driver,LOGIN_BUTTON, "LOGIN_BUTTON");
        new ProductsPage(driver);
    }

    public void checkPageLoaded(){
        checkPageLaunched(driver, getClass().getSimpleName() );
    }

}
