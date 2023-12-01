package com.xl1.datastructure.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContactManager {

	public static void main(String[] args) {
		/**
		 * Projet : Gestionnaire de contacts avec ordre d'insertion
		 * Description : Ce projet simule un gestionnaire de contacts
		 *  où les contacts sont stockés dans une LinkedHashMap. Les 
		 *  contacts sont stockés dans l'ordre d'insertion, ce qui 
		 *  signifie que le dernier contact ajouté apparaît en haut de la liste.
		 * **/
		LinkedHashMap<String, Contact> contacts = new LinkedHashMap<>();

        // Ajout de contacts
        contacts.put("Alice", new Contact("Alice", "555-1234", "alice@example.com"));
        contacts.put("Bob", new Contact("Bob", "555-5678", "bob@example.com"));
        contacts.put("Eve", new Contact("Eve", "555-7890", "eve@example.com"));

        // Affichage des contacts dans l'ordre d'insertion
        System.out.println("Liste des contacts dans l'ordre d'insertion :");
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Suppression d'un contact
        contacts.remove("Bob");

        System.out.println("\nListe des contacts après suppression :");
        for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}

}
