package com.example.referencewebapp.rest;

import com.example.referencewebapp.model.Gene;
import com.example.referencewebapp.service.GeneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ersin on 4/8/16.
 */
@RestController
public class GeneController {

    @Autowired
    private GeneService geneService;

    @RequestMapping(method = RequestMethod.GET, value = "/gene")
    public Gene getGene(@RequestParam String hugoGeneSymbol) {
        return geneService.getGene(hugoGeneSymbol);
    }
}
