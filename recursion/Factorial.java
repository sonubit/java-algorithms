package recursion;

public class Factorial {

    public static long calculate(int number) {

        if (number < 0) {
            throw new IllegalArgumentException(
                    "Number must not be negative"
            );
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * calculate(number - 1);
    }

    public static void main(String[] args) {

        System.out.println(calculate(5));
    }
}
