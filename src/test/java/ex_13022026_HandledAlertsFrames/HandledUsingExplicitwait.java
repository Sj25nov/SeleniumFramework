package ex_13022026_HandledAlertsFrames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandledUsingExplicitwait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(10000);
        Alert NewAlert=wait.until(ExpectedConditions.alertIsPresent());

        NewAlert.accept();
     //   System.out.println(NewAlert);
    }
}
