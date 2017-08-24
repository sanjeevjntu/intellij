package executors;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//itco Control J - For Iterators

//Contrl Shift F10 to run the program

//f9 is for

//Control Q for documentation
// VCS and VCS Operations for commit *************

public class Intelli2017Tips {

    public static void main(String[] args) {
        System.out.println("Hello Intelli J 2017");

        List<String> strings = Arrays.asList("Sanjeev", "Sssad", "ddfff");

        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println(next);
            System.out.println();


        }


        for (String string : strings) {
            System.out.println(string);
        }
    }
}
