package ex_05022026xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpathsingleattribute {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshirts");


    }
}
