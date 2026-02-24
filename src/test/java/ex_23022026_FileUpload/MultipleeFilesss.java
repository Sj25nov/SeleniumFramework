package ex_23022026_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MultipleeFilesss {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
        //Multiple files uploaded
        String file1 = "G:\\AutomationCourseUdemyNotes\\Day-22.txt";
        String file2 = "G:\\AutomationCourseUdemyNotes\\Day-21.txt";

        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);

        int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

        //validation 1 - Number of files
        if (noOfFilesUploaded == 2) {
            System.out.println("All Files are uploaded");
        } else {
            System.out.println("Files are not uploaded or incorrect files uploaded");
        }

        //validate file names

        if (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Day-22.txt")
                && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Day-21.txt")) {
            System.out.println("File names matching..");
        } else {
            System.out.println("Files are not not matching.");
        }
    }
}