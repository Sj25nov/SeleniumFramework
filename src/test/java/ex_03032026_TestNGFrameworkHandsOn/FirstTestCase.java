package ex_03032026_TestNGFrameworkHandsOn;
/*
1)-Open The Browser
2)-Logged Into Page
3)-Logged Out From Page

 */


import org.testng.annotations.Test;

public class FirstTestCase {
    @Test
    void openbrowser()
    {
        System.out.println("Opening Browser");
    }
    @Test
    void LoggedIntoPage()
    {
        System.out.println("LoggedIntoPage");
    }
    @Test
void LoggedOutFromPage() {
        System.out.println("LoggedOutFromPage");
}

}
