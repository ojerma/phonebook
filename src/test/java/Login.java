import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class Login extends TestBase {

    By loginForm = By.id("login-form");
    By emailField = By.cssSelector("[placeholder=\"Email\"]");
    By passwordField = By.cssSelector("[placeholder=\"Password\"]");
    By loginButton = By.xpath("//*[@type=\"submit\"]");

    By contactsTable = By.id("contacts-list");

    @BeforeMethod
    public void login() {
        String email = "test@gmail.com";
        String password = "test@gmail.com";
        Assert.assertTrue(isElementPresent(loginForm));
        fillField(email, emailField);
        fillField(password, passwordField);
        driver.findElement(loginButton).click();

        Assert.assertTrue(isElementPresent(contactsTable));
    }
}
