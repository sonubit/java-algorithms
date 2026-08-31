package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {

    public static Map<Character, Integer> countCharacters(String value) {

        Map<Character, Integer> frequency = new LinkedHashMap<>();

        if (value == null) {
            return frequency;
        }

        for (char character : value.toCharArray()) {

            if (Character.isWhitespace(character)) {
                continue;
            }

            frequency.merge(
                    character,
                    1,
                    Integer::sum
            );
        }

        return frequency;
    }

    public static void main(String[] args) {

        String value = "hello world";

        System.out.println(countCharacters(value));
    }
}
