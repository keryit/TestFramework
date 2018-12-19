package utils.justExampleDriverSetUpWithInterface;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static utils.Constants.DRIVER;
import static utils.Constants.URL;

public class InternetExplorerSetUp implements IDriverManager {

    public void setUpDriver() {
        WebDriverManager.iedriver().setup();
        DRIVER = new InternetExplorerDriver();
        DRIVER.manage().window().maximize();
        DRIVER.get(URL);
    }
}
