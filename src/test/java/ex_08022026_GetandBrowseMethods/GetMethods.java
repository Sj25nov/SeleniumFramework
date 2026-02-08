package ex_08022026_GetandBrowseMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//get(url)---opens the url of browser.

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);
//getTitle(url)-->Get The URL of current webpage
        System.out.println(driver.getTitle());
        //getCurrentUrl()-->Get the current URL address
        System.out.println(driver.getCurrentUrl());
        //getPageSource()--->return source code of page
       // System.out.println(driver.getPageSource());
        //getWindowHandle()--->This will return the single browser window
        String WindowID=driver.getWindowHandle();
        System.out.println(WindowID);
        System.out.println(WindowID.length());
//GetWindowHandles--->This will retrn the ID's Of all browser Windows
driver.findElement(By.linkText("OrangeHRM, Inc")).click();

Thread.sleep(5000);

     Set<String> names= driver.getWindowHandles();

        System.out.println(names);

        names.isEmpty();


    }
}
