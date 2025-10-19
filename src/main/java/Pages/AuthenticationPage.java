package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage extends BasePage {

    public AuthenticationPage(WebDriver driver){
        super(driver);
    }

    /* Default Credentials */
    public static String DefaultId = "j2ee" ;
    public static String DefaultPasscode = "j2ee";


    @FindBy(name = "username")
    WebElement UserIDField ;

    @FindBy(name = "password")
    WebElement PassWordField ;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/div/div[1]/div/form/div[3]/button")
    WebElement Loginbtn;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div[1]/i")
    WebElement SuccessElement;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/div/div[1]/div/form/div[4]")
    WebElement FailedElement;

    @FindBy(id = "dropdownMenuButton")
    WebElement DropDown_Selector;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[1]/div/div[2]/a[2]")
    WebElement Signinbtn;


    public WebElement GetDropBox(){
        return DropDown_Selector;
    }

    private void ValidateLoginSuccess(){
        if(!SuccessElement.isDisplayed()){
            throw new AssertionError("Error in Login");
        }
    }

    private void ValidateLoginFailed(){
        if(!FailedElement.isDisplayed()){
            throw new AssertionError("Invalid Credentials");
        }
    }

    public void SuccessLogin(String CopyUsername , String CopyPasscode){

        Signinbtn.click();

        UserIDField.clear();
        PassWordField.clear();

        UserIDField.sendKeys(CopyUsername);
        PassWordField.sendKeys(CopyPasscode);
        Loginbtn.click();

        ValidateLoginSuccess();
    }

    public void FailedLogin(){
        UserIDField.clear();
        PassWordField.clear();

        UserIDField.sendKeys(DefaultId);
        PassWordField.sendKeys("7080KKOK");

        Loginbtn.click();

        ValidateLoginFailed();
    }

    public void Perform_LogOut(){
        //Assume Logged in
    }


    //Encapsulating THe Default Username and Password
    public static  String []  Auth_GetArr_UserID_UserPass(){
        String [] arr = {DefaultId,DefaultPasscode};
        return arr;
    }


    public void Auth_PerformFullLogin(){
        String [] Credtintials = Auth_GetArr_UserID_UserPass();
        SuccessLogin(Credtintials[0] , Credtintials[1]);
    }




}
