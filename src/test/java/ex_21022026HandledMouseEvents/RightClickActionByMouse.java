package ex_21022026HandledMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickActionByMouse {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.orangehrm.com/");

        driver.manage().window().maximize();
        WebElement MouseHovering = driver.findElement(By.xpath("//a[normalize-space()='Solutions']"));
        WebElement solutions=driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[2]/a[1]"));
        Actions MouseHover=new Actions(driver);


    }
}
