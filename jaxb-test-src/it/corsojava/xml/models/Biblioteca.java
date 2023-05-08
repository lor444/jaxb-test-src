package it.corsojava.xml.models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Autore> autori;

    public Biblioteca(){
        autori=new ArrayList<Autore>();
    }

    public List<Autore> getAutori() {
        return autori;
    }

    public void setAutori(List<Autore> autori) {
        this.autori = autori;
    }
}
