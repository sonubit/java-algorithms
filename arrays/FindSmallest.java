package arrays;

public class FindSmallest {

    public static int findSmallest(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int smallest = numbers[0];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 5, 80, 42};

        System.out.println("Smallest: " + findSmallest(numbers));
    }
}
