package ex_2212026Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Homework {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");

        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("The Total Cout of Link is--->"+links.size());

        List<WebElement>images=driver.findElements(By.tagName("img"));
        System.out.println("The Total Cout of Images is--->"+images.size());

        driver.findElement(By.linkText("Samsunggalaxys6")).click();
        System.out.println("code Executed Successfully");

        driver.quit();

    }
}
