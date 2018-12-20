package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {

    public static WebElement waitVisiblityElement(WebDriver driver, WebElement element, int interval) {
        return new WebDriverWait(driver, interval).until(ExpectedConditions.visibilityOf(element));
    }
}
