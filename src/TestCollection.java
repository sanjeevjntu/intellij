import java.util.function.Consumer;

/**
 * Created by keerti sanjeev on 26/7/2017.
 */
public class TestCollection {

    public static void main(String[] args) {
        System.out.println("Sanjeev");

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello");
        consumer.accept("Diursgag");
    }
}
