import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alerts {

    public static void main(String args[]) throws InterruptedException {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/Acer/Downloads/SimpleAlert.html");
        driver.findElement(By.xpath("//*[text()='Click on me']")).click();

        Alert alert=driver.switchTo().alert();

        String mssg = driver.switchTo().alert().getText();
        System.out.println(mssg);

        Thread.sleep(2000);

        alert.accept();
    }
}
