package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] numbers) {

        if (numbers == null) {
            return;
        }

        for (int i = 0; i < numbers.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {5, 1, 4, 2, 8};

        sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
