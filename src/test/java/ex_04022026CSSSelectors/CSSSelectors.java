package ex_04022026CSSSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CSSSelectors {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://demo.nopcommerce.com/");
     WebElement Entry= driver.findElement(By.cssSelector("input#small-searchterms"));
     Entry.sendKeys("T-Shirt");
     Entry.click();



        System.out.println("Code is executed successfully");







    }

}
