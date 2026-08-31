package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] numbers) {

        if (numbers == null || numbers.length < 2) {
            return;
        }

        mergeSort(numbers, 0, numbers.length - 1);
    }

    private static void mergeSort(
            int[] numbers,
            int left,
            int right) {

        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;

        mergeSort(numbers, left, middle);
        mergeSort(numbers, middle + 1, right);

        merge(numbers, left, middle, right);
    }

    private static void merge(
            int[] numbers,
            int left,
            int middle,
            int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {

            if (numbers[i] <= numbers[j]) {
                temp[k++] = numbers[i++];
            } else {
                temp[k++] = numbers[j++];
            }
        }

        while (i <= middle) {
            temp[k++] = numbers[i++];
        }

        while (j <= right) {
            temp[k++] = numbers[j++];
        }

        System.arraycopy(
                temp,
                0,
                numbers,
                left,
                temp.length
        );
    }

    public static void main(String[] args) {

        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
