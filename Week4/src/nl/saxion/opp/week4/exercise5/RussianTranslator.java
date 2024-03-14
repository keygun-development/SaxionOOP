package nl.saxion.opp.week4.exercise5;

public class RussianTranslator extends Translator {
    public RussianTranslator() {
        super("Russian", "dd.MM.yyyy HH:mm:ss", "RUB", 79.0);
    }
    public String getLanguage() {
        return "Russian";
    }

    public String getGreeting() {
        return "Здравствуйте!";
    }

    public String getExplanation() {
        return "Добро пожаловать в Россию!";
    }

    public String getTimeInFormat() {
        return super.getTimeInFormat();
    }

    public String getCurrency() {
        return super.getCurrency();
    }

    public double convertFromEuro(int nrOfEuro) {
        return super.convertFromEuro(nrOfEuro);
    }
}
