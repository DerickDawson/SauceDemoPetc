package com.saucedemo.pc.utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected static WebDriver driver;
    private static final String URL = "https://www.saucedemo.com/";
    private static final String CHROME_PROPERTY = "webdriver.chrome.driver";
    private static final String CHROME_DRIVER_PATH = "./chromedriver-win64/chromedriver.exe";

    @Before
    public void launchChrome(){

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");

        System.setProperty(CHROME_PROPERTY,CHROME_DRIVER_PATH);
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
