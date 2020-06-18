package com.bridgelabz.myntra.testcases;

import com.bridgelabz.myntra.base.Base;
import com.bridgelabz.myntra.pages.Notification;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NotificationTest extends Base {

    public Notification notification;

       @BeforeMethod
       public void setUp(){
        initiation();
        notification = new Notification();
        }

       @Test
        public void notification()throws InterruptedException{
           notification.notificationTest();
           Thread.sleep(1000);
        }

        @AfterMethod
        public void tearDown(){
           driver.quit();
        }

}
