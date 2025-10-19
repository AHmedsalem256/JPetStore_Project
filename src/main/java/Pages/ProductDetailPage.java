package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Properties;

public class ProductDetailPage extends BasePage{

    public ProductDetailPage(WebDriver driver){
        super(driver);
    }

    /*Important btn's*/
    @FindBy(partialLinkText = "Add to Cart")
    WebElement AddCartBtn;
    @FindBy(partialLinkText = "Proceed to Checkout")
    WebElement ProceedCheckOutBtn;

    /*Dogs Products*/
    @FindBy(partialLinkText = "K9-BD-01")
    WebElement Prod_BulDog;
    /*Item ID's*/
    @FindBy(partialLinkText = "EST-6")
    WebElement Item_BulDog_Male_K9BD01;
    @FindBy(partialLinkText = "EST-7")
    WebElement Item_BulDog_Female_K9BD01;


    @FindBy(partialLinkText = "K9-PO-02")
    WebElement Prod_Poodle;
    /*Items ID's*/
    @FindBy(partialLinkText = "EST-8")
    WebElement Item_Male_Poodle;


    @FindBy(partialLinkText = "K9-DL-01")
    WebElement Prod_Dalmation;

    @FindBy(partialLinkText = "K9-RT-01")
    WebElement 	Prod_Golden_Retriever;

    @FindBy(partialLinkText = "K9-RT-02")
    WebElement Prod_Labrador_Retriever;

    @FindBy(partialLinkText = "K9-CW-01")
    WebElement 	Prod_Chihuahua;


    public void SelectSpecific_Product_Item(){
        Prod_BulDog.click();
        Item_BulDog_Male_K9BD01.click();
    }

    public void ClickAddCartBtn(){
        AddCartBtn.click();
    }

    public WebElement Proceedbtn(){
        return ProceedCheckOutBtn;
    }

}
