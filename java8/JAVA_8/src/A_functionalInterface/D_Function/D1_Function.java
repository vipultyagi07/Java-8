package A_functionalInterface.D_Function;


import java.util.function.Function;

public class D1_Function {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyByTwo = (x) -> {
            return x * 2;
        };
        Function<Integer, Integer> multiplyBy10 = (x) -> {
            return x * 10;
        };
        Function<Integer, Integer> add60 = (x) -> {
            return x + 60;
        };

        int n = 10;

        System.out.println("Using a single 'multiplyBy10' function  " + multiplyBy10.apply(n));

        Integer multipleFunctionAnswer = multiplyByTwo.andThen(multiplyBy10).andThen(add60).apply(n);

        System.out.println("Using a multiple function  " +multipleFunctionAnswer);


    }
}
