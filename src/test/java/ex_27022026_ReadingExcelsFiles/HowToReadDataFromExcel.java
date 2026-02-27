package ex_27022026_ReadingExcelsFiles;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HowToReadDataFromExcel {
    public static void main(String[] args) throws IOException {
       FileInputStream Fis = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\SeleniumFramework1\\src\\test\\TestData\\AutomationReadExcelData.xlsx");
       // FileInputStream Fis=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\AutomationReadExcelData.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(Fis);
XSSFSheet sheet=wb.getSheetAt(0);
int totalrows=sheet.getLastRowNum();
int totalcells=sheet.getRow(totalrows).getLastCellNum();
        System.out.println(totalrows);
        System.out.println(totalcells);



    }
}
