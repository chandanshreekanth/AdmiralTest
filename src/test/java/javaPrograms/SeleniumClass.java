package javaPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumClass {

    public static void main(String[] args) throws InterruptedException {

//        WebDriver driver=new ChromeDriver();
        WebDriver driver=new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        System.out.println("fire fox launched");
        System.out.println("Launched Amazon");
        String ti=driver.getTitle();
        System.out.println(ti);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("moto edge 50 fusion 5g");
//        driver.findElement(By.xpath("//div[@aria-label='moto edge 50 fusion 5g']")).click();
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[contains(.,'Motorola Edge 50 Fusion 5G (Hot Pink, 12GB RAM, 256GB Storage)')]/..//h2[@aria-label='Motorola Edge 50 Fusion 5G (Hot Pink, 12GB RAM, 256GB Storage)']")).click();

        String p_id=driver.getWindowHandle();
        System.out.println(p_id);
        Set<String> browser = driver.getWindowHandles();
        System.out.println(browser);
        int count=browser.size();
        System.out.println(count);
        browser.remove(p_id);
        int c1=browser.size();
        System.out.println(browser);
        for(String wh:browser)
        {
            driver.switchTo().window(wh);
            String title=driver.getTitle();
            System.out.println(title);
//            Thread.sleep(2000);
//            driver.close();

        }
        System.out.println(driver.getWindowHandle());
        String priceText=driver.findElement(By.xpath("//span[contains(text(),'Motorola Edge 50 Fusion 5G (Hot Pink, 12GB RAM, 256GB Storage)')]/ancestor::div[@id='centerCol']/descendant::span[@class='a-price-whole']")).getText().replace(",","");
        int price=Integer.parseInt(priceText);
        if(price<30000)
        {
            System.out.println("the price is = "+price);
            System.out.println("Adding to cart");
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='add-to-cart-button' and @class='a-button-input']"))).click();
//            driver.findElement(By.xpath("//input[@id='add-to-cart-button' and @class='a-button-input']/following-sibling::span")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4[contains(text(),'Added to cart')])[2]")));
            String validate=driver.findElement(By.xpath("(//h4[contains(text(),'Added to cart')])[2]")).getText();
            System.out.println(validate);
            Assert.assertEquals(validate,"Added to cart");
            System.out.println("Added to cart");
            WebElement element = driver.findElement(By.xpath("//span[text()='Proceed to checkout (1 item)']"));
            System.out.println(element.getCssValue("display"));
            System.out.println(element.getCssValue("visibility"));
            System.out.println(element.getCssValue("position"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
            Thread.sleep(3000);
            WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Continue')]")));
            Thread.sleep(3000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);

            String validateContinue=driver.findElement(By.xpath("//div[contains(text(),'Enter your email or mobile phone number')]")).getText();
            Assert.assertEquals(validateContinue,"Enter your email or mobile phone number");
        }
        else{
            System.out.println("Out of budget");
        }




    }

}
