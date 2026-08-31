package strings;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String first, String second) {

        if (first == null || second == null) {
            return false;
        }

        char[] firstChars = first
                .replaceAll("\\s+", "")
                .toLowerCase()
                .toCharArray();

        char[] secondChars = second
                .replaceAll("\\s+", "")
                .toLowerCase()
                .toCharArray();

        if (firstChars.length != secondChars.length) {
            return false;
        }

        Arrays.sort(firstChars);
        Arrays.sort(secondChars);

        return Arrays.equals(firstChars, secondChars);
    }

    public static void main(String[] args) {

        System.out.println(
                isAnagram("listen", "silent")
        );

        System.out.println(
                isAnagram("java", "spring")
        );
    }
}
