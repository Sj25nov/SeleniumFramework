package ex_04022026CSSSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CSSUsingTagAttribute {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("Socks");
    }
}
