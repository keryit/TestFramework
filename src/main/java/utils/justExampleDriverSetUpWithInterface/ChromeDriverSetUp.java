package utils.justExampleDriverSetUpWithInterface;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import static utils.Constants.DRIVER;
import static utils.Constants.URL;

public class ChromeDriverSetUp implements IDriverManager {

    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        DRIVER = new ChromeDriver();
        DRIVER.manage().window().maximize();
        DRIVER.get(URL);
    }
}
