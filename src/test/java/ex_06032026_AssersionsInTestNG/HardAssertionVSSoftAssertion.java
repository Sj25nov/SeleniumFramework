package ex_06032026_AssersionsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionVSSoftAssertion {
@Test
    void HardAssertion(){
        System.out.println("HardAssertion");
        System.out.println("HardAssertion");
        Assert.assertEquals(1,1);
        System.out.println("HardAssertion");
        System.out.println("HardAssertion");
    }
}
