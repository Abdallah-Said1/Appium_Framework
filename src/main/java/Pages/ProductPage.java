package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class ProductPage {

    AndroidDriver driver;

    private final By AddProductToCart= By.id("com.androidsample.generalstore:id/productAddCart");
    private final By ToCartPage= By.id("com.androidsample.generalstore:id/appbar_btn_cart");

    public By ProductAssert=By.xpath("//android.widget.TextView[@text='Products']");

    public ProductPage(AndroidDriver driver){
        this.driver=driver;
    }

    public void Shoping(String NameProuduct){
    	WebElement PAssert=driver.findElement(ProductAssert);
        Assert.assertEquals(PAssert.getText(),"Products");
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+NameProuduct+"\"));"));
        driver.findElement(AddProductToCart).click();
        driver.findElement(ToCartPage).click();


    }
}
