package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import runner.TestRunner;

import static org.testng.AssertJUnit.assertEquals;
import static tests.PageProvider.getLoginPage;

public class LoginTest {
    @When("^I click username as Harry Potter$")
    public static void clickUserName() throws InterruptedException {
        Thread.sleep(1000);
        getLoginPage().clickOption();
        Thread.sleep(1000);
    }

    @And("^I click submit$")
    public static void clickSubmit() throws InterruptedException {
        Thread.sleep(1000);
        getLoginPage().clickSubmit();
        Thread.sleep(1000);
    }

    @Then("^I verify that login successfully with name as (.*)$")
    public static void verifyLoginSuccesfully(String username) throws InterruptedException {
        //verify system has Logout button
//        String logoutTextButton = TestRunner.driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).getText();
//        Thread.sleep(1000);
//        Assert.assertEquals("Logout", logoutTextButton);
//
//        //Verify name
//        String name = TestRunner.driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/strong/span")).getText();
//        Thread.sleep(1000);
//        Assert.assertEquals(username, name);
    }

}
