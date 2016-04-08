package com.example.referencewebapp.repository;

import com.example.referencewebapp.model.Gene;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ersin on 4/8/16.
 */
public interface GeneRepository extends CrudRepository<Gene, Integer> {

    Gene findByHugoGeneSymbol(String hugoGeneSymbol);
}
