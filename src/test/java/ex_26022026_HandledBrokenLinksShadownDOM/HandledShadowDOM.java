package ex_26022026_HandledBrokenLinksShadownDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandledShadowDOM {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://dev.automationtesting.in/shadow-dom");

        driver.manage().window().maximize();

        //This Element is inside single shadow DOM.//This Element is inside single shadow DOM.
        String cssSelectorForHost1 = "#shadow-root";
        Thread.sleep(1000);
        SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        Thread.sleep(1000);
       WebElement SA= shadow.findElement(By.cssSelector("#shadow-element"));
        System.out.println("the webelement"+SA.getText());
    }
}
