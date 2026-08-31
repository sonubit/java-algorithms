package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("David");
        names.add("Michael");

        System.out.println("Names: " + names);

        names.add(1, "Robert");

        System.out.println("After insert: " + names);

        names.remove("David");

        System.out.println("After remove: " + names);

        System.out.println("Contains John: " + names.contains("John"));
        System.out.println("Size: " + names.size());
    }
}
