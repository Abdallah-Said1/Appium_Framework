package testes;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import Data.DataReader;
import Pages.CartPage;
import Pages.FormPage;
import Pages.HybridPage;
import Pages.ProductPage;

public class AllTestScenario extends TestBases {
    FormPage formobject;
    ProductPage productobject;
    CartPage cartobject;
    HybridPage hybridobject;
    DataReader reder;

    @Test(priority = 1)
    public void Login() throws IOException, ParseException  {
    	reder=new DataReader();
    	reder.Reader();
    	
        formobject =new FormPage(driver);
        formobject.SetName(reder.name);
        formobject.SelectGender();
        formobject.SelectCountry(reder.CuntryName);
        formobject.ToShopPage();
    }
    @Test(priority = 2)
    public void ToShop() throws IOException, ParseException{
    	reder=new DataReader();
    	reder.Reader();
    	
     productobject=new ProductPage(driver);
     productobject.Shoping(reder.NameProuduct);
    }

    @Test(priority = 3)
    public void ToBrowser() throws InterruptedException {
        cartobject =new CartPage(driver);
        cartobject.TermButton();
        cartobject.GoToBrowser();

    }
    @Test(priority = 4)
    public void InBrowser() throws InterruptedException {
        hybridobject= new HybridPage(driver);
        hybridobject.switchtoweb();

        hybridobject.switchtomobile();
    }

}
