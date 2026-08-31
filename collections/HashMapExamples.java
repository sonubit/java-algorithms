package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "John");
        employees.put(102, "David");
        employees.put(103, "Michael");

        System.out.println("Employees: " + employees);

        System.out.println("Employee 101: " + employees.get(101));

        employees.put(102, "Robert");

        System.out.println("Updated: " + employees);

        employees.remove(103);

        System.out.println("After remove: " + employees);
    }
}
