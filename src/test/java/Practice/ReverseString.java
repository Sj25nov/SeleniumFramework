package Practice;

public class ReverseString {
    public static void main(String[] args) {

        String Original="SAURABH";
        String Reverse="";

        for(int i=Original.length()-1;i>=0;i--)
        {
Reverse=Reverse+Original.charAt(i);
        }
        System.out.println("The Original String is---->"+Original);
        System.out.println("The Reverse String is--->"+Reverse);
    }

}
