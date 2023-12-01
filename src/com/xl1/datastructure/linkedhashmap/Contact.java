package com.xl1.datastructure.linkedhashmap;

public class Contact {
	private String nom;
    private String numeroTelephone;
    private String email;

    public Contact(String nom, String numeroTelephone, String email) {
        this.nom = nom;
        this.numeroTelephone = numeroTelephone;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + ", Téléphone : " + numeroTelephone + ", Email : " + email;
    }
}
