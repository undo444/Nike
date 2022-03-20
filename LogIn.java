package NikeTest;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class LogIn extends BaseTest {

    @Test

    public void LogInTest (){

        WebElement SignInButton = Driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
        SignInButton.click();

        WebElement Email = Driver.findElement(By.xpath("//input[@placeholder='Email address']"));
        Email.sendKeys("undo444@yahoo.com");

        WebElement Password = Driver.findElement(By.xpath("//input[@placeholder='Password']"));
        Password.sendKeys("test123");

        WebElement CheckBox = Driver.findElement(By.xpath("//label[@class='checkbox']"));
        CheckBox.click();

//        WebElement SignInCLick = Driver.findElement(By.xpath("//input[@value='SIGN IN']"));
//        SignInCLick.click();
    }
}
