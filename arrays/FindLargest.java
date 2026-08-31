package arrays;

public class FindLargest {

    public static int findLargest(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 5, 80, 42};

        System.out.println("Largest: " + findLargest(numbers));
    }
}
