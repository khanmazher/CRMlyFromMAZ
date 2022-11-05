package com.mazprojects.step_definitions;

import com.mazprojects.pages.DashboardPage;
import com.mazprojects.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Dashboard_StepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("The user should be able to see the company structure")
    public void the_user_should_be_able_to_see_the_company_structure() {
        dashboardPage.employeeTab.click();
        dashboardPage.companyStructureTab.click();
        Assert.assertTrue(dashboardPage.companyStructureBox.isDisplayed());

    }
    @When("The HR user should be able to add department")
    public void the_hr_user_should_be_able_to_add_department() {
        dashboardPage.addDepartmentClickBox.click();
    }

    @When("The HR user should be able to add department name")
    public void the_hr_user_should_be_able_to_add_department_name() {
        dashboardPage.inputDepartmentName.sendKeys("Marketing");
    }

    @When("The HR user should be able to select parent department")
    public void the_hr_user_should_be_able_to_select_parent_department() {
        dashboardPage.selectParentDepartment.click();
        //here I need a code for selecting drop down menu option Cyber Vet
    }

    @Then("The HR user should be able to add supervisors")
    public void the_hr_user_should_be_able_to_add_supervisors() {
        dashboardPage.clickOnSelectSupervisor.click();
        dashboardPage.clickOnRecentTab.click();
        dashboardPage.selectSupervisor1.click();
        dashboardPage.selectSupervisor2.click();
    }
    @Then("The HR user is able to close the add department pop-up at any time")
    public void the_hr_user_is_able_to_close_the_add_department_pop_up_at_any_time() {
        dashboardPage.clickOnAddButton.click();

    }

    @Given("The HR user is on the company structure section")
    public void the_hr_user_is_on_the_company_structure_section() {
        Assert.assertTrue(dashboardPage.companyStructureBox.isDisplayed());
    }
    @When("The HR user is able to edit departments")
    public void the_hr_user_is_able_to_edit_departments() {
        //here I need help in locating edit button

    }
    @When("The HR user is able to add child departments")
    public void the_hr_user_is_able_to_add_child_departments() {
        dashboardPage.addDepartmentClickBox.click();
        dashboardPage.inputDepartmentName.sendKeys("CRM");
        //here I need a code for selecting drop down menu option marketing


    }
    @When("The HR user is able to delete the departments")
    public void the_hr_user_is_able_to_delete_the_departments() {
        //here I need help in locating edit button

    }
    @Then("The HR user is able to drag and drop departments")
    public void the_hr_user_is_able_to_drag_and_drop_departments() {
        actions.dragAndDrop(dashboardPage.dragDepartmentBox1, dashboardPage.dragDepartmentBox1);


    }
}
