package org.tester.PartsOfSentence;

import org.tester.POS.Verb;

public class Predicate {

    private Verb verb1;
    private Verb verb2;
    private Verb verb3;
    private Verb verb4;
    private Verb verb5;
    private Verb verb6;
    private String particle;

    public Predicate(Verb verb, String particle) {
        this.verb1 = verb;
        this.particle = particle;
    }

    public Predicate(Verb verb) {
        this.verb1 = verb;
    }

    public Predicate(Verb verb1, Verb verb2) {
        this.verb1 = verb1;
        this.verb2 = verb2;
    }

    public Predicate(Verb verb1, Verb verb2, String particle) {
        this.verb1 = verb1;
        this.verb2 = verb2;
        this.particle = particle;
    }

    public Predicate(Verb verb1, Verb verb2, Verb verb3) {
        this.verb1 = verb1;
        this.verb2 = verb2;
        this.verb3 = verb3;
    }

    public Predicate(Verb verb1, Verb verb2, Verb verb3, String particle) {
        this.verb1 = verb1;
        this.verb2 = verb2;
        this.verb3 = verb3;
        this.particle = particle;
    }

    public Predicate(Verb verb1, Verb verb2, Verb verb3, Verb verb4) {
        this.verb1 = verb1;
        this.verb2 = verb2;
        this.verb3 = verb3;
        this.verb4 = verb4;
    }

    public Predicate(Verb verb1, Verb verb2, Verb verb3, Verb verb4, String particle) {
        this.verb1 = verb1;
        this.verb2 = verb2;
        this.verb3 = verb3;
        this.verb4 = verb4;
        this.particle = particle;
    }

    public Predicate(Verb verb1, Verb verb2, Verb verb3, Verb verb4, Verb verb5, String particle) {
        this.verb1 = verb1;
        this.verb2 = verb2;
        this.verb3 = verb3;
        this.verb4 = verb4;
        this.verb5 = verb5;
        this.particle = particle;
    }

    public Predicate(Verb verb1, Verb verb2, Verb verb3, Verb verb4, Verb verb5, Verb verb6, String particle) {
        this.verb1 = verb1;
        this.verb2 = verb2;
        this.verb3 = verb3;
        this.verb4 = verb4;
        this.verb5 = verb5;
        this.verb6 = verb6;
        this.particle = particle;
    }

    public Verb getVerb() {
        return verb1;
    }

    public String getParticle() {
        return particle;
    }

    @Override
    public String toString() {
        return "Predicate{" +
                "verb=" + verb1 +
                ", particle='" + particle + '\'' +
                '}';
    }
}
