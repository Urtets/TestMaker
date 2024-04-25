package org.tester.POS;

public class Preposition implements POSInter{

    private static final String IN = "IN";
    private String preposition;

    public Preposition(String preposition) {
        this.preposition = preposition;
    }

    public String getPreposition() {
        return preposition;
    }

    public static boolean isPreposition(String annotation) {
        boolean confirmation = false;
        if (annotation.equals(IN)) {
            confirmation = true;
        }
        return confirmation;
    }

    @Override
    public String toString() {
        return "Preposition{" +
                "preposition='" + preposition + '\'' +
                '}';
    }
}
