package uitest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectorTest extends AbstractTest {

    @Test
    public void testSignInText() {

        WebElement signInButton = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a"));
        Assert.assertTrue("Sign in".equals(signInButton.getText()));

        WebElement phoneNumber = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > span > strong"));
        Assert.assertTrue("0123-456-789".equals(phoneNumber.getText()));

        WebElement priceWithoutDiscount = driver.findElement(By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.right-block > div.content_price > span.old-price.product-price"));
        Assert.assertTrue("$20.50".equals(priceWithoutDiscount.getText().trim()));

        WebElement phoneNumberInFooter = driver.findElement(By.cssSelector("#block_contact_infos > div > ul > li:nth-child(2) > span"));
        Assert.assertTrue("(347) 466-7432".equals(phoneNumberInFooter.getText()));
    }
}
