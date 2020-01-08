package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPage {
    private WebDriver webDriver;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/button[2]")
    WebElement depositTab;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountfield;

//    @FindBy(xpath = "//button[contains(text(),'Deposit')][1]")
//    WebElement submitDeposit;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div/form/button")
    WebElement submitDeposit;

    public  DepositPage(WebDriver webDriver){
        this.webDriver=webDriver;
    }

    public void clickDepositTab(){
        this.depositTab.click();
    }

    public void setAmountfield(String amountfield){
        this.amountfield.clear();
        this.amountfield.sendKeys(amountfield);
    }

    public void clickSubmitDeposit(){
        this.submitDeposit.click();
    }
}
