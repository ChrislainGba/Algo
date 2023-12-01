package com.xl1.datastructure.treeset;

public class Tache implements Comparable<Tache> {
    private String titre;
    private int priorite;

    public Tache(String titre, int priorite) {
        this.titre = titre;
        this.priorite = priorite;
    }

    public String getTitre() {
        return titre;
    }

    public int getPriorite() {
        return priorite;
    }

    @Override
    public int compareTo(Tache autreTache) {
        // Trie par ordre croissant de priorité
        return Integer.compare(this.priorite, autreTache.priorite);
    }

    @Override
    public String toString() {
        return "Tâche : " + titre + " (Priorité : " + priorite + ")";
    }
}
