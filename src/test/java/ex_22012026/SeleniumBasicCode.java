package ex_22012026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasicCode {
    public static void main(String[] args) {

       // WebDriver driver = new ChromeDriver();

        WebDriver driver=new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.opencart.com/index.php?route=cms/demo");

        driver.findElement(By.xpath("//span[normalize-space()='View Store Front']")).click();

        if (driver.getCurrentUrl().contains("https://www.opencart.com/index.php?route=cms/demo")) {
            System.out.println("The Valid URL");
        } else {
            System.out.println("The URL is not Valid");
        }

        driver.close();
    }
}
