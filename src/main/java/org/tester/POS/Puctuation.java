package org.tester.POS;

public class Puctuation implements POSInter{
    private static final String EXCLAIM_STOP = ".";
    private static final String COMA = ",";

    private String punctuation;

    public Puctuation(String punctuation) {
        this.punctuation = punctuation;
    }

    public String getPunctuation() {
        return punctuation;
    }

    public static boolean isPunctuation(String annotation) {
        if (annotation.equals(EXCLAIM_STOP) || annotation.equals(COMA)) {
            return true;
        } else {
            return false;
        }
    }
}
