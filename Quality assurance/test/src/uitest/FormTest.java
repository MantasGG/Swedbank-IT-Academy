package uitest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormTest extends AbstractTest {

    @Test
    public void testContactUsForm() {
        WebElement subjectHeading = driver.findElement(By.cssSelector("#id_contact"));
        Select dropSubject = new Select(subjectHeading);

        dropSubject.selectByVisibleText("Customer service");

        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailField.sendKeys("test@gmail.com");

        WebElement orderReferenceField = driver.findElement(By.xpath("//*[@id=\"id_order\"]"));
        orderReferenceField.sendKeys("11111");

        WebElement messageField = driver.findElement(By.cssSelector("#message"));
        messageField.sendKeys("test");

        driver.findElement(By.cssSelector("#submitMessage > span")).click();
    }
}
