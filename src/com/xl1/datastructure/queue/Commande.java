package com.xl1.datastructure.queue;

import java.util.List;

public class Commande {
    private int numeroTable;
    private List<String> articles;

    public Commande(int numeroTable, List<String> articles) {
        this.numeroTable = numeroTable;
        this.articles = articles;
    }


	public int getNumeroTable() {
        return numeroTable;
    }

    public List<String> getArticles() {
        return articles;
    }

    @Override
    public String toString() {
        return "Table " + numeroTable + ": " + articles;
    }
}