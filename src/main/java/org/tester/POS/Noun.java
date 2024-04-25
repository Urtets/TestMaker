package org.tester.POS;

public class Noun implements POSInter {

    private static final String NN = "NN";
    private static final String NNS = "NNS";
    private static final String NNP = "NNP";
    private static final String NNPS = "NNPS";
    private String noun;

    public Noun(String noun) {
        this.noun = noun;
    }

    public String getNoun() {
        return noun;
    }

    public static boolean isNoun(String annotation) {
        boolean confirmation;
        switch (annotation) {
            case NN:
            case NNP:
            case NNS:
            case NNPS:
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
        return "Noun{" +
                "noun='" + noun + '\'' +
                '}';
    }

}
