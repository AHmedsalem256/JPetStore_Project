package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends BasePage {

    public CatalogPage(WebDriver driver){
        super(driver);
    }


    /*Fish Link*/
    @FindBy(partialLinkText = "Fish")
    WebElement Fish_Link;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/h3")
    WebElement FishAsser;


    /*Dogs Link*/
    @FindBy(partialLinkText = "Dogs")
    WebElement Dogs_Link;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/h3")
    WebElement DogsAsser;


    /*Cats Link*/
    @FindBy(partialLinkText = "Cats")
    WebElement Cats_Link;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/h3")
    WebElement CatsAsser;



    public void ClickFishLink(){
        Fish_Link.click();
        if(!FishAsser.isDisplayed()){
            throw new AssertionError("Error is Fish Visibility");
        }
    }


    public void ClickDogsLink(){
        Dogs_Link.click();
        if(!DogsAsser.isDisplayed()){
            throw new AssertionError("Error is Dogs Visibility");
        }
    }


    public void ClickCatsLink(){
        Cats_Link.click();
        if(!CatsAsser.isDisplayed()){
            throw new AssertionError("Error is Cats Visibility");
        }
    }


    public void ClickSubcategories(){

    }


}
