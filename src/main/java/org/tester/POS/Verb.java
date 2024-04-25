package org.tester.POS;

public class Verb implements POSInter{

    private static final String VB = "VB";
    private static final String VBD = "VBD";
    private static final String VBG = "VBG";
    private static final String VBN = "VBN";
    private static final String VBP = "VBP";
    private static final String VBZ = "VBZ";
    private static final String MD = "MD";


    private String verb;

    public Verb(String adjective) {
        this.verb = adjective;
    }

    public String getVerb() {
        return verb;
    }

    public static boolean isVerb(String annotation) {
        boolean confirmation;
        switch (annotation) {
            case VB:
            case MD:
            case VBD:
            case VBG:
            case VBN:
            case VBP:
            case VBZ:
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
        return "Verb{" +
                "adjective='" + verb + '\'' +
                '}';
    }
}
