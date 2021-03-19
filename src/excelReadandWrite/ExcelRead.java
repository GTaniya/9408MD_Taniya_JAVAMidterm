package excelReadandWrite;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelRead {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("DataTest/StudentsInfo.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator ite = sheet.rowIterator();

        while (ite.hasNext()){
            Row row = (Row) ite.next();
            Iterator<Cell> cite = row.cellIterator();
            //each column <- loop until all rows are fetched

            while (cite.hasNext()) { //<- boolean condition -> which will return true or false according to data defined

                Cell c = cite.next();//<- fetches the next cell, then cell after until no cell is left to be fetched

                System.out.print(c.toString().concat(" ") + " ");
            }
            System.out.println();
        }
        fis.close();
    }
}




