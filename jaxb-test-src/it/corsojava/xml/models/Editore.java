package it.corsojava.xml.models;

import java.util.ArrayList;
import java.util.List;

public class Editore {

    private String denominazione;
    private List<Citta> citta;

    public Editore(){
        citta=new ArrayList<Citta>();
    }

    public List<Citta> getCitta() {
        return citta;
    }

    public void setCitta(List<Citta> citta) {
        this.citta = citta;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }
}
