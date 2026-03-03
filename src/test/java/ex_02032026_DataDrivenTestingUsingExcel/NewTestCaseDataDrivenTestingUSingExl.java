package ex_02032026_DataDrivenTestingUsingExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class NewTestCaseDataDrivenTestingUSingExl {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //  driver.switchTo().alert().accept();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
        driver.manage().window().maximize();
        // wait.until(ExpectedConditions.alertIsPresent());

        //String alertText = driver.switchTo().alert().getText();
        //   System.out.println(alertText);


        String File = System.getProperty("user.dir") + "//src///test///TestData//caldata.xlsx";

        int rowCount = ExcelUtils.getRowCount(File, "Sheet1");

        for (int i = 1; i <= rowCount; i++) {
            //Read Data From Excel
            String Principle = ExcelUtils.getCellData(File, "Sheet1", i, 0);
            String RateOFInterest = ExcelUtils.getCellData(File, "Sheet1", i, 1);
            String Period1 = ExcelUtils.getCellData(File, "Sheet1", i, 2);
            String Period2 = ExcelUtils.getCellData(File, "Sheet1", i, 3);
            String Frequency = ExcelUtils.getCellData(File, "Sheet1", i, 4);
            String ExpectedMaturityValue = ExcelUtils.getCellData(File, "Sheet1", i, 5);

//Passed The Data Into Application
            driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(Principle);
            driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(RateOFInterest);
            driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(Period1);
            Select Dropdown = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
            Dropdown.selectByVisibleText(Period2);
            Select Frqncy = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
            Frqncy.selectByVisibleText(Frequency);
            //clicked On Calculate
            driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
            //Validation

            String MaturityValueActual = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

            if (Double.parseDouble(MaturityValueActual) == Double.parseDouble(ExpectedMaturityValue)) {
                System.out.println("Passed");
                ExcelUtils.setCellData(File, "Sheet1", i, 7, "Passed");
                ExcelUtils.fillGreenColor(File, "Sheet1", i, 7);
            } else {
                System.out.println("Maturity Value is not correct");
                ExcelUtils.setCellData(File, "Sheet1", i, 7, "Failed");
                ExcelUtils.fillRedColor(File, "Sheet1", i, 7);
            }
            Thread.sleep(5000);
            driver.findElement(By.xpath("//img[@class='PL5']")).click();

        } //Ending Of For Loop
        driver.quit();
    }
}