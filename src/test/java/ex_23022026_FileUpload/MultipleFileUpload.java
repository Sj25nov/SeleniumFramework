package ex_23022026_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MultipleFileUpload {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

     /*   WebElement FileUpload=  driver.findElement(By.xpath("//input[@id='filesToUpload']"));
        FileUpload.sendKeys("G:\\AutomationCourseUdemyNotes\\Day-22.txt");

      */
        Thread.sleep(5000);
        String File1="G:\\AutomationCourseUdemyNotes\\Day-22.txt";
        String File2="G:\\AutomationCourseUdemyNotes\\Day-21.txt";
Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@id='filesToUpload'])[1]")).sendKeys(File1+"/n"+File2);

       // if(driver.findElement(By.xpath("//ul[@id='fileList']//li")&&).getText().equals("Day-22.txt")){
       //     System.out.println("File uploaded successfully");
     //   }else{
      //      System.out.println("File upload failed");
      //  }

    }
}

