package ex_13022026_HandledAlertsFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OkAndCancelAlerts {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

     WebElement Confirmation= driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));

     Confirmation.click();


     driver.switchTo().alert().accept(); ///closed alert using ok button

     Confirmation.isDisplayed();
        System.out.println(Confirmation.getText());

     //if(driver.findElement(By.xpath("//p[@id='result']")))
        //{
          //  System.out.println("");
        //}



    }
}
