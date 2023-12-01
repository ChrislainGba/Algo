package com.xl1.datastructure.list;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

	public static void main(String[] args) {
		/**
		 * Projet : Gestionnaire de tâches
		 * Description : Ce projet simule un gestionnaire de tâches basique qui permet 
		 * d'ajouter, supprimer et afficher des tâches à faire à l'aide d'une liste.**/
		List<Tache> taches = new ArrayList<>();

        // Ajout de tâches
        taches.add(new Tache("Faire les courses", "Acheter du lait et des œufs"));
        taches.add(new Tache("Réviser pour l'examen", "Chapitres 5 à 8"));

        // Affichage des tâches
        System.out.println("Liste des tâches :");
        for (Tache tache : taches) {
            System.out.println(tache);
        }
        
        System.out.println(taches.get(0));

        // Suppression d'une tâche
        taches.remove(0); // Supprime la première tâche
        
        System.out.println(taches.get(0));

        System.out.println("\nListe des tâches après suppression :");
        for (Tache tache : taches) {
            System.out.println(tache);
        }
	}

}
