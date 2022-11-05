package com.mazprojects.pages;

import com.mazprojects.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='menu-item-link-text']")
    public WebElement employeeTab;

    @FindBy(xpath = "//*[@id='top_menu_id_company_3271504278']/a")
    public WebElement companyStructureTab;

    @FindBy(xpath = "//div[@id='bx_visual_structure']")
    public WebElement companyStructureBox;

    @FindBy(xpath = "//div[@class='pagetitle-menu pagetitle-container pagetitle-last-item-in-a-row']")
    public WebElement addDepartmentClickBox;

    @FindBy(xpath = "//*[@id='NAME']")
    public WebElement inputDepartmentName;

    @FindBy(xpath = "//*[@id='IBLOCK_SECTION_ID']")
    public WebElement selectParentDepartment;

    @FindBy(xpath = "//*[@id='single-user-choice']")
    public WebElement clickOnSelectSupervisor;

    @FindBy(xpath = "//*[@id='Single_qOo0Au_tab_last']/span[2]")
    public WebElement clickOnRecentTab;

    @FindBy(xpath = "//*[@id='Single_qLGa1j_last_employee_693']/div[1]")
    public WebElement selectSupervisor1;

    @FindBy(xpath = "//*[@id='Single_qLGa1j_last_employee_479']/div[1]")
    public WebElement selectSupervisor2;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement clickOnAddButton;

    @FindBy(xpath =  "//*[@id='Single_qOo0Au_tab_structure']/span[2]")
    public WebElement clickOnCompanyTab;

    @FindBy(xpath = "//*[@id='Single_qOo0Au_employee_section_426']/div[2]")
    public WebElement clickOnMarketingDepartment;

    @FindBy(xpath = "//*[@id='Single_qOo0Au_employees_426']/div/div[3]")
    public WebElement clickOnMarketingEmployeeName;

    @FindBy(xpath = "//*[@id='Single_qOo0Au_employee_section_222']/div[2]")
    public WebElement clickOnQADepartment;

    @FindBy(xpath = "//*[@id='bx_str_426']")
    public WebElement dragDepartmentBox1;

    @FindBy(xpath = "//*[@id='bx_str_222']")
    public WebElement dragDepartmentBox2;

















//*[@id="single-user-choice"]





    @FindBy(id = "user-name")
    public WebElement idName;



}
