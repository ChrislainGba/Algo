package com.xl1.datastructure.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ClubMembershipSystem {

	public static void main(String[] args) {
		/** Projet : Système de gestion de membres de club sportif
		 * Description : Ce projet simule un système de gestion des membres d'un club sportif
		 *  à l'aide d'un ensemble (Set) pour éviter les doublons et gérer efficacement les membres.
		 * **/
		
		Set<Membre> membres = new LinkedHashSet<>();

        // Ajout de membres au club
		// Ajout de membres au club
        membres.add(new Membre("Alice", 1001));
        membres.add(new Membre("Carol", 1002));
        membres.add(new Membre("Eve", 1003));
        membres.add(new Membre("Tom", 1005));
        membres.add(new Membre("Bob", 1004));
        
        List<Membre> list = new ArrayList<Membre>(membres);
        System.out.println(list.toString());

        // Tentative d'ajout d'un membre avec le même numéro d'adhérent
        boolean added = membres.add(new Membre("Carl", 1002)); // Ne sera pas ajouté en raison du même numéro d'adhérent

        System.out.println("Ajout de Carol réussi : " + added); // Imprime "Ajout de Carol réussi : false"

        // Affichage des membres du club
        System.out.println("Membres du club :");
        for (Membre membre : membres) {
            System.out.println(membre);
        }

	}

}
