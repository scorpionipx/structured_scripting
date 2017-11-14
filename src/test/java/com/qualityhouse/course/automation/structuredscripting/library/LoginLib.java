package com.qualityhouse.course.automation.structuredscripting.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;

public class LoginLib {

    private final static Logger logger = Logger.getLogger(LoginLib.class);

    // open login page
    public static void navigateToLoginPage(WebDriver driver) {
        logger.info("navigate to login page");

        driver.findElement(By.cssSelector("a[href='index.php?page=login']")).click();
    }

    // login in as given user, with provided username and password
    public static void loginAsUser(WebDriver driver, String username, String password) {
        logger.info("log in as user - username = " + username + ", password = " + password);

        driver.findElement(By.id("username")).sendKeys(username);

        driver.findElement(By.name("userpass")).sendKeys(password);

        driver.findElement(By.name("ses_login")).click();
    }

}
