package org.tester.PartsOfSentence;

import org.tester.POS.*;

public class Adverbial {

    private Adverb adverb;
    private Preposition preposition;
    private Determiner determiner;
    private Noun noun;
    private Adjective adjective;

    public Adverbial(Adverb adverb, Preposition preposition, Determiner determiner, Noun noun, Adjective adjective) {
        this.adverb = adverb;
        this.preposition = preposition;
        this.determiner = determiner;
        this.noun = noun;
        this.adjective = adjective;
    }

    public Adverbial(Adverb adverb) {
        this.adverb = adverb;
    }

    public Adverbial(Preposition preposition, Noun noun) {
        this.preposition = preposition;
        this.noun = noun;
    }

    public Adverbial(Preposition preposition, Determiner determiner, Noun noun) {
        this.preposition = preposition;
        this.determiner = determiner;
        this.noun = noun;
    }

    public Adverbial(Preposition preposition, Determiner determiner, Noun noun, Adjective adjective) {
        this.preposition = preposition;
        this.determiner = determiner;
        this.noun = noun;
        this.adjective = adjective;
    }

    public Adverbial(Preposition preposition, Noun noun, Adjective adjective) {
        this.preposition = preposition;
        this.noun = noun;
        this.adjective = adjective;
    }

    public Adverb getAdverb() {
        return adverb;
    }

    public Preposition getPreposition() {
        return preposition;
    }

    public Determiner getDeterminer() {
        return determiner;
    }

    public Noun getNoun() {
        return noun;
    }

    public Adjective getAdjective() {
        return adjective;
    }

    @Override
    public String toString() {
        return "Adverbial{" +
                "adverb=" + adverb +
                ", preposition=" + preposition +
                ", determiner=" + determiner +
                ", noun=" + noun +
                ", adjective=" + adjective +
                '}';
    }
}
