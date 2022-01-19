Feature: Cart
  As a user of the website
  I want to be able to add items to cart
  So that I can proceed to checkout

 @Test
 Scenario: Add Summer Dresses to Cart
   Given user navigates to "http://automationpractice.com/index.php"
   When user mouse hover on dresses and clicks on summer dresses
   And user mouse hover on each long summer dress and add to cart
   And user click on continue shopping
   And user mouse hover on each short summer dress and add to cart
   And user click on continue shopping
   And user mouse hover on each chiffon dress and add to cart
   And user clicks proceed to checkout button
   And user click on the last proceed to checkout button
   Then sign in page is displayed
