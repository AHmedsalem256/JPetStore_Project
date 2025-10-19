package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    /*Locators and Methods*/


    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[1]/div/a/img")
    WebElement LogoPic;

    @FindBy(id = "Sidebar")
    WebElement SideBar;

    @FindBy(id = "SidebarContent")
    WebElement SidebarContent;


    @FindBy(id = "MainImage")
    WebElement MainImage;

    @FindBy(id = "RightSidebar")
    WebElement RightSidebar;


    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/a")
    WebElement RTM_btn;


    /*FishLink Content*/
    @FindBy(linkText = "Fish")
    WebElement FishLink ;
    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/h3")
    WebElement FishHeader;

    /*DogsLink Content*/
    @FindBy(partialLinkText = "Dogs")
    WebElement DogsLink ;
    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/h3")
    WebElement DogsHeader;


    /*BirdsLink Content*/
    @FindBy(linkText = "Birds")
    WebElement BirdsLink ;
    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/h3")
    WebElement BirdsHeader;


    private void GenericValidateResponse(){
        if(!MainImage.isDisplayed() && !SideBar.isDisplayed() && !SidebarContent.isDisplayed() && !RightSidebar.isDisplayed()){
            throw new AssertionError("Error Goto Main WebPage");
        }
    }


    public void H_VerifySuccessLoad(){
        GenericValidateResponse();
    }


    public void H_ClickRTM(){
        RTM_btn.click();
        GenericValidateResponse();
    }

    public void H_ValidateFishLink(){
        FishLink.click();
        if(!RTM_btn.isDisplayed() && FishHeader.isDisplayed()){
            throw new AssertionError("Error in Loading Fish link content");
        }
    }


    public void H_ValidateDogLink(){
        DogsLink.click();
        if(!RTM_btn.isDisplayed() && DogsHeader.isDisplayed()){
            throw new AssertionError("Error in Loading Fish link content");
        }
    }


    public void H_ValidateBirdLink(){
        BirdsLink.click();
        if(!RTM_btn.isDisplayed() && FishHeader.isDisplayed()){
            throw new AssertionError("Error in Loading Fish link content");
        }
    }

    public void H_ClickingOnImage(){
        LogoPic.click();

        GenericValidateResponse();
    }



}
