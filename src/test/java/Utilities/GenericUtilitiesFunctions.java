package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class GenericUtilitiesFunctions {

    public WebDriver driver;

    public GenericUtilitiesFunctions(WebDriver driver){
        this.driver=driver;
    }

    public void closeBrowser(){
        try {
            driver.quit();
        }
        catch (Exception e){
            e.printStackTrace();
            driver.quit();
        }
    }

    public byte[] takeScreenshot() throws IOException {
        File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent= FileUtils.readFileToByteArray(sourcepath);
        return fileContent;
    }
}
