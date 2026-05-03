package org.htw.prog2.aufgabe1.analysis;

import org.htw.prog2.aufgabe1.files.Mutation;
import org.htw.prog2.aufgabe1.files.MutationFile;
import org.htw.prog2.aufgabe1.files.SequenceFile;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FullLengthSequenceAnalysis extends SequenceAnalysis{

    public FullLengthSequenceAnalysis(String reference, SequenceFile sequences, MutationFile mutations){

        super(reference, sequences, mutations);


    }




    @Override
    public void calculateResistances() {

        HashMap<String, Double> result = new HashMap<>();

        for (String drug : mutations.getDrugs()) {
            result.put(drug, 0.0);
        }

        Set<String> keys = new HashSet<>();

        HashMap<String,Double> toCheckResistances;

        for(Mutation mutation : mutations.getMutations()){
            if(!sequences.containsSequence(mutation.getSequence(this.reference))) {
                continue;
            }
            toCheckResistances = mutation.getResistances();
            for(String drug : mutations.getDrugs()){
                if(toCheckResistances.get(drug)> result.get(drug)){
                    result.put(drug, toCheckResistances.get(drug));
                }
            }
        }

        this.resistances = result;
    }

}
