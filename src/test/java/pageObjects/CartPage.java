package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Hooks;

public class CartPage {

    public CartPage(Hooks hooks) {
        this.driver = hooks.getDriver();
    }

    public WebDriver driver;
    By dressButton = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    By summerDressButton = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > ul > li:nth-child(3) > a");
    By longSummerDress = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.left-block > div > a.product_img_link > img");
    By shortSummerDress = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.last-item-of-tablet-line.last-mobile-line > div > div.left-block > div > a.product_img_link > img");
    By chiffonDress = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.last-line.first-item-of-tablet-line.last-item-of-mobile-line.last-mobile-line > div > div.left-block > div > a.product_img_link > img");
    By continueShopping = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span > span");
    By proceedToCheckOutButton = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
    By lastProceedToCheckOutButton = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span");
    By signIn = By.cssSelector("#order_step > li.step_current.second > span");

    public  void Navigate(String url){
        driver.navigate().to(url);
    }

    public  void DressAndSummerButton(){
        Actions action = new Actions(driver);
        WebElement mouseHover = driver.findElement(dressButton);
        action.moveToElement(mouseHover).build().perform();
        driver.findElement(summerDressButton).click();
    }
//    public  void SummerDressButton(){
//        driver.findElement(summerDressButton).click();
//    }
    public void AddLongSummerDressToCart(){
        Actions action = new Actions(driver);
        WebElement mouseHover = driver.findElement(longSummerDress);
        action.moveToElement(mouseHover).build().perform();
        driver.findElement(By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")).click();
    }
    public void AddShortSummerDressToCart() {
        Actions action = new Actions(driver);
        WebElement mouseHover = driver.findElement(shortSummerDress);
        action.moveToElement(mouseHover).build().perform();
        driver.findElement(By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.last-item-of-tablet-line.last-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")).click();
    }
    public void AddChiffonDressToCart() {
        Actions action = new Actions(driver);
        WebElement mouseHover = driver.findElement(chiffonDress);
        action.moveToElement(mouseHover).build().perform();
        driver.findElement(By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-in-line.last-line.first-item-of-tablet-line.last-item-of-mobile-line.last-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span")).click();
    }
        public  void ContinueShopping(){
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(continueShopping));
                   driver.findElement(continueShopping).click();
    }
    public  void ProceedToCheckOut(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOutButton));
                driver.findElement(proceedToCheckOutButton).click();
    }
    public void LastCheckOutButton(){
        driver.findElement(lastProceedToCheckOutButton).click();
    }
    public boolean IsSignInPageDisplayed(){
        return driver.findElement(signIn).isDisplayed();
    }


}
