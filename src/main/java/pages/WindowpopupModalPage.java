package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowpopupModalPage extends BasePage{

    public WindowpopupModalPage(WebDriver driver){super(driver);}

    By FolowOnTwiter = By.xpath("/html/body/div[1]/section[3]/div/div/div[1]/div/div[1]/a");

    public void clickOnFolowOnTwiter(){ driver.findElement(FolowOnTwiter).click();}

    By LikeUsOnFacebook = By.xpath("/html/body/div[1]/section[3]/div/div/div[1]/div/div[2]/a");

    public void clickOnLikeUsOnFacebook(){ driver.findElement(LikeUsOnFacebook).click();}

    By OpenLinkedinPopup = By.xpath("/html/body/div[1]/section[3]/div/div/div[1]/div/div[3]/a");

    public void clickOnOpenLinkedinPopup(){ driver.findElement(OpenLinkedinPopup).click();}
}
