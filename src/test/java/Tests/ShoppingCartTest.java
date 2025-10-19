package Tests;

import Pages.*;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {


    ProductDetailPage Prod_obj ;
    AuthenticationPage Auth_Obj ;
    CatalogPage C_Obj;
    ShoppingCartPage S_Obj;

    @Test
    public void TC_SC_01(){

        Auth_Obj = new AuthenticationPage(driver);
        Prod_obj = new ProductDetailPage(driver);
        C_Obj = new CatalogPage(driver);
        S_Obj = new ShoppingCartPage(driver);


        Auth_Obj.Auth_PerformFullLogin();
        C_Obj.ClickDogsLink();
        Prod_obj.SelectSpecific_Product_Item();
        S_Obj.AddQuantity_UpdateCart();

    }

    @Test(enabled = false)
    public void TC_SC_02(){

    }

    @Test(enabled = false)
    public void TC_SC_03(){

    }

    @Test(enabled = false)
    public void TC_SC_04(){

    }

    @Test(enabled = false)
    public void TC_SC_05(){

    }

}
