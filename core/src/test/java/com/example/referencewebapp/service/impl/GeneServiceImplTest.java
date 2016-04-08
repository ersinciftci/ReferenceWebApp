package com.example.referencewebapp.service.impl;

import com.example.referencewebapp.model.Gene;
import com.example.referencewebapp.repository.GeneRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by ersin on 4/8/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class GeneServiceImplTest {

    public static final String TEST_HUGO_GENE_SYMBOL = "ABCA1";
    public static final int TEST_ENTREZ_GENE_ID = 19;

    @InjectMocks
    private GeneServiceImpl geneService;
    @Mock
    private GeneRepository geneRepository;

    @Test
    public void getGene() throws Exception {

        Gene expectedGene = new Gene();
        expectedGene.setEntrezGeneId(TEST_ENTREZ_GENE_ID);
        Mockito.when(geneRepository.findByHugoGeneSymbol(TEST_HUGO_GENE_SYMBOL)).thenReturn(expectedGene);
        Gene resultGene = geneService.getGene(TEST_HUGO_GENE_SYMBOL);
        Assert.assertEquals(TEST_ENTREZ_GENE_ID, resultGene.getEntrezGeneId());
    }
}