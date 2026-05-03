package org.htw.prog2.aufgabe1.analysis;

import org.htw.prog2.aufgabe1.files.MutationFile;
import org.htw.prog2.aufgabe1.files.SequenceFile;

import java.util.HashMap;

public abstract class SequenceAnalysis {

    String reference;
    SequenceFile sequences;
    MutationFile mutations;
    HashMap<String, Double> resistances = null;

    public SequenceAnalysis(String reference, SequenceFile sequences, MutationFile mutations) {
        this.reference = reference;
        this.sequences = sequences;
        this.mutations = mutations;
    }

    public abstract void calculateResistances();

    public HashMap<String, Double> getResistances() {
        if(this.resistances == null){
            calculateResistances();
        }
        return this.resistances;
    }

    public String getBestDrug() {
        return "";
    }

    public String getDrugDescriptions() {
        return "";
    }
}
