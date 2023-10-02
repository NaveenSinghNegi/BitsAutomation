package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;
    By username=By.xpath("//input[@id='username']");
    By password=By.xpath("//input[@id='pass']");
    By loginButton=By.xpath("//button[@id='submitbtn']");


    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getUsername(){
        return driver.findElement(username);
    }

    public WebElement getPassword(){
        return driver.findElement(password);
    }

    public WebElement getLoginButton(){
        return driver.findElement(loginButton);
    }

    public void doLogin(String username, String password){
        getUsername().sendKeys(username);
        getPassword().sendKeys(password);
        getLoginButton().click();
    }
}
