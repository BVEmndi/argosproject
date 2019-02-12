package web.argos.com;



import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class BrowserFactory {
    public static WebDriver driver;
  // final String BROWSER = "firefox";

//@Before
    public void openBrowser(String BROWSER,String url ) {
        if (BROWSER.equals("firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        } else if (BROWSER.equals("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
}


    //@After
     /**   public void closeBrowser()
        {
            driver.quit();
        }
   */


