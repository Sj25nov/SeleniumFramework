package ex_27022026_ReadingExcelsFiles;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadExcelDataDynamically {
    public static void main(String[] args) throws IOException {

        FileOutputStream FIS=new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\DynamicDataExcel.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("DynamicDataExcel");
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Row Number");
        int Number_Of_Rows=Sc.nextInt();
        System.out.println("Enter the Cells Number");
        int number_of_cells=Sc.nextInt();

        for(int r=0;r<=Number_Of_Rows;r++){
            XSSFRow row=sheet.createRow(r);
            for(int c=0;c<number_of_cells;c++){
                XSSFCell cell=row.createCell(c);
                cell.setCellValue(Sc.next());
            }

        }
workbook.write(FIS);
        workbook.close();
        FIS.close();
        System.out.println("File Created Successfully");

    }
}
