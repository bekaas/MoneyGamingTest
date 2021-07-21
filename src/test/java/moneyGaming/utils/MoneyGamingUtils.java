package moneyGaming.utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MoneyGamingUtils {

    public static Faker faker = new Faker();

    public static void selectTitle(){
        WebElement title = Driver.getDriver().findElement(By.xpath("//select[@id='title']"));
        int index = faker.number().numberBetween(1,4);
        Select titleDD = new Select(title);
        titleDD.selectByIndex(index);
    }

    public static void enterNames(){
        WebElement firstNameField = Driver.getDriver().findElement(By.xpath("//input[@id='forename']"));
        WebElement surNameField = Driver.getDriver().findElement(By.xpath("//input[@name='map(lastName)']"));

        firstNameField.sendKeys(faker.name().firstName());
        surNameField.sendKeys(faker.name().lastName());
    }

    public static void checkTheCheckbox(){
        Driver.getDriver().findElement(By.xpath("(//input[@id='checkbox'])[3]")).click();
    }

    public static void clickJoinNow(){
        Driver.getDriver().findElement(By.xpath("//input[@value='Join Now!']")).click();
    }

    public static void assertMessage(){
        WebElement msg = Driver.getDriver().findElement(By.xpath("(//label[.='This field is required'])[1]"));

        Assert.assertTrue(msg.isDisplayed());
    }

}
