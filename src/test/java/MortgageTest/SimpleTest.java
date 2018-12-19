package MortgageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.facadeAllPages.SitePages;
import utils.SetUp;

import static utils.Constants.DRIVER;

public class SimpleTest extends SetUp {

    private SitePages sitePages;

    @Test
    public void testExample1() {

        sitePages = new SitePages(DRIVER);

        //Step1 select Mortgages from Menu
        sitePages.pageMenu().selectMortgage();

        //Step2 Click to button  Mortgage payment
        sitePages.pageMortgage().navigateToMortgagePayment();

        sitePages.pageMortgagePaymentCalculator().pressPlusPurchasePrice();
        sitePages.pageMortgagePaymentCalculator().pressPlusPurchasePrice();
        Assert.assertEquals(sitePages.pageMortgagePaymentCalculator().getPurchasePriceValue(), "500000");

        sitePages.pageMortgagePaymentCalculator().pressPlusDownPayment();

        sitePages.pageMortgagePaymentCalculator().selectAmortization("15 years");

        sitePages.pageMortgagePaymentCalculator().selectPaymentFrequency("weekly");

        sitePages.pageMortgagePaymentCalculator().setInterestRateValue("5.00");

        sitePages.pageMortgagePaymentCalculator().pressBtnCalculate();

        //getText() return empty string!!! need to research

        System.out.println("The text is " + sitePages.pageMortgagePaymentCalculator().getPaymentResult());

        Assert.assertEquals(sitePages.pageMortgagePaymentCalculator().getPaymentResult(), "$726.35");

    }

    @Test
    public void testExample2() {

        System.out.println("Second test started================");

    }

}


