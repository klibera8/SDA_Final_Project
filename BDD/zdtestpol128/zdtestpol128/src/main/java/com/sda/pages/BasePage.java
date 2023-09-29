package com.sda.pages;




import com.sda.WebDriverFactory;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import java.rmi.Remote;

public abstract class BasePage {

    public final RemoteWebDriver driver;

    public BasePage() {
        this.driver = WebDriverFactory.DRIVER;
        PageFactory.initElements(driver, this);
    }

}
