package lambda;


interface FirstInterface{

    public void sum(int a);
}

class FirstInterfaceImpl{

    FirstInterface firstInterfa = (x)-> {System.out.println(x);};

}

public class BasicLambda {
    public static void main(String[] args) {

        FirstInterfaceImpl firstInterfaceImpl = new FirstInterfaceImpl();
        firstInterfaceImpl.firstInterfa.sum(5);
    }
}

