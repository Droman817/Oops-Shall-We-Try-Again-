import util.InputValidator;

public class App {

    public static void main(String[] args) {

        int value = InputValidator.getValidatedInt(
                1,
                100,
                "Please enter a value",
                "Your value is invalid"
        );

        System.out.println();
        System.out.println("The value chosen by the user is " + value);
    }
}