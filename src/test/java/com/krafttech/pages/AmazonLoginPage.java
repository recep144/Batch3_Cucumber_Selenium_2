package com.krafttech.pages;


import com.krafttech.utilities.BrowserUtils;
import com.krafttech.utilities.ConfigurationReader;
import com.krafttech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AmazonLoginPage extends AmazonBasePage {

    AmazonMainPage amazonMainPage = new AmazonMainPage();
    @FindBy(xpath = "//span[.='Merhaba, Giriş yapın']")
    public WebElement loginAccountAndLists;

    @FindBy(xpath = "(//span[.='Giriş yap'])[1]")
    public WebElement enterButton;

    public void loginbutton(){
        BrowserUtils.hover(loginAccountAndLists);
        enterButton.click();
    }

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailInputBox;

    public void emailButton(){
        emailInputBox.sendKeys(ConfigurationReader.get("myUserEmail"));
        Driver.get().findElement(By.xpath("//input[@id='continue']")).click();
    }

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    public void passwordButton(){
        password.sendKeys(ConfigurationReader.get("myPassword"));
        Driver.get().findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElement sifreButton;

    @FindBy(xpath = "//span[.='Liste Oluşturun']")
    public WebElement listeOlusturText;

    public void listeOlusturLink(){
        WebElement listeOlustur = Driver.get().findElement(By.xpath("//span[.='Liste Oluşturun']"));
        BrowserUtils.hover(amazonMainPage.myUsernameText);
        listeOlustur.click();
    }
    public void listeKontrolText(){
        BrowserUtils.hover(amazonMainPage.myUsernameText);
         WebElement container = Driver.get().findElement(By.xpath("//div[@id='nav-al-container']"));
        Assert.assertFalse(listeOlusturText.isDisplayed());
    }

    public void uyeCikisIslemi(){
        BrowserUtils.hover(amazonMainPage.myUsernameText);
        WebElement cikisButton = Driver.get().findElement(By.xpath("//span[.='Çıkış Yap']"));
        BrowserUtils.clickWithJS(cikisButton);
    }

    public void girisYapControl(){
         WebElement girisYapText = Driver.get().findElement(By.xpath("//h1[@class='a-spacing-small']"));
         Assert.assertEquals(girisYapText.getText(),"Giriş yap");
    }

}
