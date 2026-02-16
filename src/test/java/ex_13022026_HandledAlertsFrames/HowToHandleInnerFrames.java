package ex_13022026_HandledAlertsFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HowToHandleInnerFrames {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");

        driver.manage().window().maximize();
//Frame--->1

        WebElement Frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        driver.switchTo().frame(Frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
        //Frame--->2
        driver.switchTo().defaultContent();
        WebElement Frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(Frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");

//Frame-->3

        driver.switchTo().defaultContent();
        WebElement Frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(Frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test");
//Switch to inner frame

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();

    }
}
