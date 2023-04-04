package com.krafttech.steps_defs;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPage;
import com.krafttech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Dashboard_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    @Then("Validate all tabs are on the page")
    public void validate_all_tabs_are_on_the_page(List<String> tabNames) {
    List<String> expected = tabNames;
    List<String> actual = BrowserUtils.getElementsText(dashboardPage.menuList);
        Assert.assertEquals(expected,actual);
    }

    @Then("Enter credentials and validate user is on the home page")
    public void enter_credentials_and_validate_user_is_on_the_home_page(Map<String,String> map) {
       loginPage.login(
               map.get("userEmail"),
               map.get("password")
       );
       String expected = map.get("name");
        String actual = dashboardPage.getAccountName();
        Assert.assertEquals(expected,actual);
    }
    @Then("Verify that {string} is visible on the dashboard")
    public void verify_that_is_visible_on_the_dashboard(String name) {
        String expectedName = name;
        String actualName = dashboardPage.getAccountName();
        Assert.assertEquals(expectedName,actualName);
    }
    @When("Go to {string} and {string}")
    public void go_to_and(String tab, String module) {
        dashboardPage.navigateToModule(tab,module);
    }
    @Then("Verify that {string} and {string} and {string}")
    public void verify_that_and_and(String title1, String title2, String title3) {
        String expected1=title1;
        String expected2=title2;
        String expected3 = title3;
        String actual1 = dashboardPage.firstTitle.getText();
        String actual2 = dashboardPage.secondTitle.getText();
        String actual3 = dashboardPage.thirdTitle.getText();
        Assert.assertEquals(expected1,actual1);
        Assert.assertEquals(expected2,actual2);
        Assert.assertEquals(expected3,actual3);
    }

}
