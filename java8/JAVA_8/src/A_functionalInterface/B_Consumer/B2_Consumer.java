package A_functionalInterface.B_Consumer;

import java.util.List;
import java.util.function.Consumer;

class CustomConsumer2 {

    Consumer<List<Integer>> listConsumer = x -> {

        // add the list element
        Integer sum = 0;
        for (Integer element : x) {
            sum += element;
        }
        System.out.println("Total sum is: " + sum);
    };
}

public class B2_Consumer {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4);

        CustomConsumer2 customConsumer2 = new CustomConsumer2();
        customConsumer2.listConsumer.accept(list);

        // OR

        Consumer<List<Integer>> mainConsumer = x -> {
            Integer sum = 0;
            for (Integer element : x) {
                sum += element;
            }
            System.out.println("Total sum is using consumer in main: " + sum);

        };

        mainConsumer.accept(list);

    }
}
