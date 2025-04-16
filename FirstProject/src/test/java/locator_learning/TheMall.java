package locator_learning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

public class TheMall {

    @Test
    public void myfirstTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.themallbd.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement logo = driver.findElement(By.className("brand-logo"));
        logo.click();
        Thread.sleep(2000);

        WebElement Search = driver.findElement(By.id("search-box"));
        Search.sendKeys("ordinary");
        Search.sendKeys(Keys.RETURN);
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('li.megamenu-parrent.mx-2.py-0.py-xl-3').style.display = 'none';");

        
        js.executeScript("window.scrollBy(0, 205);");

        WebElement productCart = driver.findElement(By.xpath("//a[normalize-space()='The Ordinary Glycolic Acid 7% Exfoliating Toner 100ml']"));
        productCart.click();
        Thread.sleep(2000);

        WebElement addToCart = driver.findElement(By.xpath("//button[@class='flex-grow-1 btn btn-dark rounded-0 d-flex justify-content-center align-items-center py-2 addToCart']"));
        addToCart.click();
        Thread.sleep(2000);

        WebElement menu = driver.findElement(By.xpath("(//a/span[contains(text(),'Makeup')])"));
        menu.click();
        Thread.sleep(2000);

        js.executeScript("document.querySelector('li.megamenu-parrent.mx-2.py-0.py-xl-3').style.display = 'none';");
        js.executeScript("window.scrollBy(0, 1000);");
        
        Thread.sleep(5000);

        WebElement checkbox = driver.findElement(By.xpath("//input[@class='form-check-input skintype common_selector cls_skintype_oily_skin']"));
        checkbox.click();
        Thread.sleep(2000);
        
        js.executeScript("document.querySelector('li.megamenu-parrent.mx-2.py-0.py-xl-3').style.display = 'none';");

        WebElement buyOneGet = driver.findElement(By.xpath("(//li/a[contains(text(),'Buy 1 Get 1')])"));
        buyOneGet.click();
        Thread.sleep(2000);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(5000);

        WebElement Fragrance = driver.findElement(By.xpath("(//a/span[contains(text(),'Fragrance')])"));
        Fragrance.click();
        Thread.sleep(5000);

        js.executeScript("document.querySelector('li.megamenu-parrent.mx-2.py-0.py-xl-3').style.display = 'none';");
        Thread.sleep(2000);
        
        js.executeScript("window.scrollBy(0, 554);");
        js.executeScript("document.querySelector('li.megamenu-parrent.mx-2.py-0.py-xl-3').style.display = 'none';");

        WebElement productCartFragrance = driver.findElement(By.xpath("//a[normalize-space()='Nivea Men Fresh Active Antibacterial Roll on 50ml']"));
        productCartFragrance.click();
        Thread.sleep(2000);

        js.executeScript("document.querySelector('li.megamenu-parrent.mx-2.py-0.py-xl-3').style.display = 'none';");
        
        WebElement AddToWishList = driver.findElement(By.xpath("//button[@class='ms-3 btn border-dark rounded-0 addToWish']"));
        AddToWishList.click();
        Thread.sleep(5000);

        WebElement ClickWishList = driver.findElement(By.xpath("//a[@class='link d-flex align-items-center mx-0 mx-lg-2']//img[1]"));
        ClickWishList.click();
        Thread.sleep(2000);

        WebElement sale = driver.findElement(By.xpath("(//li/a[contains(text(),'Sale')])"));
        sale.click();
        Thread.sleep(5000);
        
        js.executeScript("window.scrollBy(0, 1376);");
        Thread.sleep(5000);

        WebElement productImage = driver.findElement(By.xpath("//a[normalize-space()='Sudocrem Antiseptic Healing Cream 125g']"));
        productImage.click();
        Thread.sleep(2000);

        WebElement increase = driver.findElement(By.xpath("//div[contains(@class,'mt-3 d-flex')]//div[2]//img[1]"));
        increase.click();
        Thread.sleep(2000);

        WebElement addToCartTwo = driver.findElement(By.xpath("//button[@class='flex-grow-1 btn btn-dark rounded-0 d-flex justify-content-center align-items-center py-2 addToCart']"));
        addToCartTwo.click();
        Thread.sleep(2000);

        WebElement checkout = driver.findElement(By.id("checkout-btn-desktop"));
        checkout.click();
        Thread.sleep(5000);
        
        
         WebElement delete = driver.findElement(By.xpath("(//img[@class='delete-btn position-absolute removeToCart'])[1]"));
         delete.click();
         Thread.sleep(7000);
        
        

         WebElement crossCart = driver.findElement(By.xpath("(//button[@class='cross-btn btn mt-2'])[1]"));
         crossCart.click();
         Thread.sleep(2000);
       
       
        WebElement checkoutAfter = driver.findElement(By.id("checkout-btn-desktop"));
        checkoutAfter.click();
        Thread.sleep(5000);
        
        WebElement clickProcess = driver.findElement(By.xpath("(//a[contains(text(),'PROCEED')])"));
        clickProcess.click();
        Thread.sleep(2000);
        

         driver.quit();
    }

}
