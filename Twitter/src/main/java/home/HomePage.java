package home;
import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class HomePage extends MobileAPI {
    public HomePage (){
        PageFactory.initElements(ad, this);
    }
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[1]/a")
    public static WebElement forYou;
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[2]/a")
    public static WebElement news;
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[3]/a")
    public static WebElement sports;
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[4]/a")
    public static WebElement fun;
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[5]/a")
    public static WebElement entertainment;

    public void setForYou (WebElement forYou) {
        clickByXpathWebElement(forYou);
        forYou.click();
        System.out.println("ForYouClicked");

    }
    public void setNews (WebElement news) {
        clickByXpathWebElement(news);
        news.click();
        System.out.println("NewsClicked");
    }
    public void setSports (WebElement sports) {
        clickByXpathWebElement(sports);
        sports.click();
        System.out.println("SportsClicked");
    }
    public void setFun (WebElement fun) {
        clickByXpathWebElement(fun);
        fun.click();
        System.out.println("FunClicked");
    }
    public void setEntertainment (WebElement entertainment) {
        clickByXpathWebElement(entertainment);
        entertainment.click();
        System.out.println("EntertainmentClicked");
    }

}



