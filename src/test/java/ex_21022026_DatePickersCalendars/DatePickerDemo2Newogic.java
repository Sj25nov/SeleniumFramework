package ex_21022026_DatePickersCalendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerDemo2Newogic {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.switchTo().frame(0);
        //Using the Date Picker
        //Expected Month and year
        String year="2027";
        String month="August";
        String day="5";

    }
}
