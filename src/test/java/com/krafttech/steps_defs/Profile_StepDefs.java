package com.krafttech.steps_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.EditProfilePage;
import com.krafttech.pages.OverviewPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Profile_StepDefs {

    DashboardPage dashboardPage = new DashboardPage();
    OverviewPage overviewPage = new OverviewPage();
    EditProfilePage editProfilePage = new EditProfilePage();

    @When("User should go to my profile {string}")
    public void user_should_go_to_my_profile(String tabName) {
        dashboardPage.navigateToModule(tabName, "My Profile");
    }

    @When("User should navigate to {string}")
    public void user_should_navigate_to(String tabName) {
        overviewPage.tapOnTab(tabName);

    }

    @When("User should fill out {string}, {string},{string},{string},{string},{string},input box")
    public void user_should_fill_out_input_box(String about, String company, String job,
                                               String website, String location, String skills) {
        editProfilePage.aboutInputBox.sendKeys(about);
        editProfilePage.companyInputBox.sendKeys(company);
        editProfilePage.jobTitle.sendKeys(job);
        editProfilePage.websiteInputBox.sendKeys(website);
        editProfilePage.locationInputBox.sendKeys(location);
        editProfilePage.skillsInputBox.sendKeys(skills);
        BrowserUtils.clickWithJS(editProfilePage.saveChangesButton);
        BrowserUtils.waitFor(3);
    }
    @Then("User should verify the {string} message")
    public void user_should_verify_the_message(String text) {
        String expected = text;
        String actual = overviewPage.profileUpdatedText.getText();
        Assert.assertEquals(expected,actual);
    }


}



