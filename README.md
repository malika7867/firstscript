# Selenium Script: NopCommerce Demo Store Title Validation

This repository contains a simple Selenium script written in Java to open the Chrome browser, navigate to the NopCommerce demo store, validate the page title, and then close the browser.

## Prerequisites

Before running the script, make sure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Google Chrome browser
- ChromeDriver

## Setup

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/your-repository.git
    cd your-repository
    ```

2. **Install dependencies:**

    The project uses Maven for dependency management. Ensure you have Maven installed, then run:

    ```bash
    mvn clean install
    ```

3. **Download ChromeDriver:**

    Download the ChromeDriver that matches your Chrome browser version from [here](https://sites.google.com/a/chromium.org/chromedriver/downloads).

    Place the `chromedriver` executable in a directory included in your system's PATH.

## Running the Script

1. **Compile the project:**

    ```bash
    mvn compile
    ```

2. **Run the script:**

    ```bash
    mvn exec:java -Dexec.mainClass="com.yourpackage.Main"
    ```

    Replace `com.yourpackage.Main` with the actual package and class name where your `main` method is located.

## Script Overview

The script performs the following steps:

1. Opens the Chrome browser.
2. Navigates to the NopCommerce demo store.
3. Validates the page title.
4. Closes the browser.

### Example Code

Here is an example of the script:

```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the NopCommerce demo store
        driver.get("https://demo.nopcommerce.com");

        // Validate the title of the page
        String expectedTitle = "nopCommerce demo store";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title validation passed!");
        } else {
            System.out.println("Title validation failed!");
        }

        // Close the browser
        driver.quit();
    }
}
