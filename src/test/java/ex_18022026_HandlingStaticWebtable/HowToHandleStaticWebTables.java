package ex_18022026_HandlingStaticWebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HowToHandleStaticWebTables {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //Find Total Numbers of Rows in tables
       //tr-->Represent total number of Rows

       List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        System.out.println("The Number of rows in the Web Table is: "+rows.size());

        //Find Total Number Of Columns
        //th--->represent total number of columns

        int columns=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("The Number of columns in the Web Table is: "+columns);

        //Read Data From Specific row and columns(Captur data from 1st columns and row 5)


       for(int i=0;i<rows.size();i++){
           System.out.println("The Elements In Rows"+rows.get(i).getText());
       }
       for (int i=0;i<columns;i++){
           System.out.println("The ELements In Columns"+rows.get(i).getText());
       }
    }
}
