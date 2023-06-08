package testCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxPage;
import pages.SimpleFormPage;


public class CheckboxPageTestCases extends BasePage {

    private CheckboxPage checkboxPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkboxPage = new CheckboxPage(driver);
    }

    @Test
    public void clickOnTheSingleCheckboxCheckMark() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnSingleCheckbox();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");

    }

    @Test
    public void clickOnTheFirstCheckboxoption() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheFirstCheckboxoption();
        Assert.assertEquals("Option 1 is checked", "Option 1 is checked");

    }


    @Test
    public void clickOnTheSecondCheckboxoption() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheSecondCheckboxoption();
        Assert.assertEquals("Option 2 is checked", "Option 2 is checked");
    }

    @Test
    public void clickOnTheThirdCheckboxoption() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheThirdCheckboxoption();
        Assert.assertEquals("Option 3 is checked", "Option 3 is checked");

    }

    @Test
    public void clickOnTheForthCheckboxoption() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnTheForthCheckboxoption();
        Assert.assertEquals("Option 4 is checked", "Option 4 is checked");

    }

    @Test
    public void clickOnCheckAllOption() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnCheckAllOption();
        Assert.assertEquals("All options are checked", "All options are checked");

    }
}