package ex_16022026_HandledDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootStrapDropDown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.jquery-az.com/tools/bs-icon-search.php");

        driver.findElement(By.xpath("//select[@id='categoryFilter']")).click();
//Select Single Option

        driver.findElement(By.xpath("//option[@value='Alert']")).click();

        List<WebElement> OptionsinDropDown = driver.findElements(By.xpath("//select[contains(@id,'categoryFilter')]//option"));

        System.out.println(OptionsinDropDown.size());

        // for(int i=0;i<OptionsinDropDown.size();i++){
        for (WebElement Selecteddd : OptionsinDropDown) {

            System.out.println(Selecteddd.getText());

        }
//select multiple options

     /*   for(WebElement op:OptionsinDropDown){
            if(op.getText().equals("Sound") || op.getText().equals("Social Media")){
                op.click();
                System.out.println(op.getText());
               // System.out.println(op.getSize());
            }
            */
        System.out.println("action is press");
    }

}

