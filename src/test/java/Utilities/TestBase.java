package Utilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;
    public Properties prop;

    public WebDriver getDriverManager() throws IOException {
        FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\Resources\\global.properties");
        prop=new Properties();
        prop.load(fs);
        String browserName_prop=prop.getProperty("browser");
        String browserName_maven=System.getProperty("browser");

        String browserName=browserName_maven!=null ? browserName_maven : browserName_prop;

        if(driver==null){
            if (browserName.equalsIgnoreCase("chrome")){
                driver=new ChromeDriver();
                driver.manage().deleteAllCookies();
            }
            else if(browserName.equalsIgnoreCase("firefox")) {
                driver=new FirefoxDriver();
            }
            else if(browserName.equalsIgnoreCase("edge")) {
                driver=new EdgeDriver();
            }
        }

        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }
}
