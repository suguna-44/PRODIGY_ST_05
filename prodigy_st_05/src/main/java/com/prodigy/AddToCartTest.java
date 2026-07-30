package com.prodigy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("https://shoplane-by-lassie.netlify.app/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        // Open first product
        driver.findElement(By.xpath("(//div[@id='box'])[1]")).click();

        Thread.sleep(3000);

        // Click Add to Cart
        driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();

        Thread.sleep(3000);

        // Verify cart badge
        String cartCount = driver.findElement(By.id("badge")).getText();

        if(cartCount.equals("1"))
        {
            System.out.println("PASS : Product Added Successfully");
        }
        else
        {
            System.out.println("FAIL : Product Not Added");
        }

        Thread.sleep(3000);

        
    }
}
