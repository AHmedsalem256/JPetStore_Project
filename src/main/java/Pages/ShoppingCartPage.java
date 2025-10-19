package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    public ShoppingCartPage(WebDriver driver){
        super(driver);
    }


    @FindBy(partialLinkText = "Add to Cart")
    WebElement AddCartBtn;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/form/table/tbody/tr/td[5]/input")
    WebElement QuantityField;

    @FindBy(className = "btn btn-primary btn-sm")
    WebElement UpdateCartBtn;

    @FindBy(xpath = "//td[contains(text(), '$')]")
    WebElement PriceGetter;


    public void GetPrice(){
        String Price = PriceGetter.getText();
        Price = Price.replace("$"," ");
        double price = Double.parseDouble(Price);
        System.out.println(price);
    }


    public void AddQuantity_UpdateCart(){
        AddCartBtn.click();
        QuantityField.clear();
        QuantityField.sendKeys("15");
        UpdateCartBtn.click();
    }





}
