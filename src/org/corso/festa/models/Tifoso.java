package org.corso.festa.models;


/**
 * Tifoso estende persona perché Tifoso 'IS A' Persona (Tifoso é una persona)
 * FIXME RM : non é verificato se la squadra passata come parametro é null nel costruttore
 */
public class Tifoso extends Persona {

    private Squadra squadra;  // in piú il tifoso, tifa almeno una squadra.

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
