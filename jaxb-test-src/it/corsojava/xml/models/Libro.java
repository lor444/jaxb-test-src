package it.corsojava.xml.models;

public class Libro {

    private String titolo;
    private Editore editore;
    private int annoEdizione;
    private String isbn;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Editore getEditore() {
        return editore;
    }

    public void setEditore(Editore editore) {
        this.editore = editore;
    }

    public int getAnnoEdizione() {
        return annoEdizione;
    }

    public void setAnnoEdizione(int annoEdizione) {
        this.annoEdizione = annoEdizione;
    }

    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
