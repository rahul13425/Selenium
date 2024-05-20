import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Login {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.itravel2000.com/?joynedvip=dev");

        driver.manage().window().maximize();

        System.out.println("title is : " +driver.getTitle());

        driver.findElement(By.xpath("//span[@class=\"ellipsis\" and text()=' Account ']")).click();
        driver.findElement(By.xpath("//a[@data-toggle=\"modal\" and text()='Sign In']")).click();

        driver.findElement(By.xpath("//input[@placeholder=\"Enter your Email Address\"]")).sendKeys("rk6965490@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder=\"Enter your Password\"]")).sendKeys("Test@123");
        driver.findElement(By.xpath("(//button[@class='btn btn-primary-gradient btn-lg btn-block'])[1]")).click();
 }
}
