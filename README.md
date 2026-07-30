# PRODIGY_ST_05

# Automated UI Testing for E-Commerce Checkout Flow

## Objective
This project automates the "Add to Cart" functionality of an e-commerce website using Selenium WebDriver with Java. It verifies that a product can be added successfully and that the cart count is updated.

## Tools & Technologies
- Java
- Selenium WebDriver
- Maven
- ChromeDriver
- VS Code

## Website Tested
https://shoplane-by-lassie.netlify.app/

## Test Case Executed

### TC_01 – Add Item to Cart

**Description:**
Verify that a user can add a product to the shopping cart.

**Test Steps:**
1. Launch the ShopLane website.
2. Open the first product.
3. Click the **Add to Cart** button.
4. Verify the cart badge count changes from **0** to **1**.

**Expected Result:**
The selected product should be added to the cart successfully.

**Actual Result:**
The product was added successfully, and the cart badge updated to **1**.

**Status:**
✅ PASS

## Project Structure

```
PRODIGY_ST_05/
│── src/
│   └── main/
│       └── java/
│           └── com/
│               └── prodigy/
│                   └── AddToCartTest.java
│── pom.xml
│── README.md
```

## Output
- Website launched successfully.
- Product page opened.
- Product added to cart.
- Cart badge updated from **0** to **1**.
- Test executed successfully.

## Author
**Suguna**
