import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

    public static void main(String args[]){
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://sellglobal.ebay.in/seller-center/");

        Actions act = new Actions(driver);
//        act.moveToElement(driver.findElement(By.linkText("Seller Updates"))).build().perform();
        act.moveToElement(driver.findElement(By.linkText("Getting Started"))).build().perform();
//        act.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
//        driver.quit();

    }
}
