package arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] numbers) {

        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        reverse(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
