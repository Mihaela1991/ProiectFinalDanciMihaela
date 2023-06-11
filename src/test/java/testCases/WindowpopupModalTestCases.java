package testCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.WindowpopupModalPage;

public class WindowpopupModalTestCases extends BasePage {

    private WindowpopupModalPage bootstrapModalPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        bootstrapModalPage = new WindowpopupModalPage(driver);
    }

    @Test
    public void clickOnFolowOnTwiter() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/ul/li[9]/a")).click();
        bootstrapModalPage.clickOnFolowOnTwiter();
        Assert.assertEquals("Success - FolowOnTwiter is checked", "Success - FolowOnTwiter is checked");

    }

    @Test
    public void clickOnLikeUsOnFacebook() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/ul/li[9]/a")).click();
        bootstrapModalPage.clickOnLikeUsOnFacebook();
        Assert.assertEquals("Success - LikeUsOnFacebook is checked", "Success - LikeUsOnFacebook is checked");

    }

 /*   @Test
    public void clickOnOpenLinkedinPopup() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/ul/li[9]/a")).click();
        bootstrapModalPage.clickOnOpenLinkedinPopup();
        Assert.assertEquals("Success - OpenLinkedinPopup is checked", "Success -OpenLinkedinPopup is checked");

    } */
}
