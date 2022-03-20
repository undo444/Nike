package NikeTest;

import Base.BaseTest;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.util.List;
import java.util.Random;

public class RunningShoesBuy extends BaseTest {

    @Test

    public void BuyShoes() {

        WebElement MenButton = Driver.findElement(By.xpath("//a[@data-path='men']"));
        MenButton.click();

        List<WebElement> ShoesClick = Driver.findElements(By.xpath("//a[contains(text(),'Shoes')]"));
        ShoesClick.get(22).click();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='categories css-l49xoc is--desktop']/a")));
        List<WebElement> ShoesClick2 = Driver.findElements(By.xpath("//div[@class='categories css-l49xoc is--desktop']/a"));
        ShoesClick2.get(2).click();

        new WebDriverWait(Driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='product-card css-1v1uza4 css-z5nr6i css-11ziap1 css-14d76vy css-dpr2cn product-grid__card ']")));
        List<WebElement> RandomShoesClick = Driver.findElements(By.xpath("//div[@class='product-card css-1v1uza4 css-z5nr6i css-11ziap1 css-14d76vy css-dpr2cn product-grid__card ']"));
        Random random = new Random();
        int randomIndex = random.nextInt(RandomShoesClick.size());
        RandomShoesClick.get(randomIndex).click();

        List<WebElement> ShoesSize = Driver.findElements(By.xpath("//div[@class='mt2-sm css-12whm6j']/div"));
        Random random1 = new Random();
        int randomIndex1 = random1.nextInt(ShoesSize.size());
        ShoesSize.get(randomIndex1).click();

        WebElement AddToBag = Driver.findElement(By.xpath("//button[@aria-label='Add to Bag']"));
        AddToBag.click();

        WebElement BagClick = Driver.findElement(By.id("nav-cart"));
        BagClick.click();



        }
    }
