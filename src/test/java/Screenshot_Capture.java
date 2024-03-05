import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Screenshot_Capture {
    public static WebDriver driver;
    public static void main(String args[]) throws IOException {


        try {

            WebDriverManager.chromiumdriver().setup();
            driver = new ChromeDriver();

            driver.get("https://google1.com");
            List<WebElement> list=driver.findElements(By.name("q"));
            System.out.println("passed");
        }
        catch (Throwable TB){
            System.out.println("failed");
            TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
            File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("//C:/Users/Acer/Downloads/failure.jpg"));
        }
    }
}
