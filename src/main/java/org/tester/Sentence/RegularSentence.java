package org.tester.Sentence;

import org.tester.PartsOfSentence.*;

public class RegularSentence {
    private Subject subject;
    private Predicate predicate;
    private Complement complement;
    private ObjectOfPredicate objectOfPredicate;
    private Adverbial adverbial;
    private Adverbial adverbial2;
    private Adverbial adverbial3;

    public RegularSentence(Subject subject, Predicate predicate, ObjectOfPredicate objectOfPredicate) {
        this.subject = subject;
        this.predicate = predicate;
        this.objectOfPredicate = objectOfPredicate;
    }

    public RegularSentence(Subject subject, Predicate predicate, Complement complement) {
        this.subject = subject;
        this.predicate = predicate;
        this.complement = complement;
    }

    public RegularSentence(Subject subject, Predicate predicate, Adverbial adverbial) {
        this.subject = subject;
        this.predicate = predicate;
        this.adverbial = adverbial;
    }

    public RegularSentence(Subject subject, Predicate predicate, ObjectOfPredicate objectOfPredicate, Adverbial adverbial) {
        this.subject = subject;
        this.predicate = predicate;
        this.objectOfPredicate = objectOfPredicate;
        this.adverbial = adverbial;
    }

    public RegularSentence(Subject subject, Predicate predicate, Complement complement, Adverbial adverbial) {
        this.subject = subject;
        this.predicate = predicate;
        this.complement = complement;
        this.adverbial = adverbial;
    }

    public RegularSentence(Subject subject, Predicate predicate, ObjectOfPredicate objectOfPredicate, Adverbial adverbial, Adverbial adverbial2) {
        this.subject = subject;
        this.predicate = predicate;
        this.objectOfPredicate = objectOfPredicate;
        this.adverbial = adverbial;
        this.adverbial2 = adverbial2;
    }

    public RegularSentence(Subject subject, Predicate predicate, Complement complement, Adverbial adverbial, Adverbial adverbial2) {
        this.subject = subject;
        this.predicate = predicate;
        this.complement = complement;
        this.adverbial = adverbial;
        this.adverbial2 = adverbial2;
    }

    public RegularSentence(Subject subject, Predicate predicate, ObjectOfPredicate objectOfPredicate, Adverbial adverbial, Adverbial adverbial2, Adverbial adverbial3) {
        this.subject = subject;
        this.predicate = predicate;
        this.objectOfPredicate = objectOfPredicate;
        this.adverbial = adverbial;
        this.adverbial2 = adverbial2;
        this.adverbial3 = adverbial3;
    }

    public Subject getSubject() {
        return subject;
    }

    public Predicate getPredicate() {
        return predicate;
    }

    public Complement getComplement() {
        return complement;
    }

    public ObjectOfPredicate getObjectOfPredicate() {
        return objectOfPredicate;
    }

    public Adverbial getAdverbial() {
        return adverbial;
    }

    public Adverbial getAdverbial2() {
        return adverbial2;
    }

    public Adverbial getAdverbial3() {
        return adverbial3;
    }
}
