package TestSuites;

import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_CoursesPage extends BaseClass {

    @Test
    public void verifyEditCourses() {
        //Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("ckirinda@corporate.mediadefined.com");
        loginPage.setPasswordField("media@chathu88");
        loginPage.clickLoginButton();
        loginPage.validateLogin();
        //Select Company
        SelectCompanyPage selectCompanyPage = new SelectCompanyPage(driver);
        selectCompanyPage.clickDropdown();
        selectCompanyPage.selectCompanyFromDropdown("NetexamTesting");
        selectCompanyPage.clickSubmitButton();
        selectCompanyPage.validateLoggedinCompany("NetexamTesting");
        //Get Course Page
        HomePage homePage = new HomePage(driver);
        homePage.expandCoursesMenu();
        homePage.clickCourses();
        //Get edit courses page
        CoursesPage coursesPage = new CoursesPage(driver);
        coursesPage.inputSearchText("mdtest-saji-course1111");
        coursesPage.clickSearchButton();
        coursesPage.clickEditButton();



    }
}
