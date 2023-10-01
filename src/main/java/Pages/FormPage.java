package Pages;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
public class FormPage{
    AndroidDriver driver;
    private final By MyName = By.id("com.androidsample.generalstore:id/nameField");
    private final By Gender = By.id("com.androidsample.generalstore:id/radioFemale");
    private final By ShopButton = By.id("com.androidsample.generalstore:id/btnLetsShop");
    private final By SelectCountry =By.id("android:id/text1");
    private final By SelectEgypt = By.xpath("//android.widget.TextView[@text='Egypt']");

    public FormPage(AndroidDriver driver){
        this.driver=driver;
    }

    public void SetName(String name){
        driver.findElement(MyName).sendKeys(name);
        driver.hideKeyboard();
    }
    public void SelectGender(){
        driver.findElement(Gender).click();
    }
    public void SelectCountry(String CuntryName){
        driver.findElement(SelectCountry).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+CuntryName+"\"));"));
        driver.findElement(SelectEgypt).click();

    }
    public void ToShopPage(){

        driver.findElement(ShopButton).click();
    }
}
