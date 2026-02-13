package ex_13022026_HandledCheckboxndRadioBtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandledRadioButtons {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement male= driver.findElement(By.xpath("//input[@id='male']"));
        WebElement Female= driver.findElement(By.xpath("//input[@id='female']"));

        System.out.println("Before the Selecting The Radio Button");
        System.out.println("Is the button is selected-->"+male.isSelected());
        System.out.println("Is the button is selected--->"+Female.isSelected());
Female.click();
        System.out.println("After the Selecting The Radio Button");
        System.out.println("Is the button is selected-->"+male.isSelected());
        System.out.println("Is the button is selected-->"+Female.isSelected());

    }
}
