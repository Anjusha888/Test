package mobile_testing_app;

import java.io.FileWriter;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTesting {

    private static AndroidDriver<MobileElement> driver;
    private static FileWriter writer;

    public static void setup() throws Exception {

        DesiredCapabilities caps =
                new DesiredCapabilities();

        caps.setCapability("platformName", "Android");

        caps.setCapability("deviceName",
                "Android Emulator");

        caps.setCapability("automationName",
                "UiAutomator1");

        caps.setCapability("app",
                "C:\\Users\\HP\\EriBank.apk");

        driver =
                new AndroidDriver<MobileElement>(

                        new URL(
                                "http://127.0.0.1:4723/wd/hub"),

                        caps);

        writer =
                new FileWriter("results\\OutputFile.txt");

        Thread.sleep(5000);

    }

    public static AndroidDriver<MobileElement>
            getDriver() {

        return driver;

    }

    public static void printTest(int testNumber)
            throws Exception {

        String source =
                driver.getPageSource();

        writer.write("(" + testNumber + ")\n");

        writer.write(source + "\n");

        System.out.println("(" + testNumber + ")");

    }

    public static void teardown()
            throws Exception {

        writer.close();

        if (driver != null) {

            driver.quit();

        }

    }

}