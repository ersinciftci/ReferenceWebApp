package com.example.referencewebapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ersin on 4/8/16.
 */
@Entity
public class Gene {

    @Id
    private int entrezGeneId;
    private String hugoGeneSymbol;
    private String type;
    private String cytoband;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getEntrezGeneId() {
        return entrezGeneId;
    }

    public void setEntrezGeneId(int entrezGeneId) {
        this.entrezGeneId = entrezGeneId;
    }

    public String getHugoGeneSymbol() {
        return hugoGeneSymbol;
    }

    public void setHugoGeneSymbol(String hugoGeneSymbol) {
        this.hugoGeneSymbol = hugoGeneSymbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCytoband() {
        return cytoband;
    }

    public void setCytoband(String cytoband) {
        this.cytoband = cytoband;
    }
}
