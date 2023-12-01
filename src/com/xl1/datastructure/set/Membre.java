package com.xl1.datastructure.set;

import java.util.Objects;

public class Membre {
	private String nom;
    private int numeroAdherent;

    public Membre(String nom, int numeroAdherent) {
        this.nom = nom;
        this.numeroAdherent = numeroAdherent;
    }

    public String getNom() {
        return nom;
    }

    public int getNumeroAdherent() {
        return numeroAdherent;
    }

    @Override
    public String toString() {
        return numeroAdherent + ": " + nom;
    }
    /**
     * La classe Membre doit correctement implémenter les méthodes equals()
     *  et hashCode() pour que HashSet puisse identifier les doublons. 
     * **/
    
    @Override
    public boolean equals(Object o) {
    	if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membre membre = (Membre) o;
        return numeroAdherent == membre.numeroAdherent;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(numeroAdherent);
    }
}
