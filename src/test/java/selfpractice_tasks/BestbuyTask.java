package selfpractice_tasks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BestbuyTask {
WebDriver driver;
    @BeforeMethod
    public void setup(){

    }

    @Test
    public void  test(){

    }

    @AfterMethod
    public void teardown(){
        driver.close();
    }
}
