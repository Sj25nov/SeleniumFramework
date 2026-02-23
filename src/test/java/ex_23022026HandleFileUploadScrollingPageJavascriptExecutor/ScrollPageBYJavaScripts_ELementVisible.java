package ex_23022026HandleFileUploadScrollingPageJavascriptExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollPageBYJavaScripts_ELementVisible {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();



        WebElement ScrolluptothisElement = driver.findElement(By.xpath("//h2[normalize-space()='Static Web Table']"));


        JavascriptExecutor Js = (JavascriptExecutor) driver;

        Js.executeScript("arguments[0].scrollIntoView();", ScrolluptothisElement);

        System.out.println(Js.executeScript("return window.pageYOffset;"));

    }
}


