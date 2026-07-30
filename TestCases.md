# Test Cases

| Test Case ID | Description | Steps | Expected Result | Actual Result | Status |
|--------------|-------------|-------|-----------------|---------------|--------|
| TC_01 | Add item to cart | Open ShopLane → Select a product → Click **Add to Cart** | Item is added to cart and cart count increases | Item added to cart successfully | Pass |
| TC_02 | Checkout form validation | Open checkout page → Leave all fields empty → Click **Place Order** | Validation message is displayed for required fields | Validation message displayed | Pass |
| TC_03 | Valid checkout | Add product → Open checkout → Enter Name, Email, Address and Payment details → Click **Place Order** | Order placed successfully and success message displayed | Success message displayed | Pass |
| TC_04 | Page transition | Home → Product Details → Cart → Checkout → Confirmation | All pages open correctly without errors | Navigation works as expected | Pass |
