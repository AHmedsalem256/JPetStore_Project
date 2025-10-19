package Tests;

/*
* Initialize Driver and Quit Driver
* */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.*;
import org.testng.annotations.*;

public class BaseTest {


    int Counter = 0;
    public static WebDriver driver ;

    public void RefreshRedirectToBasicWebPage(){
        driver.navigate().to("https://jpetstore.aspectran.com/");
    }



    @BeforeSuite
    public void StartDriver(){
        System.setProperty("webdriver.edge.driver","Drivers/msedgedriver.exe");
        driver  = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void StartMethode(){
        Counter++;
        driver.navigate().to("https://jpetstore.aspectran.com/");
        System.out.println("Function "+Counter+" ON");
    }

    @AfterSuite
    public void StopDriver(){
       // driver.quit();
    }





}
