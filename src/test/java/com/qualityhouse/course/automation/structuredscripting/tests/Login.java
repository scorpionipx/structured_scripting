package com.qualityhouse.course.automation.structuredscripting.tests;

import com.qualityhouse.course.automation.structuredscripting.library.CommonLib;
import com.qualityhouse.course.automation.structuredscripting.library.LoginLib;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    private WebDriver driver;

    @Before
    public void startUp() {
        driver = CommonLib.openBrowser();

        CommonLib.navigateToApp(driver);
    }

    @After
    public void tearDown() {
        CommonLib.closeBrowser(driver);
    }

    @Test
    public void tcLoginUser1 () {
        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student1", "stpass1");

        CommonLib.logoutFromApp(driver);

        Assert.assertEquals("User is not logged out.", true, driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed());
    }

    @Test
    public void tcLoginUser2 () {
        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student2", "stpass2");

        CommonLib.logoutFromApp(driver);

        Assert.assertEquals("User is not logged out.", true, driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed());
    }

    @Test
    public void tcLoginUser3 () {
        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student3", "stpass3");

        CommonLib.logoutFromApp(driver);

        Assert.assertEquals("User is not logged out.", true, driver.findElement(By.cssSelector("a[href='index.php?page=login']")).isDisplayed());
    }

    @Test
    public void tcTooManyUnsuccessfulLogins() {
        LoginLib.navigateToLoginPage(driver);

        LoginLib.loginAsUser(driver, "student1", "wrong");

        LoginLib.loginAsUser(driver, "student1", "wrong");

        LoginLib.loginAsUser(driver, "student1", "wrong_again");

        Assert.assertEquals("Warning message is not displayed.", true, driver.findElement(By.cssSelector("b.err")).isDisplayed());
    }

    @Test
    public void tcLoginWithSeveralUsers() {
        // todo: Exercise no. 1 - perform login (and logout) of three users (student1, student2, student3), sequentially
    }

}
