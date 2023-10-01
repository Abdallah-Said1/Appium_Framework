package testes;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class TestBases {
	
	 public  AndroidDriver driver;
     public AppiumDriverLocalService server;
	@BeforeClass
	public void Open() throws MalformedURLException {
		
	        server = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//HaDid//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
	         .withIPAddress("127.0.0.1")
	         .usingPort(4723).build();
	         server.start();


	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setDeviceName("myemulator");
			options.setChromedriverExecutable("C://Users//HaDid//Downloads//chromedriver_win32//chromedriver.exe");
		    options.setApp("E:\\automation testing\\Appium\\Appium_Project\\src\\test\\java\\resources\\General-Store.apk");

	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	

	@AfterClass
	public void close(){
	
		driver.quit();
		server.stop();
	}
	}

