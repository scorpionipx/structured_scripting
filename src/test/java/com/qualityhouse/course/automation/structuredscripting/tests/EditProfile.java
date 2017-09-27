package com.qualityhouse.course.automation.structuredscripting.tests;

import com.qualityhouse.course.automation.structuredscripting.pageobjects.CommonPageObjects;
import com.qualityhouse.course.automation.structuredscripting.pageobjects.EditProfilePageObject;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditProfile {

    WebDriver driver = new ChromeDriver();

    CommonPageObjects common = new CommonPageObjects(driver);

    EditProfilePageObject editProfilePage = new EditProfilePageObject(driver);

    @Test
    public void editProfileUser1() {
        // todo: Exercise no. 4 - modify profile details of Student1

    }
}
