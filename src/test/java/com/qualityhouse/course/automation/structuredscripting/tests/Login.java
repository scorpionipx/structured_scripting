package com.qualityhouse.course.automation.structuredscripting.tests;

import com.qualityhouse.course.automation.structuredscripting.pageobjects.CommonPageObjects;
import com.qualityhouse.course.automation.structuredscripting.pageobjects.LoginPageObject;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver = new ChromeDriver();

    private LoginPageObject loginPage = new LoginPageObject(driver);

    CommonPageObjects common = new CommonPageObjects(driver);

    @Before
    public void setup() {
        common.openApplication();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void tcLoginUser1() {
        loginPage.open();

        loginPage.populateUsername("student1");

        loginPage.populatePassword("stpass1");

        loginPage.login();

        common.logout();
    }

    @Test
    public void tcLoginUser2() {
        loginPage.open();

        loginPage.populateUsername("student2");

        loginPage.populatePassword("stpass2");

        loginPage.login();

        common.logout();
    }

    @Test
    public void tcLoginUser3() {
        loginPage.open();

        loginPage.populateUsername("student3");

        loginPage.populatePassword("stpass3");

        loginPage.login();

        common.logout();
    }

    @Test
    public void tcTooManyUnsuccessfulLogins() {
        // todo: Exercise no. 1 - check if consecutive unsuccessful log in attempts raise warning
    }

    @Test
    public void tcLoginWithSeveralUsers() {
        // todo: Exercise no. 2 - perform login (and logout) of three users (student1, student2, student3), sequentially
    }
}
