import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ButtonLinkTest {

    public static void main(String args[])
    {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

//        WebDriverManager.edgedriver().setup();
//        WebDriver driver1=new EdgeDriver();

        driver.get("https://the-internet.herokuapp.com/");
//        driver.findElement(By.linkText("Add/Remove Elements")).click();
//        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

//        driver.findElement(By.xpath("//button[contains(@id,'Element')]")).click();
//        driver.findElement(By.xpath("//button[starts-with(@id,'Add')]")).click();


        //.......INPUTS......
//        driver.findElement(By.linkText("Inputs")).click();
//        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1816882");
//        driver.manage().window().maximize();


        //...........DROPDOWN.........
//        driver.findElement(By.linkText("Dropdown")).click();
//        driver.findElement(By.id("dropdown")).sendKeys("Option 1");

        //or
//        Select sel = new Select(driver.findElement(By.id("dropdown")));
//        sel.selectByVisibleText("Option 2");
//        sel.selectByValue("2");
//        sel.selectByIndex("1");


        //............CHECKBOXES...........
        driver.findElement(By.linkText("Checkboxes")).click();
        List<WebElement> list =driver.findElements(By.xpath("//input[@type='checkbox']"));
        list.get(0).click();
        System.out.println(list.size());
    }
}
