import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Multiple_Window_Handle {

    public static void main(String args[]){


        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        String parent=driver.getWindowHandle();
        System.out.println(parent);

        Set<String> str = driver.getWindowHandles();
        Iterator<String> itr = str.iterator();
        while (itr.hasNext())
        {
            String childwindow=itr.next();
//            System.out.println(itr.hasNext());
            if(!parent.equals(itr.next()))
            {
                driver.switchTo().window(childwindow);
                System.out.println(driver.findElement(By.xpath("//*[text()='New Window']")).getText());
                driver.switchTo().window(parent);
            }
        }
    }
}
