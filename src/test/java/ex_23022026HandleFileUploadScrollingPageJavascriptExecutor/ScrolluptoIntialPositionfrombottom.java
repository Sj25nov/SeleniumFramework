package ex_23022026HandleFileUploadScrollingPageJavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrolluptoIntialPositionfrombottom {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        JavascriptExecutor JS=(JavascriptExecutor)driver;

        JS.executeScript("window.scrollBy(0,5000)","");
        Thread.sleep(2000);

JS.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(JS.executeScript("return  window.pageYOffset;"));
    }
}
