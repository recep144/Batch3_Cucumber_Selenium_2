package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AmazonMsıPage extends AmazonBasePage{



    @FindBy(xpath = "//a[.='2']")
    public WebElement sayfaSecenegi;

    public void sayfaSec(int sayfaSayisi){
         WebElement sayfa = Driver.get().findElement(By.xpath("//a[.='"+sayfaSayisi+"']"));
        BrowserUtils.clickWithJS(sayfa);
    }


    public void ürünSec(String ürünSırası){
         WebElement ürünler = Driver.get().findElement(By.xpath("" +
                 "(//div[@class='s-main-slot s-result-list s-search-results sg-" +
                 "row']/div/following-sibling::div)["+ürünSırası+"]"));
         ürünler.click();
    }
    public void listeyeEkle(){
        Driver.get().findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
    }
    @FindBy(xpath = "//span[.='1 ürün şuraya eklendi:']")
    public WebElement listeyeEklendimi;

    public void listeEklemeKontrolü(){
        Driver.get().findElement(By.xpath("//a[.='Listenizi Görüntüleyin']")).click();
         WebElement setCartText = Driver.get().findElement(By.xpath("//span[.='SetCard Liste']"));
        Assert.assertEquals(setCartText.getText(),"SetCard Liste");

    }
}
