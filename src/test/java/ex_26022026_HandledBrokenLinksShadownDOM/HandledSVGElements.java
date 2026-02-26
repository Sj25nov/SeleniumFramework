package ex_26022026_HandledBrokenLinksShadownDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandledSVGElements {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();


        driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[5]")).click();


    }
}
