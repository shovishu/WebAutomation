import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import org.apache.poi.util.Internal;
import java.io.IOException;

public class ExcelReadTest {

    public static void main(String args[]) throws IOException {

//        System.out.println(System.getProperty("user.dir"));
        FileInputStream fip = new FileInputStream(System.getProperty("user.dir")+"\\TestDataSheet.xlsx");
        XSSFWorkbook xwb = new XSSFWorkbook(fip);
        XSSFSheet xsh = xwb.getSheetAt(0);
        int row_no = xsh.getLastRowNum();
        int column_no = xsh.getRow(1).getLastCellNum();
        System.out.println(row_no);
        System.out.println(column_no);

        for (int i=1;i<=row_no;i++) {
            for (int j = 0; i <= column_no ; j++) {
                System.out.println(xsh.getRow(i).getCell(j).getStringCellValue());
            }
        }
    }
}
