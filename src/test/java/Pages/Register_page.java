package Pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_page {

    public static WebDriver driver;    //webdriver instance
    public Register_page(WebDriver driver){      //constructor initialize
        this.driver=driver;
        PageFactory.initElements((SearchContext) driver ,this);
    }


}
