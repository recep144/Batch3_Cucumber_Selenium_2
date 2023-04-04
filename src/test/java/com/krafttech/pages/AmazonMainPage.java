package com.krafttech.pages;


import com.krafttech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class AmazonMainPage extends AmazonBasePage {

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    public WebElement myUsernameText;

    @FindBy(xpath = "select#searchDropdownBox")
    public WebElement tumKategrilerList;

    public void tumKategorilerButton(String kategori) {
//        WebElement tümKategoriler = Driver.get().findElement(By.cssSelector("#searchDropdownBox"));
//        BrowserUtils.clickWithJS(tümKategoriler);
//
//        WebElement element = Driver.get().findElement(By.xpath("//option[.='"+kategori+"']"));
//        element.click();


        WebElement tumKategoriler = Driver.get().findElement(By.cssSelector("select#searchDropdownBox"));

        Select select = new Select(tumKategoriler);
        select.selectByVisibleText(kategori);
        WebElement firstSelectedOptionKatogoriList = select.getFirstSelectedOption();
        System.out.println(firstSelectedOptionKatogoriList.getText());

    }
    public void tumKategrilerListKontrol(String kategori){
        WebElement tumKategoriler = Driver.get().findElement(By.cssSelector("select#searchDropdownBox"));

        Select select = new Select(tumKategoriler);
        select.selectByVisibleText(kategori);
        WebElement firstSelectedOptionKatogoriList = select.getFirstSelectedOption();
        Assert.assertEquals(firstSelectedOptionKatogoriList.getText(),kategori);
    }
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement urunSec;
    public void searchBox(String urun){
        urunSec.sendKeys(urun);
        Driver.get().findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    }

    public void urunSayfasiKontrol(String urun){
         WebElement secilenUrun = Driver.get().findElement(By.cssSelector("#twotabsearchtextbox"));
        System.out.println(secilenUrun.getText());
    }

    public void sayfaKontrol(String sayfa){
        WebElement sayfaSayisi = Driver.get().findElement(By.xpath("(//span[.='"+sayfa+"'])[1]"));
        Assert.assertEquals(sayfaSayisi.getText(),sayfa);
    }

}
