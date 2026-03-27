package mobile_testing_app;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Assignment {

    public static void run() throws Exception {

        AndroidDriver<MobileElement> driver =
                MobileTesting.getDriver();

        Thread.sleep(4000);

        // (1) Login page loaded

        MobileTesting.printTest(1);

        MobileElement username =
                driver.findElement(By.id(
                "com.experitest.ExperiBank:id/usernameTextField"));

        // (2)

        username.sendKeys("company");

        Thread.sleep(1000);

        MobileTesting.printTest(2);

        // (3)

        MobileElement password =
                driver.findElement(By.id(
                "com.experitest.ExperiBank:id/passwordTextField"));

        password.click();

        Thread.sleep(1000);

        MobileTesting.printTest(3);

        // (4)

        password.sendKeys("company");

        driver.hideKeyboard();

        Thread.sleep(1000);

        MobileTesting.printTest(4);

        // (5)

        username.click();

        Thread.sleep(1000);

        MobileTesting.printTest(5);

        // (6)

        username.clear();

        Thread.sleep(1000);

        MobileTesting.printTest(6);

        // (7) Click login (empty username)

        driver.findElement(By.id(
        "com.experitest.ExperiBank:id/loginButton"))
        .click();

        Thread.sleep(2000);

        MobileTesting.printTest(7);

        // Close popup

        driver.findElement(By.xpath(
        "//android.widget.Button[@text='Close']"))
        .click();

        Thread.sleep(2000);

        // (8) Re-enter username

        username =
        driver.findElement(By.id(
        "com.experitest.ExperiBank:id/usernameTextField"));

        username.sendKeys("company");

        Thread.sleep(1000);

        MobileTesting.printTest(8);

        // (9) Login

        driver.findElement(By.id(
        "com.experitest.ExperiBank:id/loginButton"))
        .click();

        Thread.sleep(4000);

        MobileTesting.printTest(9);

        // (10) Make Payment

        driver.findElement(By.id(
        "com.experitest.ExperiBank:id/makePaymentButton"))
        .click();

        Thread.sleep(3000);

        MobileTesting.printTest(10);

        // (11) Phone

        driver.findElement(By.id(
        "com.experitest.ExperiBank:id/phoneTextField"))
        .sendKeys("612-555-0112");

        Thread.sleep(1000);

        MobileTesting.printTest(11);

        // (12) Name

        driver.findElement(By.id(
        "com.experitest.ExperiBank:id/nameTextField"))
        .sendKeys("Alice");

        Thread.sleep(1000);

        driver.hideKeyboard();

        Thread.sleep(2000);

        MobileTesting.printTest(12);

        // (13) Amount

        driver.findElement(By.id(
        "com.experitest.ExperiBank:id/amountTextField"))
        .sendKeys("35");

        Thread.sleep(2000);

        MobileTesting.printTest(13);
     // (14) Press Send Payment → still on payment page
     // Send Payment is disabled here, so remain on same page

     Thread.sleep(2000);

     MobileTesting.printTest(14);


     // (15) Type "United States" to country field
     // (In this UI: click Select → choose USA)

     driver.findElement(By.xpath(
     "//android.widget.Button[@text='Select']"))
     .click();

     Thread.sleep(2000);

     // Scroll to USA

     driver.findElementByAndroidUIAutomator(
     "new UiScrollable(new UiSelector().scrollable(true))"
     + ".scrollIntoView(new UiSelector().text(\"USA\"));");

     Thread.sleep(2000);

     // Select USA

     driver.findElement(By.xpath(
     "//android.widget.TextView[@text='USA']"))
     .click();

     Thread.sleep(2000);

     MobileTesting.printTest(15);


     // (16) Press Cancel → go back to Summary page

     driver.findElement(By.xpath(
     "//android.widget.Button[@text='Cancel']"))
     .click();

     Thread.sleep(4000);

     MobileTesting.printTest(16);


     // (17) Press Make Payment again

     driver.findElement(By.id(
     "com.experitest.ExperiBank:id/makePaymentButton"))
     .click();

     Thread.sleep(4000);

     MobileTesting.printTest(17);


     // (18) Type phone number

     driver.findElement(By.id(
     "com.experitest.ExperiBank:id/phoneTextField"))
     .sendKeys("612-555-0355");

     Thread.sleep(1000);

     MobileTesting.printTest(18);


     // (19) Type name "Bob"

     driver.findElement(By.id(
     "com.experitest.ExperiBank:id/nameTextField"))
     .sendKeys("Bob");

     Thread.sleep(1000);

     driver.hideKeyboard();

     Thread.sleep(2000);

     MobileTesting.printTest(19);


     // (20) Drag amount to $55
     // (Using text field version)

     driver.findElement(By.id(
     "com.experitest.ExperiBank:id/amountTextField"))
     .clear();

     driver.findElement(By.id(
     "com.experitest.ExperiBank:id/amountTextField"))
     .sendKeys("55");

     Thread.sleep(2000);

     MobileTesting.printTest(20);


     // (21) Press country button

     driver.findElement(By.xpath(
     "//android.widget.Button[@text='Select']"))
     .click();

     Thread.sleep(2000);

     MobileTesting.printTest(21);


     // (22) Select France

     driver.findElementByAndroidUIAutomator(
     "new UiScrollable(new UiSelector().scrollable(true))"
     + ".scrollIntoView(new UiSelector().text(\"France\"));");

     Thread.sleep(2000);

     driver.findElement(By.xpath(
     "//android.widget.TextView[@text='France']"))
     .click();

     Thread.sleep(2000);

     MobileTesting.printTest(22);


     // (23) Press Send Payment

     driver.findElement(By.xpath(
     "//android.widget.Button[@text='Send Payment']"))
     .click();

     Thread.sleep(2000);

     MobileTesting.printTest(23);


     // (24) Dismiss alert (NO)

     driver.findElement(By.id(
     "android:id/button2"))
     .click();

     Thread.sleep(3000);

     MobileTesting.printTest(24);


     // (25) Press Send Payment again

     driver.findElement(By.xpath(
     "//android.widget.Button[@text='Send Payment']"))
     .click();

     Thread.sleep(2000);

     MobileTesting.printTest(25);


     // (26) Accept alert (YES)

     driver.findElement(By.id(
     "android:id/button1"))
     .click();

     Thread.sleep(4000);

     MobileTesting.printTest(26);

        // Logout

        driver.findElement(By.id(
        "com.experitest.ExperiBank:id/logoutButton"))
        .click();

        Thread.sleep(3000);

        MobileTesting.printTest(27);

    }

}