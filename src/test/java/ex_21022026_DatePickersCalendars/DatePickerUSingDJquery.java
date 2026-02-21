package ex_21022026_DatePickersCalendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerUSingDJquery {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.switchTo().frame(0);
        //Using the Date Picker
        //Expected Month and year
        String year="2027";
        String month="August";
        String day="5";

         driver.findElement(By.xpath("(//input[@id='datepicker'])[1]")).click();
Thread.sleep(5000);
         while(true){
             String ExpectedMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
             String ExpectedYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
             if(ExpectedMonth.equals(month) && ExpectedYear.equals(year))
             {
                 break;
             }
             driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-circle-triangle-e'])[1]")).click();
         }

List<WebElement> AllTheDAtes=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tr//td//a"));

         for(WebElement Dates:AllTheDAtes){
             if(Dates.getText().equals(day)){
                 Dates.click();
                 System.out.println("The Final Date is--->"+Dates.getText());
                 break;
             }
         }




    }
}
