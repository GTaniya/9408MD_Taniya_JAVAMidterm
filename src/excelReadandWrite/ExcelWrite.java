package excelReadandWrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("TestSheet2");

        Object[][] bookData = {
                {"345MD", "Cathy Sara", 86},
                {"548VA", "Jenny Harris", 90},
                {"678NY", "Gawri Taniya", 98},
                {"876KS", "Roy Harry", 100},
        };

        int rowCount = 0;

        for(Object[] aBook: bookData){
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;

            for(Object field: aBook){
                Cell cell = row.createCell(++columnCount);

                if (field instanceof String ){
                    cell.setCellValue((String) field);

                }else if (field instanceof Integer){
                    cell.setCellValue((Integer) field);
                }
            }
        }

        try(FileOutputStream outputStream = new FileOutputStream("DataTest/StudentsGrade.xlsx")){

            workbook.write(outputStream);
            System.out.println("\n Operation Successful ");

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("\n Operation not successful ");
        }
    }
}
