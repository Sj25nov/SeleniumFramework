package ex_22012026_HowToHandledAutoSuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Google_AutoSuggestDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://google.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
        Thread.sleep(5000);
List<WebElement> counting=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

        System.out.println(counting.size());

        for(int i=0;i<counting.size();i++){

            System.out.println(counting.get(i).getText());
            Thread.sleep(2000);
            if(counting.get(i).getText().equals("selenium"))
            {
                counting.get(i).click();
                break;
            }
            }
        }

    }

