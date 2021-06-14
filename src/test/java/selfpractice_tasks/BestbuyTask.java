package selfpractice_tasks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BestbuyTask {
WebDriver driver;
    @BeforeMethod
    public void setup(){
        //write your code here
    }

    @Test
    public void  test(){
 // write your test here
    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
