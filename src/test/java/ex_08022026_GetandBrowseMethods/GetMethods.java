package ex_08022026_GetandBrowseMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethods {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//get(url)---opens the url of browser.
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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


    }
}
