package C_nopCommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.partialLinkText("Log ")).click();
        //Custom xpath-with Contain()
        driver.findElement(By.xpath("//input[contains(@class,\"email\")]")).sendKeys("Dhruiv09198@gmail.com");
        //Custom css selector-css selector path
        driver.findElement(By.cssSelector("input[class=\"password\"]")).sendKeys("dhruvi123");
        //Custom css selector-Text Method(^ means text with start with ch letters
        driver.findElement(By.cssSelector("input[type^=\"ch\"]")).click();
        //Custom css selector-Text Method($ means text with end with mit letters
        //   driver.findElement(By.cssSelector("input[type$=\"mit\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
}
