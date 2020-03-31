import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestgithubTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    private String baseUrl;
    private String []Ssid=new String[20];
    private String []Surl=new String[20];
    private String github;
    private readXLSX readXLSX;

    @Before
    public void setUp() throws IOException {
        System.setProperty("webdriver.gecko.driver", "/Users/tashou/Downloads/geckodriver");
        driver = new FirefoxDriver();
        readXLSX=new readXLSX();
        baseUrl = "http://103.120.226.190/selenium-demo/git-repo";
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void testBaidu() throws IOException {

        readXLSX.readXlsx(Ssid,Surl);
        driver.get("http://103.120.226.190/selenium-demo/git-repo");
        driver.manage().window().setSize(new Dimension(794, 696));
        for(int i=0;i<Ssid.length;i++){
            driver.findElement(By.name("user_number")).click();
            driver.findElement(By.name("user_number")).clear();
            driver.findElement(By.name("user_number")).sendKeys(Ssid[i]);
            driver.findElement(By.name("password")).click();
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("password")).sendKeys(Surl[i]);
            driver.findElement(By.cssSelector(".btn")).click();
            driver.findElement(By.cssSelector("html")).click();
            github=driver.findElement(By.cssSelector("form > div:nth-of-type(5) > code")).getText();
            assertEquals(Surl[i],github);
        }

    }
}
