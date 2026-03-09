package ex_06032026_AssersionsInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
@Test

    void Result(){
  Assert.assertEquals("Abc","Abc");
  Assert.assertEquals("123","123");

}
@Test
void Test(){

    Assert.assertNotEquals(127,1414);
}
@Test
void newTest() {

    Assert.assertTrue(true);
}

}


