package Pages;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends BasePage{

    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }


    /************************************* Important Buttons *************************************************************/
    @FindBy(xpath =  "//*[@id=\"jpetstore-content\"]/div[1]/div/div[2]/a[3]")
    WebElement Signupbtn ;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/div/form/div/button")
    WebElement SaveAccountbtn;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[1]/div/div[2]/a[2]")
    WebElement Signin_btn;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div/div/div[1]/div/form/div[3]/button")
    WebElement Loginbtn;


    /************************************* Important Fields **************************************************************/
    @FindBy(name = "username")
    WebElement UserIDField ;

    @FindBy(name = "password")
    WebElement PassWordField ;

    @FindBy(name = "repeatedPassword")
    WebElement ConfPassWordField;

    @FindBy(name = "firstName")
    WebElement FirstNameField ;

    @FindBy(name = "lastName")
    WebElement LastNameField ;

    @FindBy(name = "email")
    WebElement EmailField ;

    @FindBy(name = "phone")
    WebElement PhoneField ;

    @FindBy(name = "address1")
    WebElement FirstAddressField ;

    @FindBy(name = "address2")
    WebElement SecondAddressField ;

    @FindBy(name = "city")
    WebElement CityField ;

    @FindBy(name = "state")
    WebElement StateField ;

    @FindBy(name = "zip")
    WebElement ZipField ;

    @FindBy(name = "country")
    WebElement CountryField ;


    /* SignIn Fields */

    @FindBy(id = "username")
    WebElement UsernameSignInField;

    @FindBy(id = "password")
    WebElement PasswrodSignInField;


    /* Validators */

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[2]/div[1]/i")
    WebElement MSGOBJ;



    public void OpenRegistrationPage(){
        Signupbtn.click();
    }

    public void RegisterNewUser(String Copy_UserID ,String Copy_Password ,String Copy_FirstName
            ,String Copy_LastName,String Copy_Email,String Copy_Phone
            ,String Copy_FirstAddr,String Copy_SecondAddr,String Copy_City,
                                String Copy_State,String Copy_Zip,String Copy_Country){

        UserIDField.sendKeys(Copy_UserID);

        PassWordField.sendKeys(Copy_Password);
        ConfPassWordField.sendKeys(Copy_Password);

        FirstNameField.sendKeys(Copy_FirstName);
        LastNameField.sendKeys(Copy_LastName);

        EmailField.sendKeys(Copy_Email);
        PhoneField.sendKeys(Copy_Phone);

        FirstAddressField.sendKeys(Copy_FirstAddr);
        SecondAddressField.sendKeys(Copy_SecondAddr);

        CityField.sendKeys(Copy_City);
        StateField.sendKeys(Copy_State);
        ZipField.sendKeys(Copy_Zip);
        CountryField.sendKeys(Copy_Country);
    }


    public void ClickRegisterBtn(){
        SaveAccountbtn.click();
    }

    public void R_UserRegisterWrong(){

    }


    public void R_ValidateSingin(String Copy_Username , String Copy_Password){

        Signin_btn.click();

        UsernameSignInField.clear();
        PasswrodSignInField.clear();

        UsernameSignInField.sendKeys(Copy_Username);
        PasswrodSignInField.sendKeys(Copy_Password);

        Loginbtn.click();

        //Assertion Success Login
        if(!MSGOBJ.isDisplayed()){
            throw new AssertionError("Wrong Singup ");
        }
    }
}
