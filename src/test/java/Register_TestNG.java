import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Register_TestNG {

    public  WebDriver driver;   // Declare global varibale to use everywhere in the below classes

    @BeforeMethod
    @Parameters("browserName")
    public void openWebSite(String browserName){         //Setup

        System.out.println("Running test on browser: " + browserName);
        if(browserName.equalsIgnoreCase("chrome")){
            driver= new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            driver=new EdgeDriver();

        }
        else{
            System.out.println("please enter valid browser");
        }


        driver.get(Demo_Shop.url);

        driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
    }
    @Test(priority = 1,groups = "regreesion")

    public void RegisterFunctionalityWithvalidCrredential(){

//        Demo_Shop d=new Demo_Shop();

        //


        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("g-male")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Rahul");
        driver.findElement(By.id("LastName")).sendKeys("Kumar");
        driver.findElement(By.id("Email")).sendKeys(Common_methods.generateRandomString(7)+"@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("rahul123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("rahul123");
        driver.findElement(By.id("register-button")).click();



        driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();

        System.out.println("Registered Successfully ");

    }

    @Test(priority = 2,groups = "regression")
    @Parameters("Browsername")
    public void RegisteredFunctionalitywithoutfillingFields(){

        driver.findElement(By.id("register-button")).click();

        String ActualFirstNameWarning="First name is required.";
        String ExpectedFirstNameWarningMessage=driver.findElement(By.xpath("//span[@class=\"field-validation-error\" and @data-valmsg-for=\"FirstName\"]")).getText();
        Assert.assertEquals(ActualFirstNameWarning,ExpectedFirstNameWarningMessage);


        String ActualLastNameWarning="Last name is required.";
        String ExpectedLastNameWarningMessage=driver.findElement(By.xpath("//span[@class=\"field-validation-error\" and @data-valmsg-for=\"LastName\"]")).getText();
        Assert.assertEquals(ActualLastNameWarning,ExpectedLastNameWarningMessage);

        String ActualEmailWarning="Email is required.";
        String ExpectedEmailWarningMessage=driver.findElement(By.xpath("//span[@class=\"field-validation-error\" and @data-valmsg-for=\"Email\"]")).getText();
        Assert.assertEquals(ActualEmailWarning,ExpectedEmailWarningMessage);


        String ActualPasswordWarning="Password is required.";
        String ExpectedPasswordNameWarningMessage=driver.findElement(By.xpath("//span[@class=\"field-validation-error\" and @data-valmsg-for=\"Password\"]")).getText();
        Assert.assertEquals(ActualPasswordWarning,ExpectedPasswordNameWarningMessage);


        String ActualconfirmPasswordWarning="Password is required.";
        String ExpectedConfirmPasswordNameWarningMessage=driver.findElement(By.xpath("//span[@class=\"field-validation-error\" and @data-valmsg-for=\"ConfirmPassword\"]")).getText();
        Assert.assertEquals(ActualconfirmPasswordWarning,ExpectedConfirmPasswordNameWarningMessage);



        try {

            Thread.sleep(20000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

    @AfterMethod
    public void TearDown(){

        driver.quit();
    }
}
