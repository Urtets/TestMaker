package org.tester.PartsOfSentence;

import org.tester.POS.Adjective;
import org.tester.POS.Adverb;
import org.tester.POS.Determiner;
import org.tester.POS.Noun;

public class ObjectOfPredicate {

    private Noun noun;
    private Adjective adjective;
    private Determiner determiner;
    private Adverb adverb;

    public ObjectOfPredicate(Noun noun, Adjective adjective, Determiner determiner, Adverb adverb) {
        this.noun = noun;
        this.adjective = adjective;
        this.determiner = determiner;
        this.adverb = adverb;
    }

    public ObjectOfPredicate(Noun noun, Adjective adjective, Determiner determiner) {
        this.noun = noun;
        this.adjective = adjective;
        this.determiner = determiner;
    }

    public ObjectOfPredicate(Noun noun, Adjective adjective) {
        this.noun = noun;
        this.adjective = adjective;
    }

    public ObjectOfPredicate(Noun noun, Determiner determiner) {
        this.noun = noun;
        this.determiner = determiner;
    }

    public ObjectOfPredicate(Noun noun) {
        this.noun = noun;
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
        return "ObjectOfPredicate{" +
                "noun=" + noun +
                ", adjective=" + adjective +
                ", determiner=" + determiner +
                ", adverb=" + adverb +
                '}';
    }
}
