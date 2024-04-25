package org.tester.PartsOfSentence;

import org.tester.POS.Adjective;
import org.tester.POS.Determiner;
import org.tester.POS.Noun;

public class Complement {

    private Adjective adjective;
    private Determiner determiner;
    private Noun noun;


    public Complement(Adjective adjective, Determiner determiner, Noun noun) {
        this.adjective = adjective;
        this.determiner = determiner;
        this.noun = noun;
    }


    public Complement(Adjective adjective) {
        this.adjective = adjective;
    }

    public Complement(Determiner determiner, Noun noun) {
        this.determiner = determiner;
        this.noun = noun;
    }

    public Complement(Noun noun) {
        this.noun = noun;
    }

    public Adjective getAdjective() {
        return adjective;
    }

    public Determiner getDeterminer() {
        return determiner;
    }

    public Noun getNoun() {
        return noun;
    }

    @Override
    public String toString() {
        return "Complement{" +
                "adjective=" + adjective +
                ", determiner=" + determiner +
                ", noun=" + noun +
                '}';
    }
}
