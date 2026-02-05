package ex_05022026xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpathwithAndOrOperators {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://demo.nopcommerce.com/");
//And
        driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("Neww");

        //OR
        driver.findElement(By.xpath("//button[@type='submit' or @class=\"button-1 search-box-button\"]")).click();
        System.out.println();
    }
}
