package ex_12022026_BrowserMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Navigate {
    public static void main(String[] args) throws MalformedURLException {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        URL myurl=new URL("https://www.google.com");
        driver.navigate().to(myurl);

        driver.quit();
    }
}
