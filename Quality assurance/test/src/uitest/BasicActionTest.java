package uitest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasicActionTest extends AbstractTest {

    @Test
    public void testPageTitle() {

        System.out.println(driver.getTitle());
        Assert.assertEquals("Contact us - My Store", driver.getTitle());
    }
}