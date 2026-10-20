package TestSuites;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_LoginPage extends BaseClass{

    @Test
        public void verifySuccessfulLogin (){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("ckirinda@corporate.mediadefined.com");
        loginPage.setPasswordField("media@chathu88");
        loginPage.clickLoginButton();
        loginPage.validateLogin();
    }

    @Test
        public void verifyInvalidLogin (){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("username");
        loginPage.setPasswordField("password");
        loginPage.clickLoginButton();
        loginPage.validateLogin();
    }

}