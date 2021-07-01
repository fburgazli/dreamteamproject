package selfpractice_tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class BestbuyTask {
//    BESTBUY IQ
    //1. Open www. bestbuy.ca
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bestbuy.ca/");
    }
    //2. Type ipad in the search box
    @Test
    public void test() throws InterruptedException {
        driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("ipad");
        Thread.sleep(2000);
//3. When the suggestions are displayed, click ipad pro 12.9
        driver.findElement(By.xpath("//a[@href='en-ca/search?search=ipad pro 12.9']")).click();
//4. On results page, filter all results by the Online Only filter
        driver.findElement(By.id("facetFilter-Online Only")).click();
//5. Select the first result on the page
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[@class='link_3hcyN'])[1]")).click();
//6. Add the product to cart
        driver.findElement(By.xpath("//button[contains(@class, 'addToCartButton')]")).click();
//7. Go to the cart and Checkout as a guest
        WebElement confirmation = driver.findElement(By.xpath("//div[@class='confirmation']//h1"));
        String expectedText= "This item has been added to your cart.";
        String actualText = confirmation.getText();

        Assert.assertEquals(actualText,expectedText);
//8. Fill in the address details(FAKER)
//9. Select mastercard as payment type
//10. Fill in the details of an expired master card
//11. Submit the transaction
//12. Collect the error message in a log


    }


//    This is the test case to be automated.
//    What you need to do is below:
//            1. create a full project that automates this test case using its own automation framework
//2. you can use for the project Java or C#, JUNIT or TESTNG, Maven and Selenium WebDriver
//    This is the interview test at BestBuy Canada.
//    Good luck!

    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
