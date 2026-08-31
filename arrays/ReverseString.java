package strings;

public class ReverseString {

    public static String reverse(String value) {

        if (value == null) {
            throw new IllegalArgumentException("String must not be null");
        }

        return new StringBuilder(value)
                .reverse()
                .toString();
    }

    public static void main(String[] args) {

        String value = "Java";

        System.out.println("Original: " + value);
        System.out.println("Reverse: " + reverse(value));
    }
}
