package org.corso.festa.models;

import org.corso.festa.exceptions.SuperatoMassimoNrMaxInvitati;
import org.corso.festa.exceptions.TifosoDiUnaSquadraDiversaException;

import java.util.ArrayList;
import java.util.List;

public class FestaScudetto {

    private List<Tifoso> invitati;
    private Festa festa;
    private Squadra squadra;

    public FestaScudetto() {
        invitati = new ArrayList<>();
    }

    public FestaScudetto(Festa festa, Squadra squadra) {
        this();
        this.festa = festa;
        this.squadra = squadra;
        this.invitati = new ArrayList<>();
    }


    public void aggiungiTifoso(Tifoso tifoso) throws TifosoDiUnaSquadraDiversaException, SuperatoMassimoNrMaxInvitati {
        if (invitati.size()>=festa.getNrMaxInviti())
            throw new SuperatoMassimoNrMaxInvitati();

        if (!squadra.equals(tifoso.getSquadra()))
            throw new TifosoDiUnaSquadraDiversaException();

        invitati.add(tifoso);
    }


    /**
     * Questo metodo di stampa non andrebbe qui, ma per ora ce lo lasciamo
     * @param genere
     */
    public void stampaPartecipantiPerGenere(Genere genere) {
        System.out.println("====== tifosi " + (genere.equals(Genere.MASCHIO)?"Maschio ":"Femmina "));
        int nrInvitati = 0;
        for(Tifoso tifoso: invitati) {
            if (genere.equals(tifoso.getGenere())) {
                nrInvitati =+ nrInvitati + 1;
                System.out.println(tifoso);
            }
        }
        System.out.println("Nr totale di invitati:  " + nrInvitati);
    }


    public List<Tifoso> getInvitati() {
        return invitati;
    }

    public void setInvitati(List<Tifoso> invitati) {
        this.invitati = invitati;
    }

    public Squadra getSquadra() {
        return squadra;
    }

    public void setSquadra(Squadra squadra) {
        this.squadra = squadra;
    }

    public Festa getFesta() {
        return festa;
    }
}
