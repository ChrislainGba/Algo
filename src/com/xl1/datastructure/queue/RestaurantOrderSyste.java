package com.xl1.datastructure.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RestaurantOrderSyste {

	public static void main(String[] args) {
		/**
		 * Projet : Système de gestion de commandes de restaurant
		 * Description : Ce projet simule un système de gestion de commandes pour un restaurant
		 *  où les commandes sont prises en file d'attente (Queue) et traitées dans l'ordre. **/
		Queue<Commande> ordersQueue = new LinkedList<>();

        // Ajout de quelques commandes à la file d'attente
        ordersQueue.offer(new Commande(1, List.of("Pizza", "Salade")));
        ordersQueue.offer(new Commande(2, List.of("Burger", "Frites")));
        ordersQueue.offer(new Commande(3, List.of("Pâtes", "Soda")));

        // Traitement des commandes
        while (!ordersQueue.isEmpty()) {
        	System.out.println("nobre de commandes à traiter: "+ordersQueue.size());
            Commande commande = ordersQueue.poll();
            System.out.println("Commande en cours : " + commande);
            // Ici, vous pouvez implémenter la logique de préparation de la commande
        }

        System.out.println("Toutes les commandes ont été traitées.");

	}

}
