package ex_18022026_HandlingStaticWebtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HowToHandleStaticWebTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //Find Total Numbers of Rows in tables
        //tr-->Represent total number of Rows

        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("The Number of rows in the Web Table is: " + rows);

        //Find Total Number Of Columns
        //th--->represent total number of columns

        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("The Number of columns in the Web Table is: " + columns);

        //Read Data From Specific row and columns(Captur data from 1st columns and row 5)
//SelectDataFrom specific row and column
        String Data = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println("The Book Title is:---> " + Data);
//Read data from all rows and columns
        System.out.println("Bookname" + "\t" + "Author" + "\t" + "Subject" + "\t" + "Price");
       // for (int r = 2; r <= rows; r++) {
//for(int c=1;c<=columns;c++){
            // String values=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
            //  System.out.print(values+"\t");

        //Read Data and print whose author is Mukesh
           // for (int r= 2; r <= rows; r++) {

             //   String Authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
               // if (Authorname.equals("Mukesh")) {
                 //   String Bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                   // System.out.println("The Booknames are by Author Mukesh are--->" + Bookname+"\t---->"+Authorname);

                    //System.out.println(Bookname.length());

        //FindOutPrice Of Books
        int TotalPricesOfBooks=0;
        for(int r=2;r<=rows;r++){
            String PricesOfBooks=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            TotalPricesOfBooks=TotalPricesOfBooks+Integer.parseInt(PricesOfBooks);
                }
        System.out.println("Total Prices of Books--->"+TotalPricesOfBooks);
            }
        }


