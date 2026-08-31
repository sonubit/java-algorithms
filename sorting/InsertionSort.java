package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] numbers) {

        if (numbers == null) {
            return;
        }

        for (int i = 1; i < numbers.length; i++) {

            int current = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > current) {

                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {12, 11, 13, 5, 6};

        sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
