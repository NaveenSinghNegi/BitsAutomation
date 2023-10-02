package Utilities;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyCoursesPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;
    public LoginPage loginpage;
    public HomePage homePage;
    public MyCoursesPage coursePage;
    public GenericUtilitiesFunctions genericUtilitiesFunctions;

    public PageObjectManager(WebDriver driver) {
        this.driver=driver;
    }

    public LoginPage getloginPage(){
        loginpage = new LoginPage(driver);
        return loginpage;
    }

    public HomePage getHomePage(){
        homePage = new HomePage(driver);
        return homePage;
    }

    public MyCoursesPage getCoursePage(){
        coursePage = new MyCoursesPage(driver);
        return coursePage;
    }

    public GenericUtilitiesFunctions getGenericUtilitiesFunctions(){
        genericUtilitiesFunctions=new GenericUtilitiesFunctions(driver);
        return genericUtilitiesFunctions;
    }
}
