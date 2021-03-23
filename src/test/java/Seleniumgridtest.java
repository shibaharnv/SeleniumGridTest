import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Seleniumgridtest {

    public static void main(String[] args) throws MalformedURLException {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\nshibaha\\OneDrive - Intel Corporation\\Desktop\\WORK\\AUTOMATION\\SELENIUM GRID\\chrome89\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
         driver =new RemoteWebDriver(new URL("http://localhost:4444/"), new ChromeOptions());

        driver.get("https://www.google.co.in/");
       /* DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);

        // Chrome options:

        ChromeOptions options = new ChromeOptions();
        options.merge(cap);

        String huburl = "http://localhost:4444/";

        //String huburl = "http://172.17.154.97:4444/wd/hub";

        //WebDriver driver = new ChromeDriver();

            WebDriver wedriver = new RemoteWebDriver(new URL(huburl), options);

        wedriver.get("https://www.google.co.in/");

        wedriver.quit();*/

    }
}