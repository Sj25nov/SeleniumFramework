package ex_16022026_HandledDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HiddenDropDowns {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

       // driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//a[normalize-space()='PIM']")).click();

    }
}
