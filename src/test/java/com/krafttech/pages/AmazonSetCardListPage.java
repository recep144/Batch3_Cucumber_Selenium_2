package com.krafttech.pages;

import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSetCardListPage extends AmazonBasePage {


    public void listeOlusturButton() {
        Driver.get().findElement(By.xpath("//input[@class='a-button-input']")).click();
    }

    public void alısverisListesiInputBox(String newList) {
        WebElement listcheckBox = Driver.get().findElement(By.xpath("//input[@value='Alışveriş Listesi']"));
        listcheckBox.clear();
        listcheckBox.sendKeys(newList);
        BrowserUtils.waitForVisibility(listcheckBox,10);

        WebElement listOlusturButton = Driver.get().findElement(By.xpath("(//input[@type='submit'])[4]"));
        BrowserUtils.waitForClickablility(listOlusturButton,10);
        BrowserUtils.clickWithJS(listOlusturButton);

    }

    @FindBy(css = "#wl-list-entry-title-D0DHUJBCF926")
    public WebElement sayfaTexti;

    public void urunKaldır(){
        Driver.get().findElement(By.xpath("//input[@name='submit.deleteItem']")).click();
    }

    public void sayfaSil(){
         WebElement dahaFazlasıText = Driver.get().findElement(By.xpath("//div[text()='Daha fazlası']"));
         BrowserUtils.hover(dahaFazlasıText);
         WebElement listeyiYonetText = Driver.get().findElement(By.xpath("//a[text()='Listeyi yönet']"));
         BrowserUtils.clickWithJS(listeyiYonetText);
        WebElement listeyiSilButton = Driver.get().findElement(By.xpath("//span[text()='Listeyi sil']"));
        BrowserUtils.clickWithJS(listeyiSilButton);
         WebElement evetButton = Driver.get().findElement(By.xpath("//span[text()='Evet']"));
         BrowserUtils.clickWithJS(evetButton);

    }



}
