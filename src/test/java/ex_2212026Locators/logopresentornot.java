package ex_2212026Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logopresentornot {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");


        driver.manage().window().maximize();


        WebElement logo=driver.findElement(By.className("lnXdpd"));

        boolean status=logo.isDisplayed();

        System.out.println(status);
    }
}
