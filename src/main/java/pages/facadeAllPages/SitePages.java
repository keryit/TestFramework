package pages.facadeAllPages;

import org.openqa.selenium.WebDriver;
import pages.Menu;
import pages.Mortgage;
import pages.MortgagePaymentCalculator;

public class SitePages {

    private WebDriver driver;

    public SitePages(WebDriver driver){
        this.driver = driver;
    }

    public Menu pageMenu(){
        return new Menu(driver);
    }

    public Mortgage pageMortgage(){
        return new Mortgage(driver);
    }

    public MortgagePaymentCalculator pageMortgagePaymentCalculator(){
        return new MortgagePaymentCalculator(driver);
    }
}
