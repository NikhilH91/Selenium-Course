package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        System.out.println("Title of the page is-1");
        ChromeOptions options = new ChromeOptions();
                System.out.println("Title of the page is-2");
        options.addArguments("headless");
                System.out.println("Title of the page is-3");
        options.addArguments("disable-gpu");
                System.out.println("Title of the page is-4");
        driver = new ChromeDriver(options);
                System.out.println("Title of the page is-5");
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


