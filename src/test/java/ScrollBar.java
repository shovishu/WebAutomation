import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

//        driver.get("https://demo.opencart.com/");

        JavascriptExecutor jst = (JavascriptExecutor) driver;

        jst.executeScript("window.location='https://demo.opencart.com/'");
        Thread.sleep(1500);
        jst.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        jst.executeScript("window.scrollTo(document.body.scrollHeight,0)");
    }
}
