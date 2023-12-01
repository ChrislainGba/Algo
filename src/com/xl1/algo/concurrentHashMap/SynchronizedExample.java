package com.xl1.algo.concurrentHashMap;

import java.util.HashMap;
import java.util.Map;

public class SynchronizedExample {

	private Map<String, Integer> data = new HashMap<>();
    private Object lock = new Object();

    public void putData(String key, int value) {
        synchronized (lock) {
            data.put(key, value);
        }
    }

    public int getData(String key) {
        synchronized (lock) {
            return data.get(key);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();

        // Thread 1 : Ajout de données
        Thread thread1 = new Thread(() -> {
            example.putData("A", 1);
            example.putData("B", 2);
        });

        // Thread 2 : Accès aux données
        Thread thread2 = new Thread(() -> {
            int valueA = example.getData("A");
            int valueB = example.getData("B");
            System.out.println("Valeur de A : " + valueA);
            System.out.println("Valeur de B : " + valueB);
        });

        // Démarrage des threads
        thread1.start();
        thread2.start();

        // Attente de la fin des threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
