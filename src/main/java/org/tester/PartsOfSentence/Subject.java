package org.tester.PartsOfSentence;

import org.tester.POS.*;

public class Subject {

    private Noun noun;
    private Noun noun2;
    private Adjective adjective;
    private Determiner determiner;
    private Adverb adverb;
    private Conjunction conjunction;
    private Preposition preposition;
    private Pronoun pronoun;

    public Subject(POSInter pronounNoun) {
        if (pronounNoun instanceof Noun) {
            this.noun = (Noun) pronounNoun;
        }
        if (pronounNoun instanceof Pronoun) {
            this.pronoun = (Pronoun) pronounNoun;
        }
    }

    public Subject(POSInter adjectiveDeterminerNoun, POSInter noun) {
        this(noun);
        if (adjectiveDeterminerNoun instanceof Adjective) {
            this.adjective = (Adjective) adjectiveDeterminerNoun;
        } else if (adjectiveDeterminerNoun instanceof Determiner) {
            this.determiner = (Determiner) adjectiveDeterminerNoun;
        } else if (adjectiveDeterminerNoun instanceof Noun) {
            this.noun2 = (Noun) adjectiveDeterminerNoun;
        }

    }

    public Subject(POSInter determiner, POSInter adjective, POSInter noun) {
        this(adjective, noun);
        this.determiner = (Determiner) determiner;
    }

    public Noun getNoun() {
        return noun;
    }

    public Adjective getAdjective() {
        return adjective;
    }

    public Determiner getDeterminer() {
        return determiner;
    }

    public Adverb getAdverb() {
        return adverb;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "noun=" + noun +
                ", adjective=" + adjective +
                ", determiner=" + determiner +
                ", adverb=" + adverb +
                '}';
    }
}
