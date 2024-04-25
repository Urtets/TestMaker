package org.tester.nlp;

import edu.stanford.nlp.coref.data.CorefChain;
import edu.stanford.nlp.ie.util.RelationTriple;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.IndexedWord;
import edu.stanford.nlp.ling.TaggedWord;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.trees.Constituent;
import edu.stanford.nlp.trees.GrammaticalRelation;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.Pair;

import java.util.*;

public class MultipleFeatureExample {

    private static String text = "Joe Smith was born in California. " +
            "In 2017, he went to Paris, France in the summer. " +
            "His flight left at 3:00pm on July 10th, 2017. " +
            "After eating some escargot for the first time, Joe said, \"That was delicious!\" " +
            "He sent a postcard to his sister Jane Smith. " +
            "After hearing about Joe's trip, Jane decided she might go to France one day.";

    public static void main(String[] args) {

        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, pos, lemma, ner, parse, depparse, coref, kbp, quote");
        props.setProperty("coref.algorithm", "neural");

        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        CoreDocument document = new CoreDocument(text);

        String separator = "-----------------------------";
        pipeline.annotate(document);

        CoreLabel token = document.tokens().get(10);
        System.out.println("Token example:");
        System.out.println(token);
        System.out.println(separator);

        String sentenceText = document.sentences().get(2).text();
        System.out.println("Sentence exampla:");
        System.out.println(sentenceText);
        System.out.println(separator);

        CoreSentence sentence = document.sentences().get(1);
        List<String> posTags = sentence.posTags();
        System.out.println("pos tags example: ");
        System.out.println(posTags);
        System.out.println(separator);

        List<String> nerTags = sentence.nerTags();
        System.out.println("ner tag example: ");
        System.out.println(nerTags);
        System.out.println(separator);

        Tree consituencyParse = sentence.constituencyParse();
        System.out.println("Constituency parse example: ");
        System.out.println(consituencyParse);
        System.out.println(separator);

        SemanticGraph dependencyParse = sentence.dependencyParse();
        System.out.println("Dependency parse example: ");
        System.out.println(dependencyParse);
        System.out.println(separator);

        List<RelationTriple> relations = document.sentences().get(4).relations();
        System.out.println("Relation example: ");
        System.out.println(relations);
        System.out.println(separator);

        List<CoreEntityMention> entityMentions = sentence.entityMentions();
        System.out.println("Entity mentions example: ");
        System.out.println(entityMentions);
        System.out.println(separator);

//        CoreEntityMention originalEntityMention = document.sentences().get(1).entityMentions().get(0);
//        System.out.println("Original entity mention example: ");
//        System.out.println(originalEntityMention);
//        System.out.println("canonical entity mention example: ");
//        System.out.println(originalEntityMention.canonicalEntityMention().get());

        Map<Integer, CorefChain> corefChains = document.corefChains();
        System.out.println("coref chains for document example: ");
        System.out.println(corefChains);
        System.out.println(separator);

        List<CoreQuote> quotes = document.quotes();
        CoreQuote quote = quotes.get(0);
        System.out.println("quote example:");
        System.out.println(quote);
        System.out.println(separator);

    }
}
