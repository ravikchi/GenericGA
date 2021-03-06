package com.ravi.GenericGA.GeneticAlgorithm.impl.NextGenSelectors;

import com.ravi.GenericGA.GeneticAlgorithm.Individual;
import com.ravi.GenericGA.GeneticAlgorithm.NextGenSelector;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ravik on 11/02/2017.
 */
public class ElitistNextGen implements NextGenSelector {

    public List<Individual> getNextGenPopulation(List<Individual> parentGen, List<Individual> childGen) {
        sortPopulation(parentGen);
        sortPopulation(childGen);

        if(childGen.get(0).getFitness() < parentGen.get(0).getFitness()){
            childGen.add(childGen.size()-1, parentGen.get(0));
        }

        sortPopulation(childGen);

        return childGen;
    }

    private void sortPopulation(List<Individual> population){
        Collections.sort(population, new Comparator<Individual>(){
            public int compare(Individual o1, Individual o2){
                if(o1.getFitness() == o2.getFitness())
                    return 0;
                return o1.getFitness() > o2.getFitness() ? -1 : 1;
            }
        });
    }
}
