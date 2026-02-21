package ex_21022026HandledMouseEvents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClickActionByMouse {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        driver.manage().window().maximize();
        WebElement Rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//Rightclick
Actions DoActions=new Actions(driver);

DoActions.contextClick(Rightclick).build().perform();
Thread.sleep(2000);
WebElement Clickoncopy=driver.findElement(By.xpath("//span[normalize-space()='Copy']"));
Clickoncopy.click();
Thread.sleep(2000);
driver.switchTo().alert().accept();
    }
}
