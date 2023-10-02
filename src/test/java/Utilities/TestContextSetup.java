package Utilities;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestContextSetup {
    public WebDriver driver;
    public TestBase testBase;
    public PageObjectManager pageObjectManager;
    public GenericUtilitiesFunctions genericUtilitiesFunctions;

    public TestContextSetup() throws IOException {
        testBase=new TestBase();
        driver=testBase.getDriverManager();
        pageObjectManager=new PageObjectManager(driver);
        genericUtilitiesFunctions=new GenericUtilitiesFunctions(driver);
    }
}
