package ex_23022026HandleFileUploadScrollingPageJavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class clickMethodByJavaScriptExecutor {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement Clicked= driver.findElement(By.xpath("(//input[@id='male'])[1]"));

        js.executeScript("arguments[0].click()",Clicked);
        //Clicked.click();



    }
}
