package web.argos.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import java.util.List;


/**
 * Created by sudharman on 01/02/2017.
 */
public class HomePage extends BrowserFactory{


    public HomePage(WebDriver driver)


    {
        PageFactory.initElements(driver,this);
    }

   @FindBy(id = "searchTerm")
   WebElement Search;

    @FindBy (css =".btn.btn-search" )
    WebElement SearchIcon;

    @FindBy(linkText = "Technology")
    WebElement ProductList;

    @FindBy(linkText ="Clearance")
    public WebElement clearanceBtn;

    public void doSearch(String using)
    {
        Search.sendKeys(using);
        SearchIcon.click();
    }
    public void GoToClearance(){

        clearanceBtn.click();
}
     public void GoToProduct(){
        ProductList.click();
}


}
