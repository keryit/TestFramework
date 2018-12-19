package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgagePaymentCalculator {

    private WebDriver driver;

    @FindBy(xpath = "//button[@id='PrixProprietePlus']")
    @CacheLookup
    private WebElement btnPlusPurchasePrice;

    @FindBy(id = "PrixPropriete")
    @CacheLookup
    private WebElement purchasePriceValueField;

    @FindBy(id = "MiseDeFondPlus")
    @CacheLookup
    private WebElement btnDownPayment;

    @FindBy(xpath = "//div[@class='selectric']")
    @CacheLookup
    private WebElement amortizationSelector;

    @FindBy(xpath = "//div[@class='selectric-items']")
    @CacheLookup
    private WebElement listOfYears;

    @FindBy(xpath = ".//*[normalize-space(text())='Payment frequency']")
    @CacheLookup
    private WebElement frequencySelector;

    @FindBy(xpath = "//div[@class='selectric-items']")
    @CacheLookup
    private WebElement listOfFrequence;

    @FindBy(id = "TauxInteret")
    @CacheLookup
    private WebElement interestRateField;

    @FindBy(id = "btn_calculer")
    @CacheLookup
    private WebElement btnCalculate;

    @FindBy(xpath = "//span[@id='paiement-resultats']")
    @CacheLookup
    private WebElement paymentResult;

    public MortgagePaymentCalculator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void pressPlusPurchasePrice() {
        btnPlusPurchasePrice.click();
    }

    public String getPurchasePriceValue() {
        return purchasePriceValueField.getAttribute("value");
    }

    public void pressPlusDownPayment() {
        btnDownPayment.click();
    }

    public void selectAmortization(String value) {
        amortizationSelector.click();
        listOfYears.findElement(By.xpath("//li[contains(text(),'" + value + "')]")).click();
    }

    public void selectPaymentFrequency(String value) {
        frequencySelector.click();
        listOfFrequence.findElement(By.xpath("//li[contains(text(),'" + value + "')]")).click();
    }

    public void setInterestRateValue(String value) {
        interestRateField.clear();
        interestRateField.sendKeys(value);
    }

    public void pressBtnCalculate() {
        btnCalculate.click();
    }

    public String getPaymentResult() {
        return paymentResult.getText();
    }
}
