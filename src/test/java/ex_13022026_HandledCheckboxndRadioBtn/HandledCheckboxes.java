package ex_13022026_HandledCheckboxndRadioBtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.time.Duration;
import java.util.List;

public class HandledCheckboxes {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
//Select The Checkboxes
        //   WebElement Verify= driver.findElement(By.xpath("//input[@id='sunday']"));

//
        //   System.out.println("Is Checkbox is selected--->"+Verify.isSelected());
        //         Verify.click();
        // System.out.println("Is Checkbox is selected--->"+Verify.isSelected());
//Check Total Count of checkboxes

        List<WebElement> CheckboxCount = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        System.out.println("Total Count of checkboxes--" + CheckboxCount.size());
        //Selected all the checkboxes

        // for(int i=0;i< CheckboxCount.size();i++){
        //   CheckboxCount.get(i).click();

        // for(WebElement chxbx:CheckboxCount){

        //    chxbx.click();
        //  }
//Select Last 4 Checkboxed

        // for(int i=3;i< CheckboxCount.size();i++){
        //    CheckboxCount.get(i).click();
        //  }
//Select unselected checkboxes and deselect selected one

     /*   Thread.sleep(10000);
        for (WebElement Wbxxnt : CheckboxCount) {

            if (Wbxxnt.isSelected()) {
                Wbxxnt.click();
            } else {
                Wbxxnt.click();
            }


        }
        Thread.sleep(10000);
        for (WebElement Wbxxnt : CheckboxCount) {

            if (Wbxxnt.isSelected()) {
                Wbxxnt.click();
            } else {
                Wbxxnt.click();
            }
        }

      */
  /*      //Select Randomely Checkboxes
        for(int i=0;i<CheckboxCount.size();i++){
            if(i==1 || i==3 || i==6){
                CheckboxCount.get(i).click();
            }
        }
       */

       //Based On value select Particular Day

       String Weekday="Sunday";
       switch (Weekday){
           case "Sunday":driver.findElement(By.xpath("//input[@id='sunday']")).click();
           break;
           case "Monday":driver.findElement(By.xpath("//input[@id='monday']")).click();
           break;
           case "Tuesday":driver.findElement(By.xpath("//input[@id='tuesday']")).click();
           break;
           case "Wednesday":driver.findElement(By.xpath("//input[@id='wednesday']")).click();
           break;
           case "Thursday":driver.findElement(By.xpath("//input[@id='thursday']")).click();
           break;
           case "Friday":driver.findElement(By.xpath("//input[@id='friday']")).click();
           break;
           case "Saturday":driver.findElement(By.xpath("//input[@id='saturday']")).click();
           default:
               System.out.println("Wrong Weekday");
       }
        System.out.println("Blablaaa...!!");
    }
}
