package ex_23022026HandleFileUploadScrollingPageJavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ZoomingZoomOutPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        //driver.manage().window().minimize();
        //Thread.sleep(2000);
        driver.manage().window().maximize();
        JavascriptExecutor JS=(JavascriptExecutor)driver;

        JS.executeScript("document.body.style.zoom='50%'");
Thread.sleep(5000);
        JS.executeScript("document.body.style.zoom='80%'");

    }
}
