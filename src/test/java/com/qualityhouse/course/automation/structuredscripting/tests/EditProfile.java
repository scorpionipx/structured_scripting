package com.qualityhouse.course.automation.structuredscripting.tests;

import com.qualityhouse.course.automation.structuredscripting.library.CommonLib;
import org.junit.*;
import org.openqa.selenium.WebDriver;

public class EditProfile {

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
    public void editProfileUser1() {
        // todo: Exercise no. 3 - modify profile details of Student1

    }
}
