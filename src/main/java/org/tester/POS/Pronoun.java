package org.tester.POS;

public class Pronoun implements POSInter{

    private static final String PRP = "PRP";
    private static final String WP = "WP";

    private String pronoun;

    public Pronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getPronoun() {
        return pronoun;
    }

    public static boolean isPronoun(String annotation) {
        boolean confirmation = false;
        if (annotation.equals(PRP) || annotation.equals(WP)) {
            confirmation = true;
        }
        return confirmation;
    }

    @Override
    public String toString() {
        return "Pronoun{" +
                "pronoun='" + pronoun + '\'' +
                '}';
    }
}
