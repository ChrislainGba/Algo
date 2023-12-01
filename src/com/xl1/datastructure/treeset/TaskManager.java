package com.xl1.datastructure.treeset;

import java.util.TreeSet;

public class TaskManager {

	public static void main(String[] args) {
		/**
		 * Projet : Gestionnaire de tâches avec ordre de priorité
		 * Description : Ce projet simule un gestionnaire de tâches où les tâches sont stockées
		 * dans un TreeSet pour les trier automatiquement par ordre de priorité.
		 * **/
		TreeSet<Tache> taches = new TreeSet<>();

        // Ajout de tâches avec différentes priorités
        taches.add(new Tache("Faire les courses", 3));
        taches.add(new Tache("Réviser pour l'examen", 1));
        taches.add(new Tache("Appeler le client", 2));

        // Affichage des tâches triées par priorité
        System.out.println("Liste des tâches triées par priorité :");
        for (Tache tache : taches) {
            System.out.println(tache);
        }

        // Suppression de la tâche avec la priorité la plus élevée
        Tache tachePrioritaire = taches.pollFirst();

        System.out.println("\nTâche prioritaire supprimée : " + tachePrioritaire);
        
        

	}

}
