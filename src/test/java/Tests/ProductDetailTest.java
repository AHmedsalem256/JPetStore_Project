package Tests;

import Data.LoadProperties;
import Pages.AuthenticationPage;
import Pages.CatalogPage;
import Pages.ProductDetailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import java.util.Properties;

public class ProductDetailTest extends BaseTest{


    AuthenticationPage  Auth_Obj ;
    CatalogPage C_Obj ;
    ProductDetailPage P_Obj ;


    @Test(priority = 1)
    public void TC_PD_01(){
        Auth_Obj = new AuthenticationPage(driver);
        C_Obj = new CatalogPage(driver);
        Auth_Obj.Auth_PerformFullLogin();
        C_Obj.ClickDogsLink();
    }


    @Test(priority = 2)
    public void TC_PD_02(){
        P_Obj = new ProductDetailPage(driver);
        P_Obj.SelectSpecific_Product_Item();


        WebElement ProdIMG = driver.findElement(By.xpath("//*[@id=\"jpetstore-content\"]/div[2]/div[2]/div[1]/img"));
        Assert.assertTrue(ProdIMG.isDisplayed());
    }

    @Test(priority = 3)
    public void TC_PD_03(){

        //
        P_Obj = new ProductDetailPage(driver);
        P_Obj.SelectSpecific_Product_Item();
        P_Obj.ClickAddCartBtn();
        Assert.assertTrue(P_Obj.Proceedbtn().isDisplayed());
    }

    @Test(enabled=false)
    public void TC_PD_04(){}

    @Test(enabled=false)
    public void TC_PD_05(){}


}
