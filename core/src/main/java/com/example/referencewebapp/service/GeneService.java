package com.example.referencewebapp.service;

import com.example.referencewebapp.model.Gene;

/**
 * Created by ersin on 4/8/16.
 */
public interface GeneService {
    Gene getGene(String hugoGeneSymbol);
}
