package Tests;

import Data.LoadProperties;
import Pages.UserRegistrationPage;
import org.testng.annotations.Test;

import java.util.Properties;

public class UserRegistrationTest extends  BaseTest{

    UserRegistrationPage UserRegisterObj ;
    Properties prop;

    @Test
    public void UserCanRegisterSuccess(){

        prop = LoadProperties.LoadTheData("src/main/java/properties/UserData.properties");

        UserRegisterObj = new UserRegistrationPage(driver);

        UserRegisterObj.OpenRegistrationPage();

        UserRegisterObj.RegisterNewUser(
                prop.getProperty("username"),
                prop.getProperty("password"),
                prop.getProperty("firstName"),
                prop.getProperty("lastName"),
                prop.getProperty("email"),
                prop.getProperty("phone"),
                prop.getProperty("address1"),
                prop.getProperty("address2"),
                prop.getProperty("city"),
                prop.getProperty("state"),
                prop.getProperty("zip"),
                prop.getProperty("country")
        );

        UserRegisterObj.ClickRegisterBtn();

        UserRegisterObj.R_ValidateSingin(prop.getProperty("username"),prop.getProperty("password"));
    }
}
