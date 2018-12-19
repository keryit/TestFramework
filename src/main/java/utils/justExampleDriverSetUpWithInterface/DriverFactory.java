package utils.justExampleDriverSetUpWithInterface;

public class DriverFactory {

    public IDriverManager getBrowser(Browsers browser) {
        if (browser == null) {
            return null;
        }
        if (browser == Browsers.CHROME) {
            return new ChromeDriverSetUp();

        } else if (browser == Browsers.FIREFOX) {
            return new FirefoxDriverSetUp();

        } else if (browser == Browsers.IE) {
            return new InternetExplorerSetUp();
        }
        return null;
    }
}
