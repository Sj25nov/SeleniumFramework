package ex_22022026_HandledKeyboardEventstabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewtAbWithoutCloseOldTab {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }
}
