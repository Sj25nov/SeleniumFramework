package ex_21022026_DatePickersCalendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerSuingSendkeys {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");

        driver.manage().window().maximize();

        //Switch to the frame
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("(//input[@id='datepicker'])[1]")).sendKeys("02/21/2026");//DD//MM//YYYY

    }
}
