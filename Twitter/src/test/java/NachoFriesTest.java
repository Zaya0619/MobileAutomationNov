import home.NachoFries;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class NachoFriesTest extends NachoFries {
    NachoFries nachoFries;

    @BeforeMethod
    public void initialize() {
        nachoFries = PageFactory.initElements(ad, NachoFries.class);
    }

    @Test
    public String testNachoFries() throws InterruptedException {
        nachoFries.nachoFries.click();
        String actual = testNachoFries();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView/div[1]/div/header/ul/li[6]/a/span"));
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String testTop() throws InterruptedException {
        nachoFries.top.click();
        String actual = testTop();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[7]/a"));
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String testLatest() throws InterruptedException {
        nachoFries.latest.click();
        String actual = testLatest();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[8]/a"));
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String testPeople() throws InterruptedException {
        nachoFries.people.click();
        String actual = testLatest();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[9]/a"));
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String testPhotos() throws InterruptedException {
        nachoFries.photos.click();
        String actual = testLatest();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[10]/a"));
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String testVideos() throws InterruptedException {
        nachoFries.videos.click();
        String actual = testLatest();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[11]/a"));
        Assert.assertEquals(actual, expected);
        return actual;
    }

    @Test
    public String testNews() throws InterruptedException {
        nachoFries.news.click();
        String actual = testLatest();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[12]/a"));
        Assert.assertEquals(actual, expected);
        return actual;
    }
}







