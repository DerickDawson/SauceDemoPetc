package com.saucedemo.pc.pages;

import com.saucedemo.pc.utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    public WebDriver driver;

    public static By FILTER = By.xpath("//select[@class='product_sort_container']");
    public static By FIRST_ITEM = By.xpath("//div[@class='inventory_list']/div[1]//div/button");
    public static By SECOND_ITEM = By.xpath("//div[@class='inventory_list']/div[2]//div/button");
    public static By SHOPPING_CART_ICON = By.xpath("//a[@class='shopping_cart_link']");

    public static String FILTER_BY_PRICE_LOW_TO_HIGH = "Price (low to high)";

    public ProductsPage(WebDriver driver ) {
        this.driver=driver;
        checkPageLoaded();
        filterProducts();
    }

    public void filterProducts() {
        selectFromDropDown(driver,FILTER, FILTER_BY_PRICE_LOW_TO_HIGH);
        clickElement(driver,FIRST_ITEM, "FIRST_ITEM");
        clickElement(driver,SECOND_ITEM, "SECOND_ITEM");
        clickElement(driver,SHOPPING_CART_ICON, "SHOPPING_CART_ICON");
        new YourCartPage(driver);
    }

    public void checkPageLoaded(){
        checkPageLaunched(driver, getClass().getSimpleName() );
    }

}
