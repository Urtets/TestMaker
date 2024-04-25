package org.tester.POS;

public class Conjunction implements POSInter{

    private static final String CC = "CC";

    private String conjunction;

    public Conjunction(String conjunction) {
        this.conjunction = conjunction;
    }

    public String getConjunction() {
        return conjunction;
    }
    public static boolean isConjunction(String annotation) {
        boolean confirmation = false;
        if (annotation.equals(CC)) {
            confirmation = true;
        }
        return confirmation;
    }

    @Override
    public String toString() {
        return "Conjunction{" +
                "conjunction='" + conjunction + '\'' +
                '}';
    }
}
