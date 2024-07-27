package A_functionalInterface.C_Supplier;

import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Lazy initialization:
 * Lazy initialization is a design pattern that defers the creation of an object until the point when it is actually
 * needed. This pattern is often used when creating an object is an expensive operation or when an object may
 * not be needed during the entire lifetime of the application.
 * In lazy initialization, the object is created only when it is first requested, rather than being created when the
 * application starts up. This approach can save time and resources, especially if the object is never actually
 * used.
 * To implement lazy initialization, a Supplier can be used to provide a single instance of the object on-demand.
 * The Supplier is initialized with a method that creates the object, but the method is not called until the first
 * time the Supplier is asked to provide an instance of the object.
 */
class CustomSupplier1 {

    Supplier<HeavyObject> heavyObjectSupplier = () -> {
        // Code to create the HeavyObject goes here...
        try {
            System.out.println("creating the heavy object..........");
            Thread.sleep(5000); // Simulate an HeavyObject operation that takes 5 seconds }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" heavy object created successfully");
        return new HeavyObject();
    };

}

public class C2_Supplier {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input % 2 == 0) {
            System.out.println("number is even so creating the heavy object");
            CustomSupplier1 customSupplier1= new CustomSupplier1();
            HeavyObject heavyObject = customSupplier1.heavyObjectSupplier.get();
            heavyObject.printHeavy();

        }
        else {
            System.out.println("number is odd so not creating the heavy object");

        }


    }
}

class HeavyObject {

    public void printHeavy() {
        System.out.println("You are using heavy object");
    }
}
