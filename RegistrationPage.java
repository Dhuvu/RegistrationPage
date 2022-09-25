package C_nopCommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //implicit Wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

        String Title=driver.getTitle();
        System.out.println("Title is:"+Title);
         if (Title.equals("nopCommerce demo store")){
             System.out.println("Correct Title");
         }else {
             System.out.println("Incorrect Title");
         }

         //REGISTER PAGE
         driver.findElement(By.className("ico-register")).click();
         //LOCATOR-1 ID
         driver.findElement(By.id("gender-female")).click();
         //XPATH lOCATOR
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Dhruvisha");
        //CSS SELECTOR LOCATOR
        driver.findElement(By.cssSelector("#LastName")).sendKeys("Patel");

        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        Day.sendKeys("10");
        Month.sendKeys("May");
        Year.sendKeys("1992");

        //full path
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[5]/input")).sendKeys("Dhruiv09198@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("UnifyTesting");
      //  driver.findElement(By.xpath("//input[Contain(@id,\"Newsletter\")]")).click();
       // driver.findElement(By.id("Newsletter")).click();

        WebElement checkbox=driver.findElement(By.cssSelector("#Newsletter"));
        checkbox.click();

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        //Custom xpath-1.property
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("dhruvi123");
        //Custom xpath-2.properties
        driver.findElement(By.xpath("//input[@type=\"password\"and@id=\"ConfirmPassword\"]")).sendKeys("dhruvi123");
        //property
        driver.findElement(By.xpath("//button[@class=\"button-1 register-next-step-button\"]")).click();
        //Custom xpath-3.text
        driver.findElement(By.xpath("//a[text()=\"Continue\"]")).click();
        //locator linktext
        driver.findElement(By.linkText("Log out")).click();
        //Locator partialLinkText
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
