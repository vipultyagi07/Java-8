package A_functionalInterface.A_predicate;



import java.util.function.Predicate;

public class A5_Predicate {
    public static void main(String[] args) {
        String email = "dvd6533@gmail.com";

        Predicate<String> isValidEmail = str -> str.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");

        if (isValidEmail.test(email)) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }
}
