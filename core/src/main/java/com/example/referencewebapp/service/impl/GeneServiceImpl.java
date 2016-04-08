package com.example.referencewebapp.service.impl;

import com.example.referencewebapp.model.Gene;
import com.example.referencewebapp.repository.GeneRepository;
import com.example.referencewebapp.service.GeneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ersin on 4/8/16.
 */
@Service
public class GeneServiceImpl implements GeneService {

    @Autowired
    private GeneRepository geneRepository;

    @Override
    public Gene getGene(String hugoGeneSymbol) {
        return geneRepository.findByHugoGeneSymbol(hugoGeneSymbol);
    }
}
