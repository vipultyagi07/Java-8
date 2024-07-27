package A_functionalInterface.B_Consumer;

import java.util.List;
import java.util.function.Consumer;

class ConsumerCustomImpl {
    Consumer<Integer> consumer = x -> {
        int a = x * x + x;
        System.out.println("manipulated output: " + a);
    };
}

public class B1_Consumer {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3);

        ConsumerCustomImpl consumerCustom = new ConsumerCustomImpl();

        for (Integer l : list) {
            consumerCustom.consumer.accept(l);
        }
        // this and above are same
        System.out.println("-------------------------------------");
        list.forEach(consumerCustom.consumer);
    }
}
