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
    public static void main(String[] args) {

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

    if(ExpectedURL.equals("https://demo.nopcommerce.com/register?returnUrl=%2F")){
        System.out.println("Test Case Passed");
    }else {
        System.out.println("Test Case Failed");
    }

    }
}
