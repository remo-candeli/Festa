package org.corso.festa.models;

public class Persona {

    private String nome;
    private String cognome;
    private Genere genere;
    private int eta;

    public Persona() {
    }

    public Persona(String nome, String cognome, Genere genere, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

}
