package testCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.RadioButtonPage;


public class RadioButtonTestCases extends BasePage {

    private RadioButtonPage radioButtonPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonPage = new RadioButtonPage(driver);
    }
    @Test
    public void clickOnMale() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnMale();
        Assert.assertEquals("Male is checked", "Male is checked");

    }

    @Test
    public void clickOnFemale() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnFemale();
        Assert.assertEquals("Female is checked", "Female is checked");

    }

    @Test
    public void clickOnGetValue() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnGetValue();
        Assert.assertEquals("GetValue is checked", "GetValue is checked");

    }


    @Test
    public void clickOnBookADemo() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnBookADemo();
        Assert.assertEquals("BookADemo is checked", "BookADemo is checked");
    }

    @Test
    public void clickOnCallUs() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnCallUs();
        Assert.assertEquals("CallUs is checked", "CallUs is checked");
    }

    @Test
    public void clickOnStartChatting() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnStartChatting();
        Assert.assertEquals("StartChatting is checked", "StartChatting is checked");
    }
}

