package ex_09022026_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Threadsleep {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");

        driver.manage().window().maximize();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Saurabh");

    }
}
