package ex_12022026_BrowserMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandledBrowserWindows {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

       Set<String> WindowsID=driver.getWindowHandles();

       List<String> WindowsList=new ArrayList(WindowsID);

       String PArent_ID=WindowsList.get(0);

       String Child_ID=WindowsList.get(1);

        System.out.println(driver.getTitle());

//Switch To Child window
        driver.switchTo().window(Child_ID);
        System.out.println("The Current Title is--->"+driver.getTitle());

//Switch to Parent Window

        driver.switchTo().window(PArent_ID);
        System.out.println("The Current Title is--->"+driver.getTitle());


    }
}
