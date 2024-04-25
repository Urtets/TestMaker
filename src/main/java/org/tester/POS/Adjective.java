package org.tester.POS;

public class Adjective implements POSInter {

    private static final String JJ = "JJ";
    private static final String JJR = "JJR";
    private static final String JJS = "JJS";

    private String adjective;

    public Adjective(String adjective) {
        this.adjective = adjective;
    }

    public String getAdjective() {
        return adjective;
    }

    public static boolean isAdjective(String annotation) {
        boolean confirmation;
        switch (annotation) {
            case JJ:
            case JJR:
            case JJS:
                confirmation = true;
                break;
            default:
                confirmation = false;
                break;
        }
        return confirmation;
    }

    @Override
    public String toString() {
        return "Adjective{" +
                "adjective='" + adjective + '\'' +
                '}';
    }
}
