package it.corsojava.xml.models;

import jakarta.xml.bind.annotation.XmlAttribute;

public class Citta {

    private String denominazione;

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }
}
