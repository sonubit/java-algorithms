package strings;

public class Palindrome {

    public static boolean isPalindrome(String value) {

        if (value == null) {
            return false;
        }

        String normalized = value
                .replaceAll("\\s+", "")
                .toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {

            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome("Java"));
    }
}
