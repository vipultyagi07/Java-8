package newPackage;

import java.util.function.Predicate;

public class NewHello {


    public static void main(String[] args) {
        System.out.println("hello java 8 world");

        Predicate<Integer> p=(x)->x%2==0;
        int n=5;

    }
}
