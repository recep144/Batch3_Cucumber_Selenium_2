package com.krafttech.pages;

import com.krafttech.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBasePage {

    public AmazonBasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "(//span[.='Çerezleri Kabul Et'])[3]")
    public WebElement cerezKabul;

    public void cerezKabulButton(){
        cerezKabul.click();
    }
}
