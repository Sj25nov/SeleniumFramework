package ex_06032026_AssersionsInTestNG;

import org.testng.annotations.Test;

public class Assersions {
    @Test
    void testActual(){
        String Actual_url="ABC";
        String Expected_url="AB";

        if(Actual_url.equals(Expected_url))
        {
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }


}

}
