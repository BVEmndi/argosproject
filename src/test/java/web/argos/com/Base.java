package web.argos.com;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

/**
 * Created by sudharman on 02/02/2017.
 */
public class Base extends BrowserFactory{

    @Before

    public  void setUp(){
        BrowserFactory Bros=new BrowserFactory();
        Bros.openBrowser("firefox","http://www.argos.co.uk/");

    }
}
