package com.xl1.datastructure.map;

import java.util.HashMap;
import java.util.Map;

public class StockManagementSystem {

	public static void main(String[] args) {
		/**
		 * Projet : Système de gestion de stock de produits
		 * Description : Ce projet simule un système de gestion de stock de produits
		 *  où les produits sont stockés dans une carte (Map) avec leur nom et leur quantité**/
		
		Map<String, Produit> stock = new HashMap<>();

        // Ajout de produits au stock
        stock.put("Ordinateur portable", new Produit("Ordinateur portable", 10, 799.99));
        stock.put("Smartphone", new Produit("Smartphone", 20, 499.99));
        stock.put("Tablette", new Produit("Tablette", 15, 299.99));

        // Affichage du stock
        System.out.println("Stock de produits :");
        for (Produit produit : stock.values()) {
            System.out.println(produit);
        }

        // Mise à jour de la quantité en stock d'un produit
        Produit laptop = stock.get("Ordinateur portable");
        laptop.setQuantiteEnStock(9); // Réduit la quantité en stock de 1

        System.out.println("\nStock après mise à jour :");
        for (Produit produit : stock.values()) {
            System.out.println(produit);
        }

	}

}
