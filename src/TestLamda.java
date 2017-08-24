interface Greet {
    String greet();
}

/**
 * Created by keerti sanjeev on 26/7/2017.
 */
public class TestLamda {

    public static void main(String[] args) {
        Greet greetingFunction = () -> {
            return "Hello";
        };


    }
}
