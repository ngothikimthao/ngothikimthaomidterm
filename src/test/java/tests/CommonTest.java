package tests;

import cucumber.api.java.en.Given;

import runner.TestRunner;

public class CommonTest {
    @Given("^Open website (.*)$")
    public static void openWebsite(String website) throws InterruptedException {
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
        Thread.sleep(1000);
    }
}
