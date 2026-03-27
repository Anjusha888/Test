package mobile_testing_app;

public class Main {

    public static void main(String[] args) {

        try {

            MobileTesting.setup();

            Assignment.run();

            MobileTesting.teardown();

        }

        catch (Exception e) {

            e.printStackTrace();

        }

    }

}