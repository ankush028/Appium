package com.bridgelabz.myntra.pages;

import com.bridgelabz.myntra.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notification extends Base {

    @FindBy(xpath ="//android.widget.ImageView[@content-desc='notification']")
    WebElement notifyButton;



    public Notification(){
        PageFactory.initElements(driver,this);
    }

    public void notificationTest() throws InterruptedException {
        Thread.sleep(2000);
        notifyButton.click();
    }

}
