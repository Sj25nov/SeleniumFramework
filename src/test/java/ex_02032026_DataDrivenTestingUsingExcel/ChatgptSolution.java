package ex_02032026_DataDrivenTestingUsingExcel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

    public class ChatgptSolution {

        public static void main(String[] args) throws IOException {

            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");

            String filePath = System.getProperty("user.dir") + "//src//test//TestData//caldata.xlsx";

            int rows = ExcelUtils.getRowCount(filePath, "Sheet1");

            for (int i = 1; i <= rows; i++) {

                // ==========================
                // 1. Read Data from Excel
                // ==========================
                String principal = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
                String rateOfInterest = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
                String tenure = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
                String tenurePeriod = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
                String frequency = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
                String expectedValue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);

                // ==========================
                // 2. Enter Data in UI
                // ==========================
                driver.findElement(By.id("principal")).clear();
                driver.findElement(By.id("principal")).sendKeys(principal);

                driver.findElement(By.id("interest")).clear();
                driver.findElement(By.id("interest")).sendKeys(rateOfInterest);

                driver.findElement(By.id("tenure")).clear();
                driver.findElement(By.id("tenure")).sendKeys(tenure);

                new Select(driver.findElement(By.id("tenurePeriod")))
                        .selectByVisibleText(tenurePeriod);

                new Select(driver.findElement(By.id("frequency")))
                        .selectByVisibleText(frequency);

                // ==========================
                // 3. Remove Overlay if Present
                // ==========================
                removeOverlay(driver);

                // ==========================
                // 4. Click Calculate (JS Click)
                // ==========================
                WebElement calculateBtn =
                        driver.findElement(By.xpath("//div[@class='cal_div']//a[1]"));

                ((JavascriptExecutor) driver)
                        .executeScript("arguments[0].scrollIntoView(true);", calculateBtn);

                ((JavascriptExecutor) driver)
                        .executeScript("arguments[0].click();", calculateBtn);

                // ==========================
                // 5. Get Actual Maturity Value
                // ==========================
                wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//span[@id='resp_matval']//strong")));

                String actualValue =
                        driver.findElement(By.xpath("//span[@id='resp_matval']//strong"))
                                .getText();

                actualValue = actualValue.replace(",", "").trim();

                // ==========================
                // 6. Validation
                // ==========================
                if (Double.parseDouble(expectedValue) ==
                        Double.parseDouble(actualValue)) {

                    System.out.println("Row " + i + " → Test Passed");

                    ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
                    ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);

                } else {

                    System.out.println("Row " + i + " → Test Failed");

                    ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
                    ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
                }

                // ==========================
                // 7. Click Clear Button
                // ==========================
                removeOverlay(driver);

                WebElement clearBtn =
                        driver.findElement(By.xpath("//img[@class='PL5']"));

                ((JavascriptExecutor) driver)
                        .executeScript("arguments[0].click();", clearBtn);
            }

            driver.quit();
        }

        // ======================================
        // Method to Remove Advertisement Overlay
        // ======================================
        public static void removeOverlay(WebDriver driver) {
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript(
                    "var overlay = document.querySelector('.wzrk-overlay');" +
                            "if(overlay){ overlay.remove(); }"
            );
        }
    }
