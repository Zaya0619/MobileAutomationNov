import home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends HomePage {
    HomePage homePage;
    @BeforeMethod
    public void initialize() {
        homePage = PageFactory.initElements(ad, HomePage.class);
    }

    @Test
    public String testForYou() throws InterruptedException {
        homePage.forYou.click();
        String actual = testForYou();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[1]/a"));
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String testNews() {
        homePage.news.click();
        String actual = testNews();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[2]/a"));
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String testSports(){
        homePage.sports.click();
        String actual = testSports();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[3]/a"));
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String testFun(){
        homePage.fun.click();
        String actual = testFun();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[4]/a"));
        Assert.assertEquals(actual, expected);
        return actual;
    }
    @Test
    public String testEntertainment(){
        homePage.entertainment.click();
        String actual = testEntertainment();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[5]/a"));
        Assert.assertEquals(actual, expected);
        return actual;

    }
}
