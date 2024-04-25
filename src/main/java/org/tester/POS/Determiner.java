package org.tester.POS;

public class Determiner implements POSInter{

    private static final String DT = "DT";
    private static final String PDT = "PDT";
    private static final String PRP$ = "PRP$";
    private static final String WDT = "WDT";
    private static final String WP$ = "WP$";

    private String determiner;

    public Determiner(String determiner) {
        this.determiner = determiner;
    }

    public String getDeterminer() {
        return determiner;
    }

    public static boolean isDeterminer(String annotation) {
        boolean confirmation = false;
        switch (annotation) {
            case DT:
            case PDT:
            case PRP$:
            case WDT:
            case WP$:
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
        return "Determiner{" +
                "determiner='" + determiner + '\'' +
                '}';
    }
}
