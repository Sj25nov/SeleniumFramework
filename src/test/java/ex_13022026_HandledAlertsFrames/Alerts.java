package ex_13022026_HandledAlertsFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//open normal alert box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
driver.switchTo().alert();
        System.out.println(driver.getTitle());
        //Normal Alert with OK Button


    }
}
