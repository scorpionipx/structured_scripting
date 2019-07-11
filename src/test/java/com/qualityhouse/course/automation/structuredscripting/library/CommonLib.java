package com.qualityhouse.course.automation.structuredscripting.library;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonLib {

    private static final String applicationURL = "https://acme.qualityhouse.com/build3/index.php";

    private final static Logger logger = Logger.getLogger(LoginLib.class);

    // initialize driver variable to use it in certain environment
    public static  WebDriver openBrowser() {
        logger.info("open Chrome browser");

        return new ChromeDriver();
    }

    // navigate to application's home url
    public static void navigateToApp(WebDriver driver) {
        logger.info("navigate to home url: " + applicationURL);

        driver.get(applicationURL);
    }

    // logout from the application
    public static void logoutFromApp(WebDriver driver) {
        logger.info("log out from the application");

        driver.findElement(By.cssSelector("a[href='index.php?page=logout']")).click();

        driver.findElement(By.cssSelector("a.big-btn[href='index.php?ses_logout=1']")).click();
    }

    // close driver (browser)
    public static void closeBrowser(WebDriver driver) {
        logger.info("close all open browsers");

        driver.quit();
    }

}
