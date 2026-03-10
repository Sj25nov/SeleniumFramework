package ex_09032026_DependencyMethodsndGrouping;

import org.testng.annotations.Test;

public class GroupingSignUpTestC2 {
    @Test(priority=1,groups={"Regression"})
void SignUpByEmail()
{
    System.out.println("SignUpByEmail");
}

    @Test(priority=2,groups={"Regression"})
    void SignByFaceBook(){
        System.out.println("SignUpByFaceBook");
    }
    @Test(priority=3,groups={"Regression"})
    void SignUpByTwitter(){
        System.out.println("SignUpByTwitter");
    }
}
