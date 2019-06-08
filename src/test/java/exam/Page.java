package exam;

import uitesting.upb.org.managepage.BasePage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import java.nio.file.Path;


public class Page extends BasePage {

    @FindBy(css = "https://api.nasa.gov/")
    private WebElement search;
    @FindBy(xpath = "//a[contains(text(),'Authentication')]")
    private WebElement aut;
    @FindBy(id = "tocify-header1")
    private WebElement th;
    @FindBy( xpath ="//a[contains(text(),'DEMO_KEY Rate Limits')]")
    private WebElement dk;

    public void setSearch() {
        Events.click(search);
    }

    public void autButton(){
        Events.click(aut);
    }
    public void  dkButton(){
        Events.click(dk);

    }
    public void thButton(){
        Events.click(th);
    }

    public void BT(){
        setSearch();
        thButton();
        thButton();
        autButton();
        dkButton();
    }
}
