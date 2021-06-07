package org.corso.festa.models;


public class Festa {

    private String indirizzo;
    private String citta;
    private int nrMaxInviti;


    public Festa(String indirizzo, String citta, int nrMaxInviti) {
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.nrMaxInviti = nrMaxInviti;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public int getNrMaxInviti() {
        return nrMaxInviti;
    }

    public void setNrMaxInviti(int nrMaxInviti) {
        this.nrMaxInviti = nrMaxInviti;
    }
}
