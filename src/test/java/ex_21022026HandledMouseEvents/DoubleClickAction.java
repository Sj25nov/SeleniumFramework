package ex_21022026HandledMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickAction {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement field1= driver.findElement(By.xpath("//input[@id='field1']"));
                WebElement CopyText=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
        WebElement field2= driver.findElement(By.xpath("(//input[@id='field2'])[1]"));

       // driver.switchTo().frame("//class[@class='sidebar section']");
field1.clear();
field1.sendKeys("Hello Saurabh");
        Actions action = new Actions(driver);

        action.doubleClick(CopyText).build().perform();

        if(field2.getText().equals(field1.getText()))
        {
            System.out.println("Testcase passed");
        }else {
            System.out.println("Testcase failed");
        }
    }
}
