package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver= driver;
    }

    By coursenamebtn=By.linkText("My Courses");
    By profileBtn=By.xpath("//button[@id='nav_drpdwn']");
    By logoutBtn=By.linkText("Log Out");

    public WebElement getCourseNameBtn(){
        return driver.findElement(coursenamebtn);
    }

    public WebElement getProfileBtn(){
        return driver.findElement(profileBtn);
    }

    public WebElement getLogoutBtn(){
        return driver.findElement(logoutBtn);
    }

    public void clickCourseName(){
        getCourseNameBtn().click();
    }

    public void clickProfileBtn(){
        getProfileBtn().click();
    }

    public void clickLogoutBtn(){
        getLogoutBtn().click();
    }


}
