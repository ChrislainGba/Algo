package com.xl1.datastructure.list;

public class Tache {
	private String titre;
    private String description;

    public Tache(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return titre + " : " + description;
    }
}
