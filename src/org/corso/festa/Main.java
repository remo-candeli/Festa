package org.corso.festa;

import org.corso.festa.exceptions.SuperatoMassimoNrMaxInvitati;
import org.corso.festa.exceptions.TifosoDiUnaSquadraDiversaException;
import org.corso.festa.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Tifoso> tifosi = new ArrayList<>();

        Festa festa = new Festa("Via delle vie", "Latina", 5);
        FestaScudetto festaScudetto = new FestaScudetto(festa, Squadra.FIORENTINA);

        creaTifosi(tifosi);

        esecuzione(festaScudetto, tifosi);
        festaScudetto.stampaPartecipantiPerGenere(Genere.MASCHIO);
        festaScudetto.stampaPartecipantiPerGenere(Genere.FEMMINA);
    }

    private static void esecuzione(FestaScudetto festaScudetto, List<Tifoso> tifosi) {
        System.out.println("=================================================");
        System.out.printf("Festa scudetto nella cittá di %s per la squadra %s", festaScudetto.getFesta().getCitta(), festaScudetto.getSquadra());
        System.out.println("\n=================================================");
        System.out.println();
        for(Tifoso tifoso: tifosi) {
            try {
                festaScudetto.aggiungiTifoso(tifoso);
            } catch (TifosoDiUnaSquadraDiversaException e) {
                System.out.printf("Il tifoso %s non é ammesso alla festa scudetto della squadra %s perché tifoso della squadra %s\n",
                        tifoso.getCognome(), festaScudetto.getSquadra().toString(), tifoso.getSquadra().toString());
            } catch (SuperatoMassimoNrMaxInvitati superatoMassimoNrMaxInvitati) {
                System.out.printf("Sono stati superati il nr massimo di inviati alla festa scudetto della squadra %s\n",
                        festaScudetto.getSquadra().toString());
            }
        }
    }


    private static void creaTifosi(List<Tifoso> tifosi) {
        tifosi.add(new Tifoso("Niels", "Bohr", Genere.MASCHIO, 55, Squadra.FIORENTINA));
        tifosi.add(new Tifoso("Marie", "Curie", Genere.FEMMINA, 76, Squadra.FIORENTINA));
        tifosi.add(new Tifoso("Albert", "Einstein", Genere.MASCHIO, 69, Squadra.FIORENTINA));
        tifosi.add(new Tifoso("Rosalind", "Franklin", Genere.FEMMINA, 88, Squadra.ROMA));
        tifosi.add(new Tifoso("Margherita", "Hack", Genere.FEMMINA, 59, Squadra.LAZIO));
        tifosi.add(new Tifoso("Isaac", "Newton", Genere.MASCHIO, 67, Squadra.FIORENTINA));
        tifosi.add(new Tifoso("Leonardo", "Da Vinci", Genere.MASCHIO, 71, Squadra.FIORENTINA));
        tifosi.add(new Tifoso("Galileo", "Galilei", Genere.MASCHIO, 81, Squadra.FIORENTINA));
        tifosi.add(new Tifoso("Niccoló", "Copernico", Genere.FEMMINA, 59, Squadra.LAZIO));
    }

}
