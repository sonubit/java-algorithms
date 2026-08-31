package recursion;

public class Fibonacci {

    public static long calculate(int number) {

        if (number < 0) {
            throw new IllegalArgumentException(
                    "Number must not be negative"
            );
        }

        if (number <= 1) {
            return number;
        }

        return calculate(number - 1)
                + calculate(number - 2);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(calculate(i) + " ");
        }
    }
}
