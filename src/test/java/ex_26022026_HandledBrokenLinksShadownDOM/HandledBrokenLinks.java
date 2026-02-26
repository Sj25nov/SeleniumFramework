package ex_26022026_HandledBrokenLinksShadownDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class HandledBrokenLinks {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");

        driver.manage().window().maximize();

        List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println(Links.size());
        int NoOfBrokenLinks=0;
        int NoOfUnbrokenLinks=0;
//capture all the links
        for (WebElement newlinks : Links) {
            String values = newlinks.getAttribute("href");

            if (values == null || values.isEmpty()) {
                System.out.println("Atttribute value is empty so not able to check");
                continue;
            }
            try {
                //hit URL to the Server
                URL linkk = new URL(values); //Convervalues from string to URL
                HttpURLConnection conect = (HttpURLConnection) linkk.openConnection();
                conect.connect(); //Conect the server and hit the URL
                conect.getResponseCode();

                if (conect.getResponseCode() >= 400) {
                    System.out.println("The Url is BrokenLink-->"+values);
                    NoOfBrokenLinks++;
                } else {
                    System.out.println("The Url is not brokenLink"+values);
                    NoOfUnbrokenLinks++;
                }
            } catch (Exception e) {

            }
        }
        System.out.println("The No Of BrokenLinks-->"+NoOfBrokenLinks);
        System.out.println("The No Of UnbrokenLinks->"+NoOfUnbrokenLinks);
        driver.quit();
    }

}