import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    public static void main(String args[]) throws IOException {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver=new ChromeDriver();

        Properties properties = new Properties();
        FileInputStream fip = new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\WebAutomation\\Testdata.properties");

        properties.load(fip);

        driver.get(properties.getProperty("url"));
        driver.findElement(By.name("email")).sendKeys(properties.getProperty("Username"));
        driver.findElement(By.name("password")).sendKeys(properties.getProperty("Password"));
        driver.findElement(By.xpath("//input[@value='Login']")).submit();

        System.out.println(properties.getProperty("url"));

        FileOutputStream fop=new FileOutputStream("C:\\Users\\Acer\\IdeaProjects\\WebAutomation\\Testdata.properties");
        properties.setProperty("Password","shovishu");
        properties.store(fop,"new data saved");

    }
}
