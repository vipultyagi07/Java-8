package lambda;

@FunctionalInterface
interface FirstInterface1 {

    public int findSum(int a, int b, int c);
}

public class BasicLambda2 {
    public static void main(String[] args) {

        FirstInterface1 firstInterface1 = (x, y, z) -> {
            return x + y + z;
        };

        int result = firstInterface1.findSum(2, 3, 1);

        System.out.println("SUM: " + result);


    }
}
