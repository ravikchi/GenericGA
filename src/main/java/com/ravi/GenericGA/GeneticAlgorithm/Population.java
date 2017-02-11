package com.ravi.GenericGA.GeneticAlgorithm;

import com.ravi.GenericGA.GeneticAlgorithm.Exceptions.GAException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ravik on 11/02/2017.
 */
public abstract class Population {
    private GAOperators operators;
    private NextGenSelector nextGenSelector;
    private List<Individual> population = new ArrayList<Individual>();
    private int n;

    public Population(GAOperators operators, NextGenSelector nextGenOperator) {
        this.operators = operators;
        this.nextGenSelector = nextGenOperator;
    }

    public List<Individual> getPopulation() {
        return population;
    }

    public void setPopulation(List<Individual> population) {
        this.population = population;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public List<Individual> nextGeneration() throws GAException {
        if(population.isEmpty()){
            throw new GAException("Population is Empty");
        }
        List<Individual> nextGen = new ArrayList<Individual>();
        while(nextGen.size() < n){
            nextGen.add(operators.produceChild(population));
        }

        return nextGenSelector.getNextGenPopulation(population, nextGen);
    }

    public abstract void printStatistics();
}
