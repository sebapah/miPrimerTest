import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Pablo on 24/10/2015.
 */
public class miPrimerTest {
    @Test
    public void verificarTitulo () {

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.google.com");
        Assert.assertTrue("El título debe contener la palabra google",driver.getTitle().contains("Google"));
        driver.close();
        driver.quit();

    }


}
