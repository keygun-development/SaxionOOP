package nl.saxion.opp.week4.exercise5;

public class EnglishTranslator extends Translator {
    public EnglishTranslator() {
        super("English", "dd/MM/yyyy HH:mm:ss", "GBP", 0.85);
    }
    public String getLanguage() {
        return "English";
    }

    public String getGreeting() {
        return "Hello!";
    }

    public String getExplanation() {
        return "Welcome to the United Kingdom!";
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
