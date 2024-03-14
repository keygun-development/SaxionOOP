package nl.saxion.opp.week4.exercise5;

public class Main {
    public static void main(String[] args) {
        RussianTranslator translator = new RussianTranslator(); // Change this!

        System.out.println("The following text is displayed in: " + translator.getLanguage());
        System.out.println();

        System.out.println(translator.getGreeting());
        System.out.println();
        System.out.println(translator.getExplanation());
        System.out.println();

        System.out.println("The current time would be printed as " + translator.getTimeInFormat() + " in this country.");
        System.out.println();

        System.out.println("1 Euro would be worth " + translator.convertFromEuro(1) + " "+ translator.getCurrency());
        System.out.println("25 Euro would be worth " + translator.convertFromEuro(25) + " "+ translator.getCurrency());
    }
}
