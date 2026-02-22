package ex_22022026_HandledKeyboardEventstabs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DoOperationWithKeysAndDoOPrWithoutLossingHomepage {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement Register= driver.findElement(By.xpath("(//a[normalize-space()='Register'])[1]"));
        Actions action = new Actions(driver);
    action.keyDown(Keys.CONTROL).click(Register).keyUp(Keys.CONTROL).perform();

List<String> TheElements=new ArrayList<> (driver.getWindowHandles());

        System.out.println(TheElements.get(1));
driver.switchTo().window(TheElements.get(1));
    String ExpectedURL=driver.getCurrentUrl();

    driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Saurabh Jadhav");
Thread.sleep(3000);
    driver.switchTo().window(TheElements.get(0));
        Thread.sleep(3000);
    WebElement serach=driver.findElement(By.xpath("(//input[@id='small-searchterms'])[1]"));
    serach.sendKeys("T Shirts");
        Thread.sleep(3000);
    serach.click();

    if(ExpectedURL.equals("https://demo.nopcommerce.com/register?returnUrl=%2F")){
        System.out.println("Test Case Passed");
    }else {
        System.out.println("Test Case Failed");
    }
        driver.quit();
    }
}
