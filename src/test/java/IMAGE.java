import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class IMAGE {
    private static int iBrokenImageCount;

    public static void main(String args[]) {

        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Broken Images")).click();


        String status;
        try
        {
            iBrokenImageCount = 0;
            List<WebElement> list = driver.findElements(By.tagName("img"));
            System.out.println(list.size());

            for (WebElement img : list)
            {
                System.out.println(img.getAttribute("outerHTML"));
            }
            System.out.println("\n");
            for (WebElement img : list)
            {
                if (img != null)
                {
                    HttpClient client = HttpClientBuilder.create().build();
                    HttpGet request = new HttpGet(img.getAttribute("src"));
                    HttpResponse response = client.execute(request);
                    /* For valid images, the HttpStatus will be 200 */
                    if (((HttpResponse) response).getStatusLine().getStatusCode() != 200)
                    {
                        System.out.println(img.getAttribute("outerHTML") + " is broken.");
                        iBrokenImageCount++;
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            status = "failed";
            System.out.println(e.getMessage());
        }
        status = "passed";
    }

}
