package ex_09022026_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitwait {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // Thread.sleep(10000);

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Saurabh");
        System.out.println();
    }
}
