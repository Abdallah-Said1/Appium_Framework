package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class CartPage{
AndroidDriver driver;
   private final By TermButton= By.id("com.androidsample.generalstore:id/termsButton");
    private final By CloseButton =By.id("android:id/button1");
    private final By CheckBox =By.className("android.widget.CheckBox");
    private final By ToBrowserButton =By.id("com.androidsample.generalstore:id/btnProceed");
    private final By CartAssert=By.xpath("//android.widget.TextView[@text='Cart']");


    public CartPage(AndroidDriver driver){
        this.driver=driver;
    }

    public void TermButton(){
        WebElement CAssert= driver.findElement(CartAssert);
        Assert.assertEquals(CAssert.getText(),"Cart");
        WebElement termbutton=driver.findElement(TermButton);
        driver.executeScript("mobile: longClickGesture" ,
                ImmutableMap.of("elementId" ,((RemoteWebElement) termbutton).getId(), "duration" ,500)

        );

        driver.findElement(CloseButton).click();
    }
    public void GoToBrowser() throws InterruptedException {
        driver.findElement(CheckBox).click();
        driver.findElement(ToBrowserButton).click();
        Thread.sleep(9000);
    }

}
