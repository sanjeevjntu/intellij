import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by keerti sanjeev on 26/7/2017.
 */
public class TestSupplier {

    public static void main(String[] args) {
        System.out.println("Sanjeev");

        Supplier<String> supplier = () -> {
            String[] s1 = {"Sunny", "Bunny", "ASDD", "DSFF"};
            int x = (int) Math.random() * 3 + 1;
            return s1[x];
        };

        System.out.println("Sanjeev");
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());


    }
}
