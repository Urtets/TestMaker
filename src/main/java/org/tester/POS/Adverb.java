package org.tester.POS;

public class Adverb implements POSInter{

    private static final String RB = "RB";
    private static final String RBR = "RBR";
    private static final String RBS = "RBS";
    private static final String WRB = "WRB";

    private String adverb;

    public Adverb(String adverb) {
        this.adverb = adverb;
    }

    public String getAdverb() {
        return adverb;
    }

    public static boolean isAdverb(String annotation) {
        boolean confirmation;
        switch (annotation) {
            case RB:
            case RBR:
            case RBS:
            case WRB:
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
        return "Adverb{" +
                "adverb='" + adverb + '\'' +
                '}';
    }
}
