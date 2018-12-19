package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mortgage {

    private WebDriver driver;

    public Mortgage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Mortgage payment')]")
    @CacheLookup
    private WebElement mortgagePayBtn;

    public void navigateToMortgagePayment() {
        mortgagePayBtn.click();
    }


}
