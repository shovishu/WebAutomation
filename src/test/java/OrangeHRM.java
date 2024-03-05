import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OrangeHRM {
    
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(5000);
//        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
//        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("nnnilhil");
//        driver.findElement(By.xpath("")).sendKeys("kr");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("dvdssd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("3010");


//        driver.findElement(By.xpath("(//div)[98]")).click();


//        driver.findElement(By.className("oxd-select-text--active")).click();
//        driver.findElement(By.className("oxd-select-text-input")).click();






    }
}
