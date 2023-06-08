package testCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxPage;
import pages.RadioButtonPage;
public class RadioButtonTestCases extends BasePage{

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
        Assert.assertEquals("Success - Male is checked", "Success - Male is checked");

    }

    @Test
    public void clickOnFemale() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnFemale();
        Assert.assertEquals("Success - Female is checked", "Success - Female is checked");

    }

    @Test
    public void clickOnGetValue() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnGetValue();
        Assert.assertEquals("Success - Get Value is checked", "Success - Get Value is checked");

    }
}
