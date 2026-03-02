package ex_27022026_ReadingExcelsFiles;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataSpecificRowAndCell {
    public static void main(String[] args) throws IOException {
        FileOutputStream FIS=new FileOutputStream(System.getProperty("user.dir")+"\\src\\test\\SpecificRowAndClmn.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("RowCellSpecific");

        XSSFRow row=sheet.createRow(3);
        XSSFCell cell=row.createCell(4);
        cell.setCellValue("Cell 2");

        workbook.write(FIS);
        workbook.close();
        FIS.close();
        System.out.println("The File Created Successfully");

    }
}
