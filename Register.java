package NikeTest;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import sun.awt.SunHints;

import java.awt.*;
import java.security.Key;
import java.security.KeyStore;

public class Register extends BaseTest {

    @Test

    public void RegisterTest() {

        WebElement SignInButton = Driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
        SignInButton.click();

        WebElement JoinUsClick = Driver.findElement(By.xpath("//a[contains(text(),'Join Us.')]"));
        JoinUsClick.click();

        WebElement Email = Driver.findElement(By.xpath("//input[@placeholder='Email address']"));
        Email.sendKeys("undo444@yahoo.com");

        WebElement Password = Driver.findElement(By.xpath("//input[@placeholder='Password']"));
        Password.sendKeys("Test1234#");

        WebElement FirstName = Driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        FirstName.sendKeys("Manolache");

        WebElement LastName = Driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        LastName.sendKeys("Alexandru");

        WebElement BirthDate = Driver.findElement(By.xpath("//input[@placeholder='Date of Birth']"));
        BirthDate.sendKeys("13");
        BirthDate.sendKeys("03");
        BirthDate.sendKeys("1994");
        BirthDate.sendKeys(Keys.TAB);
        BirthDate.sendKeys("1994");









    }
}