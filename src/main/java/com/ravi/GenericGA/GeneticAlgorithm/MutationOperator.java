package com.ravi.GenericGA.GeneticAlgorithm;

/**
 * Created by ravik on 11/02/2017.
 */
public interface MutationOperator {
    public Individual mutate(Individual parent);
}
