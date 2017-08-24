package executors;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//itco Control J - For Iterators

//Contrl Shift F10 to run the program

//f9 is for

//F5 to create new class copy

public class Intelli2017Tips2 {

    public static void main(String[] args) {
        System.out.println("Hello Intelli J 2017");

        List<String> strings = Arrays.asList("Sanjeev", "Sssad", "ddfff");

        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println(next);


        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
