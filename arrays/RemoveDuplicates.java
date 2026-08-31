package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] numbers) {

        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        return uniqueNumbers.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        int[] result = removeDuplicates(numbers);

        System.out.println(Arrays.toString(result));
    }
}
