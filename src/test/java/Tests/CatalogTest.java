package Tests;

import Pages.AuthenticationPage;
import Pages.CatalogPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CatalogTest extends BaseTest{

    CatalogPage Catalog_Obj;
    BaseTest Basic_Obj ;
    AuthenticationPage AuthObj ;

    @Test
    public void TC_CA_01(){
        Catalog_Obj = new CatalogPage(driver);
        Catalog_Obj.ClickFishLink();
        Catalog_Obj.ClickDogsLink();
        Catalog_Obj.ClickCatsLink();
    }

    @Test
    public void TC_CA_02() {
        Catalog_Obj = new CatalogPage(driver);
        Basic_Obj = new BaseTest();

        Basic_Obj.RefreshRedirectToBasicWebPage();
    }
}
