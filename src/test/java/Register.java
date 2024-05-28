import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

//        Demo_Shop d=new Demo_Shop();

        driver.get(Demo_Shop.url);

        driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();

        driver.findElement(By.id("gender-male")).click();
//        driver.findElement(By.id("g-male")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Rahul");
        driver.findElement(By.id("LastName")).sendKeys("Kumar");
        driver.findElement(By.id("Email")).sendKeys("rk6965@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("rahul123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("rahul123");

        driver.findElement(By.id("register-button")).click();
       driver.findElement(By.xpath("//input[@class=\"button-1 register-continue-button\"]")).click();

        System.out.println("Registered Successfully ");


    }
}
