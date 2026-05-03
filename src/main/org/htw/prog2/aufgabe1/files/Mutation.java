package org.htw.prog2.aufgabe1.files;

import java.util.HashMap;

public class Mutation {
    String variant;
    HashMap<String,Double> resistances;

    public Mutation(String variant, HashMap<String, Double> resistances){
        this.variant = variant;
        this.resistances = resistances;
    }

    public String getVariant(){

        return "";
    }

    public HashMap<String, Double> getResistances(){

        return resistances;
    }



}
