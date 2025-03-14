# Selenium Automation for TheMall

<b>This repository contains an automated test script for the website TheMall.</b>  
The script demonstrates various interactions with the webpage using Selenium WebDriver in Java, such as searching for products, adding them to the cart, and performing actions like navigating through menus and completing checkout.

<b>Prerequisites</b>  
Before running the script, ensure you have the following installed:

<ul>
  <li>Java Development Kit (JDK) (preferably JDK 8 or later)</li>
  <li>Maven (for project management and dependency handling)</li>
  <li>Selenium WebDriver library</li>
  <li>WebDriver Manager library to automatically manage browser drivers</li>
  <li>TestNG (for test execution)</li>
</ul>

Install dependencies by running:

<pre><code>mvn install</code></pre>

<b>Steps to Run the Test</b>

<b>Step 1:</b> Clone the Repository  
<pre><code>git clone https://github.com/fablihaafia/LocatorProjectUsingselenium-themall-automation.git</code></pre>  
<pre><code>cd LocatorProjectUsingselenium-themall-automation</code></pre>

<b>Step 2:</b> Run the Test  
You can run the test through your IDE or using Maven:  
<pre><code>mvn test</code></pre>

<b>Test Flow</b>  
The test performs the following steps:

<ul>
  <li><b>Navigate to TheMall website</b> and maximize the window.</li>
  <li><b>Click the logo</b> to navigate back to the homepage.</li>
  <li><b>Search for "ordinary"</b> and press Enter to submit the search query.</li>
  <li><b>Close a specific pop-up menu</b> using JavaScript Executor.</li>
  <li><b>Scroll down</b> by 205 pixels to load more products on the page.</li>
  <li><b>Select the first product</b> ("The Ordinary Glycolic Acid 7% Exfoliating Toner 100ml") and add it to the cart.</li>
  <li><b>Navigate through various categories</b> such as Makeup, Fragrance, and Sale.</li>
  <li><b>Apply filters</b> (e.g., oily skin type) using checkbox selection.</li>
  <li><b>Add products to the cart and wishlist</b> from different sections.</li>
  <li><b>Proceed to checkout</b>, remove items from the cart, and proceed with the checkout process.</li>
  <li><b>Delete products from the cart</b> and finalize the checkout process.</li>
  <li><b>End the test</b> by closing the browser after completing all actions.</li>
</ul>

<b>Libraries Used</b>
<ul>
  <li><b>Selenium WebDriver</b>: Used for browser automation.</li>
  <li><b>TestNG</b>: Test framework used to structure and run the tests.</li>
  <li><b>WebDriverManager</b>: Manages browser drivers for different browsers.</li>
  <li><b>JavaScriptExecutor</b>: Executes JavaScript code to manipulate web elements and perform actions like scrolling or hiding elements.</li>
</ul>

<b>Notes</b>  
<ul>
  <li>Ensure that the correct version of ChromeDriver is installed and set up by WebDriverManager.</li>
  <li>This script uses <code>Thread.sleep()</code> for waiting, which is typically discouraged for production tests but is used here for simplicity.</li>
  <li>Consider replacing it with explicit waits for better test performance.</li>
</ul>
