package A_functionalInterface.C_Supplier;

import java.util.UUID;
import java.util.function.Supplier;

class CustomSupplier{

    Supplier<String> customSupplier= ()->{

        return UUID.randomUUID().toString();
    };
}

public class C1_Supplier {
    public static void main(String[] args) {

        CustomSupplier customSupplier= new CustomSupplier();
        String uuid = customSupplier.customSupplier.get();

        System.out.println("UUID is: "+uuid);

    }
}