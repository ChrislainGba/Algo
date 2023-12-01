package com.xl1.datastructure.map;

public class Produit {
	private String nom;
    private int quantiteEnStock;
    public void setQuantiteEnStock(int quantiteEnStock) {
		this.quantiteEnStock = quantiteEnStock;
	}

	private double prix;

    public Produit(String nom, int quantiteEnStock, double prix) {
        this.nom = nom;
        this.quantiteEnStock = quantiteEnStock;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return nom + " (En stock : " + quantiteEnStock + ", Prix : $" + prix + ")";
    }
}
