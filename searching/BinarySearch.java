package searching;

public class BinarySearch {

    public static int search(int[] numbers, int target) {

        if (numbers == null) {
            return -1;
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (numbers[middle] == target) {
                return middle;
            }

            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(search(numbers, 40));
    }
}
