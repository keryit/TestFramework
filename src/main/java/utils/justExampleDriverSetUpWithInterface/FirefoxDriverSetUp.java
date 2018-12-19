package utils.justExampleDriverSetUpWithInterface;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import static utils.Constants.DRIVER;
import static utils.Constants.URL;

public class FirefoxDriverSetUp implements IDriverManager {

    public void setUpDriver() {
        WebDriverManager.firefoxdriver().setup();
        DRIVER = new FirefoxDriver();
        DRIVER.manage().window().maximize();
        DRIVER.get(URL);
    }
}
