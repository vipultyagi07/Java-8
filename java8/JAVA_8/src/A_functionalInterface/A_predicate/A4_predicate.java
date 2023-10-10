package A_functionalInterface.A_predicate;

import java.util.function.Predicate;

public class A4_predicate {
    public static void main(String[] args) {
        int number =23;

        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) return false;
            }
            return true;
        };

        if (isPrime.test(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
