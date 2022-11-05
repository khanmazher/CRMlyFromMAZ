package com.mazprojects.step_definitions;

import com.github.javafaker.Faker;
import com.mazprojects.pages.DashboardPage;
import com.mazprojects.pages.LoginPage;
import com.mazprojects.utilities.BrowserUtils;
import com.mazprojects.utilities.ConfigurationReader;
import com.mazprojects.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    Faker faker = new Faker();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        //nextBaseCrmLoginPage.loginLink.click();
    }
    @When("user enters {string},{string}")
    public void user_enters(String email, String password) {
        loginPage.userNameInput.sendKeys(email);
        loginPage.passwordInput.sendKeys(password);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user should see username on the profile tab")
    public void user_should_see_username_on_the_profile_tab() {
        BrowserUtils.verifyElementDisplayed(dashboardPage.idName);
        System.out.println("username = " + dashboardPage.idName.getText());
    }


    @Given("the user logs in as a {string}")
    public void the_User_LogsIn_As_A(String userType) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.loginAs(userType);

    }

}
