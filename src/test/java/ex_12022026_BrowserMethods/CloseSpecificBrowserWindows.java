package ex_12022026_BrowserMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class CloseSpecificBrowserWindows {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> WindowsID=driver.getWindowHandles();

        for(String winid:WindowsID){
            String title=driver.switchTo().window(winid).getTitle();
            System.out.println(title);

            if(title.equals("OrangeHRM")){
                driver.close();
            }
        }
    }
}
