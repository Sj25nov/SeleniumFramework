package ex_27022026_ReadingExcelsFiles;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromExcel {
    public static void main(String[] args) throws IOException {

        FileInputStream FIS=new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\SeleniumFramework1\\src\\test\\TestData\\AutomationReadExcelData.xlsx");
    XSSFWorkbook WK=new XSSFWorkbook(FIS);
    XSSFSheet Sheet=WK.getSheetAt(0);
    int totalrows=Sheet.getLastRowNum();
    int totalCells=Sheet.getRow(1).getLastCellNum();

        System.out.println("Total Number Of Columns-->"+totalrows);
        System.out.println("Total Number Of Cell-->"+totalCells);

        for(int r=0;r<=totalrows;r++){
            XSSFRow CurrentReadingRows=Sheet.getRow(r);
            for(int c=0;c<totalCells;c++){
                XSSFCell Readingcells=CurrentReadingRows.getCell(c);
                System.out.print(Readingcells.toString()+"\t");
            }
            System.out.println();
        }
        WK.close();
        FIS.close();
    }
}
