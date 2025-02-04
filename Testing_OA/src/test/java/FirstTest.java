import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.Set;

public class FirstTest {
    public WebDriver driver;
    public String testURL = "http://www.google.com";

    @BeforeClass
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(testURL);
    }

    @Test(priority = 1)
    public void googleSearchTest() throws InterruptedException {
        Thread.sleep(1000);
        WebElement rejectAllButton = driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div"));
        rejectAllButton.click();
        Thread.sleep(1000);
        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("hcl hr");
        searchTextBox.submit();
        Thread.sleep(10000);
        WebElement testLink =
                driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/div[2]/cite"));
        Assert.assertEquals(testLink.getText(), "https://www.hcl.hr");
        System.out.print(testLink.getText());
    }

    @Test(priority = 2)
    public void ClickHCLPageTest() throws InterruptedException {
        Thread.sleep(1000);
        WebElement testLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
        Thread.sleep(1000);
        testLink.click();
        testLink = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/div[2]/button[1]/p"));
        Thread.sleep(1000);
        testLink.click();
        Assert.assertTrue(driver.getTitle().contains("HCL Gaming Portal"), "Page title is incorrect!");
        System.out.println("HCL page successfully reached.");
    }


    @Test(priority = 3)
    public void GameBaseTest() throws InterruptedException {
        Thread.sleep(1000);
        WebElement testLink = driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[5]"));
        Thread.sleep(1000);
        testLink.click();
        Assert.assertTrue(driver.getTitle().contains("Igre i igrice za sve gaming platforme"), "Page title is incorrect!");
        System.out.println("Game Base page successfully reached.");
    }

    @Test(priority = 4)
    public void ShopTest() throws InterruptedException {
        Thread.sleep(1000);
        WebElement testLink = driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[6]"));
        Thread.sleep(1000);
        testLink.click();
        Assert.assertTrue(driver.getTitle().contains("HCL Shop"), "Page title is incorrect!");
        System.out.println("Shop page successfully reached.");
    }



    @Test(priority = 5)
    public void LoginTest() throws InterruptedException {
        Thread.sleep(1000);
        WebElement testLink = driver.findElement(By.xpath("//*[@id=\"menu-popular-menu\"]/li[1]/a"));
        Thread.sleep(1000);
        testLink.click();
        testLink = driver.findElement(By.xpath("//*[@id=\"authActions\"]/li[1]/a"));
        Thread.sleep(1000);
        testLink.click();
        Thread.sleep(1000);
        testLink = driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/div[2]/form/input[3]"));
        Thread.sleep(1000);
        testLink.click();
        testLink = driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/div[2]/div/div[1]/h3"));
        Assert.assertEquals(testLink.getText(), "UNESITE PODATKE");
        Thread.sleep(1000);
        System.out.println("Attempted login with no data.");
    }

    @AfterClass
    public void teardownTest() {
        driver.quit();
    }
}




