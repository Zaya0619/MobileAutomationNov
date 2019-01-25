package home;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class NachoFries extends MobileAPI {
    public NachoFries() {
        PageFactory.initElements(ad, this);
    }
    @FindBy(xpath = "//android.widget.TextView/div[1]/div/header/ul/li[6]/a/span")
    public static WebElement nachoFries;
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[7]/a")
    public static WebElement top;
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[8]/a")
    public static WebElement latest;
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[9]/a")
    public static WebElement people;
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[10]/a")
    public static WebElement photos;
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[11]/a")
    public static WebElement videos;
    @FindBy(xpath = "//android.widget.TextView[@id='doc']/div/div[3]/ul/li[12]/a")
    public static WebElement news;

    //Click on NachoFries
    public void setNachoFries() {
        ad.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        nachoFries.click();
    }

    public void setTop(WebElement top) {
        clickByXpathWebElement(top);
        top.click();
        System.out.println("TopClicked");
    }

    public void setLatest(WebElement latest) {
        clickByXpathWebElement(latest);
        latest.click();
        System.out.println("LatestClicked");
    }

    public void setPeople(WebElement people) {
        clickByXpathWebElement(people);
        people.click();
        System.out.println("PeopleClicked");
    }

    public void setPhotos(WebElement photos) {
        clickByXpathWebElement(photos);
        photos.click();
        System.out.println("PhotosClicked");
    }

    public void setVideos(WebElement videos) {
        clickByXpathWebElement(videos);
        videos.click();
        System.out.println("VideosClicked");
    }

    public void setNews(WebElement news) {
        clickByXpathWebElement(news);
        news.click();
        System.out.println("NewsClicked");
    }
}

