package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] numbers) {

        if (numbers == null) {
            return;
        }

        for (int i = 0; i < numbers.length - 1; i++) {

            int minimumIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minimumIndex];
            numbers[minimumIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {64, 25, 12, 22, 11};

        sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
