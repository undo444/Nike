package Base;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public WebDriver Driver;

    @Before

    public void OpenSite() {

        System.setProperty("webdriver.chrome.driver", "C:\\AUTOMATION\\ChromeDriver\\chromedriver.exe");

        Driver = new ChromeDriver();
        Driver.get("https://www.nike.com/");
        Driver.manage().window().maximize();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@data-var='acceptBtn1']")));
        WebElement CookieAccept = Driver.findElement(By.xpath("//button[@data-var='acceptBtn1']"));
        CookieAccept.click();

        String actualResult = "Nike. Just Do It. Nike RO";
        String expectedResult = Driver.getTitle();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @After
    public void CloseSite() {
        Driver.quit();
    }
}
