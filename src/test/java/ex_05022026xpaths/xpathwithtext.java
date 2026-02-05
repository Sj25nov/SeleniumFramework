package ex_05022026xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpathwithtext {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://demo.nopcommerce.com/");

       WebElement result= driver.findElement(By.xpath("//a[text()=' Apparel ']"));


        System.out.println(result.isDisplayed());
    }
}
