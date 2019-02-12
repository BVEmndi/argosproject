package web.argos.com;

import com.sun.xml.internal.ws.wsdl.writer.UsingAddressing;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class RegressionTest extends Base{



    @Test
    public void searchingProducts()
    {
        HomePage homePage=new HomePage(driver);
        homePage.doSearch("laptop");
        homePage.GoToClearance();
        homePage.GoToProduct();
    }
}
