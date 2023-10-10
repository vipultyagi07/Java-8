package A_functionalInterface.A_predicate;
import java.util.function.Predicate;

public class A3_Predicate {
    public static void main(String[] args) {
        // Initialize the transaction amount as a double
        double transactionAmount = 1500.50;

        // Define a Predicate to check if the transaction amount is greater than $1000
        Predicate<Double> isGreaterThan1000 = amount -> amount > 1000.0;

        // Test the transaction amount with the Predicate
        if (isGreaterThan1000.test(transactionAmount)) {
            System.out.println("Transaction amount is greater than $1000.");
        } else {
            System.out.println("Transaction amount is not greater than $1000.");
        }
    }
}
