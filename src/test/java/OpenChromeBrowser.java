import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OpenChromeBrowser {

    @Test
    public void testOpenBrowser() throws Exception{
       System.setProperty("webdriver.chrome.driver" , "/Users/swekenyi/Documents/Personal/DevPlayBook/MavenTest/chromedriver");
        //Initialize browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //Open google
        driver.get("http://google.com");

        //Close browser
       driver.close();
    }
    @Test
    public void testParsingTextOnBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("http://google.com");

    }
}
