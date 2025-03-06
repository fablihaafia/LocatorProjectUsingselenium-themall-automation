
# Selenium Automation for TheMall

This repository contains an automated test script for the website **TheMall**. The script demonstrates various interactions with the webpage using **Selenium WebDriver** in Java, such as searching for products, adding them to the cart, and performing actions like navigating through menus and completing checkout.

## Prerequisites

Before running the script, ensure you have the following installed:
- **Java Development Kit (JDK)** (preferably JDK 8 or later)
- **Maven** (for project management and dependency handling)
- **Selenium WebDriver** library
- **WebDriver Manager** library to automatically manage browser drivers
- **TestNG** (for test execution)
  
Install dependencies by running:


mvn install

Steps to Run the Test 
Clone the Repository: 
git clone https://github.com/your-username/locator_learning.git    
cd locator_learning

Run the Test: You can run the test through your IDE or using Maven:  
mvn test   
Test Flow

## The test performs the following steps:

- Navigate to TheMall website and maximize the window. 

- Click the logo to navigate back to the homepage. 

- Search for "ordinary" and press Enter to submit the search query. <br>

- Close a specific pop-up menu using JavaScript Executor. <br>

- Scroll down by 205 pixels to load more products on the page. <br>

- Select the first product ("The Ordinary Glycolic Acid 7% Exfoliating Toner 100ml") and add it to the cart. <br>

- Navigate through various categories such as Makeup, Fragrance, and Sale. <br>

- Apply filters (e.g., oily skin type) using checkbox selection. <br>

- Add products to the cart and wishlist from different sections. <br>

- Proceed to checkout, remove items from the cart, and proceed with the checkout process.


- Delete products from the cart and finalize the checkout process.


- End the test by closing the browser after completing all actions.


Libraries Used
Selenium WebDriver: Used for browser automation.
TestNG: Test framework used to structure and run the tests.
WebDriverManager: Manages browser drivers for different browsers.
JavaScriptExecutor: Executes JavaScript code to manipulate web elements and perform actions like scrolling or hiding elements.
Notes
Ensure that the correct version of ChromeDriver is installed and set up by WebDriverManager.
This script uses Thread.sleep() for waiting, which is typically discouraged for production tests but is used here for simplicity. Consider replacing it with explicit waits for better test performance.


