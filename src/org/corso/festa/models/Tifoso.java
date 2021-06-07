package org.corso.festa.models;

public class Tifoso extends Persona {

    private Squadra squadra;

    public Tifoso(String nome, String cognome, Genere genere, int eta, Squadra squadra) {
        super(nome, cognome, genere, eta);
        this.squadra = squadra;
    }

    public Squadra getSquadra() {
        return squadra;
    }

    public void setSquadra(Squadra squadra) {
        this.squadra = squadra;
    }

    @Override
    public String toString() {
        return this.getCognome() + " " + this.getNome() + " Tifoso della squadra " + squadra;
    }
}
