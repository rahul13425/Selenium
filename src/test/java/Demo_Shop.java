import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo_Shop {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/search?q=desktop");

        driver.manage().window().maximize();

        System.out.println("title is : " + driver.getTitle());

        String enterProduct = "Elite Desktop PC";

        driver.findElement(By.id("small-searchterms")).sendKeys(enterProduct);

        Thread.sleep(6000);

        List<WebElement> getsearchitem = driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]"));

//        System.out.println(getsearchitem.get(0).getText());   Apply when we have less no of options in the droupdown (its a dynamic )
//        System.out.println(getsearchitem.get(1).getText());

        for (int i = 0; i < getsearchitem.size(); i++) {
//            System.out.println(getsearchitem.get(i).getText());
            WebElement productname = getsearchitem.get(i);
            System.out.println(productname.getText());
            String product = productname.getText();
            if (product.equalsIgnoreCase(enterProduct)) {   // for .contain it will click on the product because in the product(Elite Desktop Pc) Contains the enterProduct(Elite)
                System.out.println("product is present");
                productname.click();
                Thread.sleep(6000);
            } else {
                System.out.println("product not found");
            }


        }
        WebElement Product_title = driver.findElement(By.xpath("//h1[@itemprop=\"name\"]"));
        System.out.println(Product_title);
        System.out.println(Product_title.getText());

        String Expected_title = "Elite Desktop PC";
        String Actual_Title = Product_title.getText();
        if (Expected_title.equalsIgnoreCase(Actual_Title)) {
            System.out.println("Title is present");
            Product_title.click();


            driver.quit();
        }
    }
}
