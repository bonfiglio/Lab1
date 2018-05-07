package it.polito.tdp.parole.model;


import java.util.*;

public class Parole {

    private String par;
    private List<String> elenco = new ArrayList<String>();

    public Parole() {
        //TODO
    }

    public boolean addParola(String p) {
        //TODO
        if (!elenco.contains(p))
            return elenco.add(p);
        return false;
    }
    public boolean contieneParola(String p) {
       return (elenco.contains(p));
    }
    public List<String> getElenco() {
        //TODO
        Collections.sort(elenco);
        return elenco;
    }

    public void reset() {
        // TODO
        elenco.clear();
    }

    public void cancella(String p) {
        elenco.remove(p);
    }






}