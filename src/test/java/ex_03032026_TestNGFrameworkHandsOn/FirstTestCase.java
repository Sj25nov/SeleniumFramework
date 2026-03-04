package ex_03032026_TestNGFrameworkHandsOn;
/*
1)-Open The Browser
2)-Logged Into Page
3)-Logged Out From Page

 */


import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority=1)
    void openbrowser()
    {
        System.out.println("Opening Browser");
    }
    @Test(priority = 2)
    void LoggedIntoPage()
    {
        System.out.println("LoggedIntoPage");
    }
    @Test(priority = 3)
void LoggedOutFromPage() {
        System.out.println("LoggedOutFromPage");
}

}
