package NikeTest;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.List;

public class SearchProduct extends BaseTest {

    @Test

    public void Search(){

        WebElement SearchBar = Driver.findElement(By.id("VisualSearchInput"));
        SearchBar.sendKeys("Air Force 1");
        SearchBar.sendKeys(Keys.ENTER);

        List<WebElement> MenBox = Driver.findElements(By.xpath("//div[@class='pseudo-checkbox css-1n9lta1 ']"));
        MenBox.get(0).click();


    }
}
