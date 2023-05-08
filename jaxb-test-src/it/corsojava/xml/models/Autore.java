package it.corsojava.xml.models;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Autore {

    private String cognome;
    private String nome;
    private LocalDate dataNascita;
    private List<Libro> opere;

    public Autore(){
        opere=new ArrayList<Libro>();
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public List<Libro> getOpere() {
        return opere;
    }

    public String getFullName(){
        return cognome+" "+nome;
    }

    public void setOpere(List<Libro> opere) {
        this.opere = opere;
    }
}
