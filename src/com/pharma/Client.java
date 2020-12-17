package com.pharma;

public class Client extends Pharmacien {

    private int Ventes;

    public Client(int id, String firstname, String lastname, int phone, String email, int Ventes) {
        super(id, firstname, lastname, phone, email);
        this.Ventes = Ventes;
    }

    public int getSomeVente() {
        return Ventes;
    }

    public void setSomeVente(int Ventes) {
        this.Ventes = Ventes;
    }
}
