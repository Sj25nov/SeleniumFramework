package Practice;

public class StringReverse {
    public static void main(String[] args) {

        String Original="Automation";
        String Reverse="";

        for(int i=Original.length()-1;i>=0;i--){
            Reverse+=Original.charAt(i);
        }
        System.out.println("Original String is---->"+Original);
        System.out.println("Reverse String is----->"+Reverse);
    }
}
