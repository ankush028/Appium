package com.bridgelabz.myntra.testcases;

import com.bridgelabz.myntra.base.Base;
import com.bridgelabz.myntra.pages.AddItem;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemTest extends Base {

    AddItem addItem;

    @BeforeMethod
    public void setUp(){
        initiation();
        addItem = new AddItem();
    }
    @Test
    public void addItemTest() throws InterruptedException {
        addItem.addItem();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
