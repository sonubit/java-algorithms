package searching;

public class LinearSearch {

    public static int search(int[] numbers, int target) {

        if (numbers == null) {
            return -1;
        }

        for (int index = 0; index < numbers.length; index++) {

            if (numbers[index] == target) {
                return index;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int index = search(numbers, 30);

        System.out.println("Index: " + index);
    }
}
