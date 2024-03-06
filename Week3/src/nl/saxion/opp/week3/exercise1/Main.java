package nl.saxion.opp.week3.exercise1;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.toCamelCase("hello world"));
        System.out.println(StringUtils.toPascalCase("hello world"));
        System.out.println(StringUtils.toSnakeCase("hello world"));
        System.out.println(StringUtils.toUpperSnakeCase("hello world"));
        System.out.println(StringUtils.toKebabCase("hello world"));
        System.out.println(StringUtils.toL33t("hello world"));
    }
}