package tests;

import org.openqa.selenium.support.PageFactory;
import pages.DepositPage;
import pages.LoginPage;
import runner.TestRunner;

public class PageProvider {
    private static LoginPage loginPage;
    private static DepositPage depositPage;

    public static LoginPage getLoginPage() {
        if (loginPage == null)
            loginPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
        return loginPage;
    }

    public static DepositPage getDepositPage() {
        if (depositPage == null)
            depositPage = PageFactory.initElements(TestRunner.driver, DepositPage.class);
        return depositPage;
    }

}
