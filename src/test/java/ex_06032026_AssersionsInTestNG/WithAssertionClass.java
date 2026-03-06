package ex_06032026_AssersionsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WithAssertionClass {
    @Test

    void testResult(){
        String Actual_Url="ABC";
        String Expected_Url="ABC";

        Assert.assertEquals(Actual_Url,Expected_Url);
    }
}
