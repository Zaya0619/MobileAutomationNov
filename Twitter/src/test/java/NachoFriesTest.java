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
    public void testNachoFries() throws InterruptedException {
        nachoFries.nachoFries.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView/div[1]/div/header/ul/li[6]/a/span"));
        Assert.assertTrue(true);
    }
    @Test
    public void testTop() throws InterruptedException {
        nachoFries.top.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[7]/a"));
        Assert.assertTrue(true);
    }
    @Test
    public void testLatest() throws InterruptedException {
        nachoFries.latest.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[8]/a"));
        Assert.assertTrue(true);
    }
    @Test
    public void testPeople() throws InterruptedException {
        nachoFries.people.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[9]/a"));
        Assert.assertTrue(true);
    }
    @Test
    public void testPhotos() throws InterruptedException {
        nachoFries.photos.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[10]/a"));
        Assert.assertTrue(true);
    }
    @Test
    public void testVideos() throws InterruptedException {
        nachoFries.videos.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[11]/a"));
        Assert.assertTrue(true);
    }
    @Test
    public void testNews() throws InterruptedException {
        nachoFries.news.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[12]/a"));
        Assert.assertTrue(true);
    }
}







