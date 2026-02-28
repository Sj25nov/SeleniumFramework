package ex_27022026_ReadingExcelsFiles;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataInExecel {
    public static void main(String[] args) throws IOException {
FileOutputStream Files=new FileOutputStream(System.getProperty("user.dir")+"//src//test//TestData//NewFile.xlsx");


XSSFWorkbook workbook=new XSSFWorkbook();

XSSFSheet sheet=workbook.createSheet("SampleData");

XSSFRow row1=sheet.createRow(0);
row1.createCell(0).setCellValue("Java");
row1.createCell(1).setCellValue(19);
row1.createCell(2).setCellValue("Automation");


        XSSFRow row2=sheet.createRow(1);
        row2.createCell(0).setCellValue("Python");
        row2.createCell(1).setCellValue(3);
        row2.createCell(2).setCellValue("Automation");


        XSSFRow row3=sheet.createRow(2);
        row3.createCell(0).setCellValue("C#");
        row3.createCell(1).setCellValue(3);
        row3.createCell(2).setCellValue("Automation");


     workbook.write(Files);

        workbook.close();
        Files.close();
        System.out.println("The File is created");

    }
}
