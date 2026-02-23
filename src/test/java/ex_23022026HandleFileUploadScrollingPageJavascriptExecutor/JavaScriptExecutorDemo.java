package ex_23022026HandleFileUploadScrollingPageJavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();

        WebElement EnterName=driver.findElement(By.xpath("(//input[@id='name'])[1]"));
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].setAttribute('value','Saurabh')" ,EnterName);

             //  EnterName.sendKeys("Saurabh");

        WebElement EnterEMail=driver.findElement(By.xpath("(//input[@id='email'])[1]"));
        js.executeScript("arguments[0].setAttribute('value','saurabhj1414@gmail.com')",EnterEMail);
//EnterName.sendKeys("saurabhj1414@gmail.com");
        WebElement EnterPhone=driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
        js.executeScript("arguments[0].setAttribute('value','9545801414')",EnterPhone);
//EnterName.sendKeys("9545801414");
        WebElement Address=driver.findElement(By.xpath("(//textarea[@id='textarea'])[1]"));
        js.executeScript("arguments[0].setAttribute('value','Hadapsar-Handewadi')",Address);
      //  Address.sendKeys("Hadapsar HAndewadi");
/*

       */

    }
}
