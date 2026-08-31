package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("John");
        names.add("David");
        names.add("John");
        names.add("Michael");

        System.out.println("Unique names: " + names);

        System.out.println(
                "Contains David: " + names.contains("David")
        );

        names.remove("David");

        System.out.println("After remove: " + names);
    }
}
