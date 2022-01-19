package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import utilities.Hooks;

import static net.jodah.failsafe.internal.util.Assert.*;
import static org.testng.Assert.assertTrue;

public class CartSteps {

    public WebDriver driver;
    public CartPage cartPage;

    public  CartSteps(Hooks hooks){
        this.driver = hooks.getDriver();
        cartPage = new CartPage(hooks);
    }

    @Given("user navigates to {string}")
    public void userNavigatesTo(String url) {
        cartPage.Navigate(url);
    }

    @When("user mouse hover on dresses and clicks on summer dresses")
    public void userMouseHoverOnDressesAndClicksOnSummerDresses() {
        cartPage.DressAndSummerButton();
    }
    @And("user mouse hover on each long summer dress and add to cart")
    public void userMouseHoverOnEachLongSummerDressAndAddToCart() {
        cartPage.AddLongSummerDressToCart();
    }
    @And("user click on continue shopping")
    public void userClickOnContinueShopping() {

        cartPage.ContinueShopping();
    }

    @And("user mouse hover on each short summer dress and add to cart")
    public void userMouseHoverOnEachShortSummerDressAndAddToCart() {
        cartPage.AddShortSummerDressToCart();
    }
    @And("user mouse hover on each chiffon dress and add to cart")
    public void userMouseHoverOnEachChiffonDressAndAddToCart() {
        cartPage.AddChiffonDressToCart();
    }

    @And("user clicks proceed to checkout button")
    public void userClicksProceedToCheckoutButton() {
        cartPage.ProceedToCheckOut();
    }
    @And("user click on the last proceed to checkout button")
    public void userClickOnTheLastProceedToCheckoutButton() {
        cartPage.LastCheckOutButton();
    }

    @Then("sign in page is displayed")
    public void signInPageIsDisplayed() {
        assertTrue(cartPage.IsSignInPageDisplayed());
    }
}
