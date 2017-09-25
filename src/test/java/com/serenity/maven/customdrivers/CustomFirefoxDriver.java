package com.serenity.maven.customdrivers;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CustomFirefoxDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        FirefoxDriverManager.getInstance().setup("0.14.0");
        return new FirefoxDriver();
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}

