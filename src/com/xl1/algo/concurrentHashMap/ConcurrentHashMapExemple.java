package com.xl1.algo.concurrentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Création d'une ConcurrentHashMap
		ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Ajout d'éléments à la carte
        concurrentMap.put("A", 1);
        concurrentMap.put("B", 2);
        concurrentMap.put("C", 3);

        // Affichage de la carte avant la modification
        System.out.println("ConcurrentHashMap avant la modification : " + concurrentMap);

        // Modification d'une valeur
        concurrentMap.put("A", 100);

        // Affichage de la carte après la modification
        System.out.println("ConcurrentHashMap après la modification : " + concurrentMap);

        // Suppression d'une clé
        concurrentMap.remove("B");

        // Affichage de la carte après la suppression
        System.out.println("ConcurrentHashMap après la suppression : " + concurrentMap);

        // Accès concurrent à la carte
        Runnable runnable = () -> {
            for (int i = 0; i < 100000000; i++) {
                concurrentMap.put("X", i);
            }
        };

        // Création de plusieurs threads pour mettre à jour la carte simultanément
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

        // Attente de la fin des threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Affichage de la carte après les mises à jour concurrentes
        System.out.println("ConcurrentHashMap après les mises à jour concurrentes : " + concurrentMap);

	}

}
