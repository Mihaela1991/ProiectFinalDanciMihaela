package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage{

    public RadioButtonPage(WebDriver driver){super(driver);}

    By Male = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[1]");
    public void clickOnMale(){ driver.findElement(Male).click();}

    By Female = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[2]/input");
    public void clickOnFemale(){ driver.findElement(Female).click();}

    By GetValue = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/button");
    public void clickOnGetValue(){ driver.findElement(GetValue).click();}
}
