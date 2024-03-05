import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTables {
    public static void main(String args[]) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/Acer/Downloads/WbTable.html");

//        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[4]")).getText());
        List<WebElement> list1 = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        List<WebElement> list2 = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/th"));
        int row_count = list1.size();
        int column_count = list2.size();
        System.out.println(row_count);
        System.out.println(column_count);
        for (int i = 3; i <= row_count; i++) {
            for (int j = 1; j <= column_count; j++) {
                System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/td[" + j + "]")).getText());
            }
        }
    }
}
