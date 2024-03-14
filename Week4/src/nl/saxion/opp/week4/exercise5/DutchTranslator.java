package nl.saxion.opp.week4.exercise5;

public class DutchTranslator extends Translator {
    public DutchTranslator() {
        super("Dutch", "dd-MM-yyyy HH:mm:ss", "EUR", 1.0);
    }
    public String getLanguage() {
        return "Dutch";
    }

    public String getGreeting() {
        return "Hallo!";
    }

    public String getExplanation() {
        return "Welkom in Nederland!";
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
