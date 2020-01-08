package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import runner.TestRunner;

import static tests.PageProvider.getDepositPage;
import static tests.PageProvider.getLoginPage;

public class DepositTest {

    @Given("^login successfully$")
    public static void loginSuccesfully() throws InterruptedException {
        Thread.sleep(1000);
        getLoginPage().loginSucces();
        Thread.sleep(1000);
    }

    @When("^I click deposit tab$")
    public static void clickDepositTab() throws InterruptedException {
        Thread.sleep(1000);
        getDepositPage().clickDepositTab();
        Thread.sleep(1000);
    }

    @And("^I type amount as (.*)$")
    public static void setAmount(String amount) throws InterruptedException {
        Thread.sleep(1000);
        getDepositPage().setAmountfield(amount);
        Thread.sleep(1000);
    }

    @And("^I click submit deposit$")
    public static void clickSubmitDeposit() throws InterruptedException {
        Thread.sleep(1000);
        getDepositPage().clickSubmitDeposit();
        Thread.sleep(1000);
    }

    @Then("^I verify that deposit successfully with amount as (.*)$")
    public static void verifyLoginSuccesfully(String amount) throws InterruptedException {
        //verify system has amount
        String amountResult = TestRunner.driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/strong[2]")).getText();
        System.out.println(amountResult);
        Thread.sleep(1000);
        Assert.assertEquals(amount, amountResult);
    }

}
