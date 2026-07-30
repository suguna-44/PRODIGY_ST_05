# Notes

## Setup

- Used Selenium WebDriver with Java.
- Used Maven for dependency management.
- Used Google Chrome and ChromeDriver.
- Target demo site: https://shoplane-by-lassie.netlify.app/
- Automated product navigation, cart interaction, checkout form, and page transitions.

## Approach

1. Launch the ShopLane demo website.
2. Open a product details page.
3. Attempt to add the product to the cart.
4. Navigate to the cart and checkout page.
5. Verify form validation with empty fields.
6. Fill the checkout form with valid data.
7. Verify page transitions and overall application behavior.
8. Close the browser after execution.

## Environment

- Language: Java
- Automation Tool: Selenium WebDriver
- Build Tool: Maven
- IDE: Visual Studio Code
- Browser: Google Chrome
- Operating System: Windows 10/11

## Observation

- The application pages loaded successfully.
- Product pages opened correctly.
- Form validation messages worked as expected.
- The demo website has limitations with the **Add to Cart** feature, so complete checkout may not always be possible.
- The Selenium automation script executed successfully.
