package Tests;

import Pages.AuthenticationPage;
import Pages.SearchPage;
import jdk.jfr.Enabled;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTest extends BaseTest{


    AuthenticationPage Auth_Obj ;
    SearchPage S_Obj;


    @Test
    public void TC_SR_01_withSearchBtn(){

        Auth_Obj = new AuthenticationPage(driver);
        S_Obj    = new SearchPage(driver);

        Auth_Obj.Auth_PerformFullLogin();
        S_Obj.S_TypeSearch_SearchBtn("Dogs");
        Assert.assertTrue(S_Obj.S_GetProducts()>0);

    }

    @Test
    public void TC_SR_01_withEnterBtn(){

        Auth_Obj = new AuthenticationPage(driver);
        S_Obj    = new SearchPage(driver);

        Auth_Obj.Auth_PerformFullLogin();
        S_Obj.S_TypeSearch_Enter("Dogs");
        Assert.assertTrue(S_Obj.S_GetProducts()>0);

    }

    @Test
    public void TC_SR_02(){
        Auth_Obj = new AuthenticationPage(driver);
        S_Obj    = new SearchPage(driver);

        Auth_Obj.Auth_PerformFullLogin();
        S_Obj.S_TypeSearch_Enter("xyz123");
        Assert.assertTrue(S_Obj.S_isErrorTextDisplayed());
    }

    @Test
    public void TC_SR_03(){
        Auth_Obj = new AuthenticationPage(driver);
        S_Obj    = new SearchPage(driver);

        Auth_Obj.Auth_PerformFullLogin();

        S_Obj.S_TypeSearch_Enter("DOG");
        List Rows_1 = S_Obj.S_GetProductsList();

        S_Obj.S_TypeSearch_Enter("dogs");
        List Rows_2 = S_Obj.S_GetProductsList();


        Assert.assertEquals("Equal" , Rows_1,Rows_2);
        Assert.assertTrue(Rows_1.size()>1);
        Assert.assertTrue(Rows_2.size()>1);
    }

    @Test(enabled = false)
    public void TC_SR_04(){
        Auth_Obj = new AuthenticationPage(driver);
        S_Obj    = new SearchPage(driver);

        Auth_Obj.Auth_PerformFullLogin();
        S_Obj.S_TypeSearch_Enter("Dogs");
        Assert.assertTrue(S_Obj.S_GetProducts()>0);
    }

    @Test
    public void TC_SR_05(){
        Auth_Obj = new AuthenticationPage(driver);
        S_Obj    = new SearchPage(driver);

        Auth_Obj.Auth_PerformFullLogin();
        S_Obj.S_TypeSearch_Enter(" ");
        Assert.assertTrue(S_Obj.S_GetProducts()>0);
    }

}
