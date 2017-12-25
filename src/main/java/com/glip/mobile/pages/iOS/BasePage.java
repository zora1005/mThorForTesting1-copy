package com.glip.mobile.pages.iOS;

import com.glip.mobile.drivermanager.IOSAppiumManager;
import com.glip.mobile.drivermanager.IOSDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.LocksIOSDevice;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;


/**
 * Created by zora.zheng on 07/08/2017.
 */
public class BasePage {

    //同过IOSAppiumManager类的对外的方法获取到iOSDriver
    protected IOSDriver driver = IOSAppiumManager.getInstance().getAppiumDriver(); //protected 自己跟子类，同一层包里面的类才能用



    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
