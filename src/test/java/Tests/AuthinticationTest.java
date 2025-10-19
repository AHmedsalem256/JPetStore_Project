package Tests;

import Pages.AuthenticationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.nio.channels.Selector;
import java.time.Duration;

public class AuthinticationTest extends BaseTest {

      @Test
    public void TC_AU_01(){
        AuthenticationPage Obj = new AuthenticationPage(driver);

        String [] Data_Login = Obj.Auth_GetArr_UserID_UserPass();

        Obj.SuccessLogin(Data_Login[0] , Data_Login[1]);

    }

    @Test
    public void TC_AU_02(){
        AuthenticationPage Obj = new AuthenticationPage(driver);
        Obj.FailedLogin();
    }

    @Test(enabled = false)
    public void TC_AU_03(){
    }

    @Test
    public void TC_AU_04(){


    }

    @Test
    public void TC_AU_05(){}

}
