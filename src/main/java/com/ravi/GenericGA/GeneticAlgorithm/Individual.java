package com.ravi.GenericGA.GeneticAlgorithm;

import java.util.List;

/**
 * Created by ravik on 11/02/2017.
 */
public interface Individual {
    public double getFitness();
    public double getFitness(Objective o);
    public String getChromosome();
    public List<Object> getPhenoType();
    public int geneSize();
    public Converter getConverter();
}
