import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by keerti sanjeev on 14/8/2017.
 */
public class TestList {

    public static void main(String[] args) {

        System.out.println(getListData());

    }

    private static List<String> getListData() {
        List<String> list = Arrays.asList("Sanjeev", "Naisha", "Kalpana", "Keerti");
        Collections.sort(list);
        return list;
    }

}


