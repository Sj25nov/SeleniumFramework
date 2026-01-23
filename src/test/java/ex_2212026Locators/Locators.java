package ex_2212026Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       // driver.get("https://demo.opencart.com/en-gb?route=common/home");

        driver.manage().window().maximize();

        /*WebElement searchbox1=driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']"));
        searchbox1.sendKeys("saurabhj1414@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        WebElement searchbox=driver.findElement(By.xpath("//input[@name=\"action_request\"]"));
*/
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        //WebElement ID=driver.findElement(By.xpath("//input[@placeholder='Username']"));
       // ID.sendKeys("Admin");
        //WebElement Pass=driver.findElement(By.name("password"));
       // Pass.sendKeys("admin123");
       WebElement new1= driver.findElement(By.xpath("//img[@alt='company-branding']"));
      boolean status= new1.isDisplayed();


    // driver.findElement(By.xpath("//button[@type='submit']")).click();


        System.out.println(status);






    }
}
