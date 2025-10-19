package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{

    public SearchPage(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath = "//*[contains(text(),'No Product Found')]")
    WebElement ErrorText;


    @FindBy(xpath = "//table/tbody/tr")
    List<WebElement> ProductRows;

    @FindBy(id = "jpetstore-search-btn")
    WebElement SearchBtn;

    @FindBy(xpath = "//*[@id=\"jpetstore-content\"]/div[1]/div/form/div/input")
    WebElement Search_Field;



    public void S_TypeSearch_SearchBtn(String CopyProduct){
        Search_Field.sendKeys(CopyProduct);
        SearchBtn.click();
    }

    public void S_TypeSearch_Enter(String CopyProduct){
        Search_Field.sendKeys(CopyProduct);
        Search_Field.sendKeys(Keys.ENTER);
    }

    public int S_GetProducts(){
        return ProductRows.size();
    }

    public List S_GetProductsList(){
        return ProductRows;
    }
    public boolean S_isErrorTextDisplayed() {
        return ErrorText.isDisplayed();
    }



}
