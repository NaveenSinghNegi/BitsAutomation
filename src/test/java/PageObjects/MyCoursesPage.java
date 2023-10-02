package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyCoursesPage {
    public WebDriver driver;

    public MyCoursesPage(WebDriver driver) {
        this.driver=driver;
    }

    List<WebElement> taxilaCourses=driver.findElements(By.tagName("h4"));


}
