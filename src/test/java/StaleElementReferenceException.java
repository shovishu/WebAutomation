import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.opencart.com/index.php?route=account/login");

        WebElement username= driver.findElement(By.name("email"));
        username.sendKeys("Vishwajeet");
        driver.navigate().refresh();
        Thread.sleep(3000);
        username.sendKeys("Singh");
    }
}
