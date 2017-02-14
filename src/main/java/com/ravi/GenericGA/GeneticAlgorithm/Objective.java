package com.ravi.GenericGA.GeneticAlgorithm;

/**
 * Created by ravik on 12/02/2017.
 */
public interface Objective {
    public String getName();
    public double getFitness(Individual p);
}
