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
    public void testForYou() throws InterruptedException {
        homePage.forYou.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[1]/a"));
        Assert.assertTrue(true);
    }
    @Test
    public void testNews() {
        homePage.news.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[2]/a"));
        Assert.assertTrue(true);
    }
    @Test
    public void testSports(){
        homePage.sports.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[3]/a"));
        Assert.assertTrue(true);
    }
    @Test
    public void testFun(){
        homePage.fun.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[4]/a"));
        Assert.assertTrue(true);
    }
    @Test
    public void testEntertainment(){
        homePage.entertainment.click();
        ExpectedCondition<WebElement> expected = ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@id='doc']/div/div[3]/ul/li[5]/a"));
        Assert.assertTrue(true);
    }
}
