package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class HybridPage {
	AndroidDriver driver;
	
	public HybridPage(AndroidDriver driver) {
		this.driver=driver;
		
	}
  public void switchtoweb() throws InterruptedException {

      Set<String> contexts = driver.getContextHandles();
      for (String contextname : contexts) {
          System.out.println(contextname);
      }

      driver.context("WEBVIEW_com.androidsample.generalstore");
      Thread.sleep(1000);
      driver.findElement(By.name("q")).sendKeys("google");
      Thread.sleep(2000);
      driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
      Thread.sleep(2000);
      driver.pressKey(new KeyEvent(AndroidKey.BACK));
      Thread.sleep(2000);
  }
  public void switchtomobile(){

      driver.context("NATIVE_APP");
  }

}
