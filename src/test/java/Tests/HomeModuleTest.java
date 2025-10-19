package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class HomeModuleTest extends BaseTest {

    BaseTest BasicObj = new BaseTest();

    HomePage HomePageObj ;



    @Test(enabled = false)
    public void LoadTest(){
        HomePageObj = new HomePage(driver);

        HomePageObj.H_VerifySuccessLoad();
    }


    @Test(enabled = false)
    public void CheckLinks(){

        HomePageObj = new HomePage(driver);


        HomePageObj.H_ValidateDogLink();
        HomePageObj.H_ClickRTM();

        HomePageObj.H_ValidateFishLink();
        HomePageObj.H_ClickRTM();

        HomePageObj.H_ValidateBirdLink();
        HomePageObj.H_ClickRTM();

    }

    @Test
    public void CheckLogO(){

        HomePageObj = new HomePage(driver);

        HomePageObj.H_ClickingOnImage();
    }

}
