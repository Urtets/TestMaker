package org.tester.Service;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.tester.POS.Adjective;
import org.tester.POS.Noun;
import org.tester.POS.POSInter;
import org.tester.nlp.Pipeline;

import java.util.ArrayList;
import java.util.List;

public class POSService {

    private List<POSInter> sentences = new ArrayList<>();
    public void processSentence(String sentence) {
        StanfordCoreNLP sentenceProcessor = Pipeline.getPipeline();
        CoreDocument coreDocument = new CoreDocument(sentence);
        sentenceProcessor.annotate(coreDocument);
        List<CoreLabel> coreLabels = coreDocument.tokens();

        for (CoreLabel coreLabel : coreLabels) {
            String pos = coreLabel.get(CoreAnnotations.PartOfSpeechAnnotation.class);

        }
    }

//    private void
}
