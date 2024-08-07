package com.saucedemo.pc.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class BasePage {

    public void sendKeysFunction(WebDriver driver, By element, String keysToSend) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        boolean isClicked = true;

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            driver.findElement(element).clear();
            driver.findElement(element).sendKeys(keysToSend);

        }catch(Exception e) {
            isClicked = false;
            System.out.println(keysToSend + " not entered.");
        }
       if(isClicked){
           System.out.println(keysToSend + " entered.");
       }
    }

    public void clickElement(WebDriver driver, By element, String fieldName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        boolean isClicked = true;

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            driver.findElement(element).click();

        }catch(Exception e) {
            isClicked = false;
            System.out.println(fieldName + " not clicked.");
        }
        if(isClicked){
            System.out.println(fieldName + " clicked.");
        }
    }

    public void selectFromDropDown(WebDriver driver, By element, String searchText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        boolean isClicked = true;

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            WebElement webElement = driver.findElement(element);
            Select dropdown = new Select(webElement);
            dropdown.selectByVisibleText(searchText);

        }catch(Exception e) {
            isClicked = false;
            System.out.println(searchText + " not selected.");
        }
        if(isClicked){
            System.out.println(searchText + " selected.");
        }
    }

    public void checkPageLaunched(WebDriver driver, String className){
        boolean isLaunched = true;
        String actualTitle = driver.getTitle();
        String expectedTitle = "Swag Labs";

        try{
            assertEquals(expectedTitle,actualTitle);
        } catch(Exception e){
            isLaunched = false;
            System.out.println(className + "is not launched");
        }

        if(isLaunched){
            System.out.println(className + " is launched");
        }
    }

    public void checkText(WebDriver driver, By element, String expectedText){
        boolean isLaunched = true;
        String actualText = driver.findElement(element).getText();

        try{
            assertEquals(expectedText,actualText);
        } catch(Exception e){
            isLaunched = false;
            System.out.println(expectedText + "does not match");
        }

        if(isLaunched){
            System.out.println(expectedText + " matches");
        }
    }


}
