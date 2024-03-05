import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useful_Methods {

    public static void main(String args[]) throws InterruptedException {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.findElement(By.name("email")).sendKeys("Vishwajeet");

        String actualvalue=driver.findElement(By.name("email")).getAttribute("value");
        String actualvalue1=driver.findElement(By.xpath("//input[@value='Login']")).getCssValue("color");
        driver.findElement(By.xpath("//input[@value='Login']")).submit();

//*[@id="content"]/div/div[2]/div/form/input
        System.out.println(actualvalue);
        System.out.println(actualvalue1);

        Thread.sleep(2000);
        driver.findElement(By.name("email")).clear();


//        if(actualvalue.equals("Vishwajeet")){
//            System.out.println("passed");
//        }
//        else{
//            System.out.println("fail");
//        }
    }
}
