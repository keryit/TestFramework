package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu {

    private WebDriver driver;

    public Menu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(.,'Loans')]")
    @CacheLookup
    private WebElement menuLoan;

    @FindBy(xpath = "//a[contains(text(),'Mortgages')]")
    @CacheLookup
    private WebElement subMenuMortgage;


    public void selectMortgage() {
        menuLoan.click();
        subMenuMortgage.click();
    }
}
