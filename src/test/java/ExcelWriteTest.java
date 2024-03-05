import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteTest {

    public static void main(String args[]) throws IOException {

        FileInputStream fipt = new FileInputStream(System.getProperty("user.dir")+"\\TestDataSheet.xlsx");
        XSSFWorkbook xwb = new XSSFWorkbook(fipt);
        XSSFSheet xsh = xwb.getSheetAt(0);
        xsh.getRow(1).getCell(1).setCellValue("ABCD");
//        int row_no = xsh.getLastRowNum();
//        int column_no = xsh.getRow(1).getLastCellNum();
//        System.out.println(row_no);
//        System.out.println(column_no);
        FileOutputStream fopt= new FileOutputStream(System.getProperty("user.dir")+"\\TestDataSheet.xlsx");
        xwb.write(fopt);
        fopt.close();
    }
}
