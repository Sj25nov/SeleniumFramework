package ex_02032026_DataDrivenTestingUsingExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFiles {
    public static void main(String[] args) throws IOException {

        //Get The Location Of Properties Files

        FileInputStream FIS=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\TestData\\Config.properties");

        //Load The Data From Properties Files
        Properties POPS=new Properties();
        POPS.load(FIS);

        //Read The Data From Properties files
    String appurl=POPS.getProperty("appurl");
    String Email=POPS.getProperty("Email");
    String Password=POPS.getProperty("Password");

    //Print The Data Into Console

        System.out.println(appurl+"  "+Email+"   "+Password);

        //Read All the keys from properties files
        Set<String> Keys=POPS.stringPropertyNames();
        System.out.println("Keys Are...."+Keys);
        //OR
        Set <Object> Keyss=POPS.keySet();
        System.out.println("The Keys are"+Keyss);

        //Read Only Values from properties filess

Collection<Object>valuess=POPS.values();
System.out.println("The values are"+valuess);

    }
}
