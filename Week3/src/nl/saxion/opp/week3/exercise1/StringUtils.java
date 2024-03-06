package nl.saxion.opp.week3.exercise1;

public class StringUtils {
    public StringUtils() {
    }

    public static String toCamelCase(String sentence) {
        String[] words = sentence.split(" ");
        String camelCaseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                camelCaseString += word.toLowerCase();
            } else {
                camelCaseString += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            }
        }
        return camelCaseString;
    }

    public static String toPascalCase(String sentence) {
        String words[] = sentence.split(" ");
        String pascalCaseString = "";
        for (String word : words) {
            pascalCaseString += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }
        return pascalCaseString;
    }

    public static String toSnakeCase(String sentence) {
        return sentence.replaceAll(" ", "_");
    }

    public static String toUpperSnakeCase(String sentence) {
        return sentence.toUpperCase().replaceAll(" ", "_");
    }

    public static String toKebabCase(String sentence) {
        return sentence.replaceAll(" ", "-");
    }

    public static String toL33t(String sentence) {
        return sentence
                .replaceAll("a", "4")
                .replaceAll("e", "3")
                .replaceAll("l", "1")
                .replaceAll("o", "0")
                .replaceAll("t", "7");
    }
}
