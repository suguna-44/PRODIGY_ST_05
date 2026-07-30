# Report

## Summary

- Automated checkout flow was implemented using Selenium WebDriver and Java.
- Successfully automated page navigation and checkout form interaction.
- Verified checkout form validation for empty fields.
- Verified page transitions between Home, Product Details, Cart, and Checkout pages.
- The ShopLane demo site has a limitation where the **Add to Cart** button is disabled for some products, so the cart count may remain **0**.
- Due to this website limitation, complete checkout and purchase confirmation could not be fully automated.

## Recommendation

- Replace `Thread.sleep()` with WebDriverWait for better stability.
- Improve element locators using stable IDs or CSS selectors.
- Use a fully functional demo e-commerce website for complete checkout automation.
- Continue monitoring UI responsiveness and validation behavior.

## Output

- **Home Page:** Loaded successfully.
- **Product Details:** Opened successfully.
- **Add to Cart:** Button detected, but demo site prevented item from being added to the cart.
- **Checkout Form Validation:** Validation messages displayed correctly when fields were empty.
- **Page Transitions:** Navigation between pages worked correctly.
- **Overall Result:** Automation script executed successfully, but complete checkout was limited by the demo website functionality rather than the Selenium script.
