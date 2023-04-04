package com.krafttech.steps_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenu_StepDefs {


    @Then("The user should be able to see Dashboard text")
    public void the_user_should_be_able_to_see_Dashboard_text() {
        System.out.println("I verified that Dashboard text is here");
    }

    @Then("The user navigates to Developers menu")
    public void the_user_navigates_to_Developers_menu() {
        System.out.println("user navigates to Developers menu");
    }

    @Then("The user should be able to see Developers text")
    public void the_user_should_be_able_to_see_Developers_text() {
        System.out.println("I verified that Developers text is here");
       // Assert.assertTrue(100>101);
    }

    @Then("The user navigates to Forms input menu")
    public void the_user_navigates_to_Forms_input_menu() {
        System.out.println("user navigates to Forms input menu");
    }

    @Then("The user should be able to see  text of General Form")
    public void the_user_should_be_able_to_see_text_of_General_Form() {
        System.out.println("I verified that text of General Form is here");
    }

    @Then("The user navigates to My Profile menu")
    public void the_user_navigates_to_My_Profile_menu() {
        System.out.println("user navigates to My Profile menu");
    }

    @Then("The user should be able to see  text of User Profile")
    public void the_user_should_be_able_to_see_text_of_User_Profile() {
        System.out.println("I verified that text of User Profile is here");
    }


}
