package it.corsojava.xml;

import it.corsojava.xml.models.*;

import java.time.LocalDate;

public class BiblioLoader {

    public static Biblioteca loadBiblioteca(){

        Autore janeausten=new Autore();
        janeausten.setCognome("Austen");
        janeausten.setNome("Jane");
        janeausten.setDataNascita(LocalDate.parse("1775-12-16"));

        Autore conanddoyle=new Autore();
        conanddoyle.setCognome("Conan Doyle");
        conanddoyle.setNome("Arthur");
        conanddoyle.setDataNascita(LocalDate.parse("1859-05-22"));

        Citta newyork=new Citta(); newyork.setDenominazione("New York");
        Citta london=new Citta(); london.setDenominazione("London");
        Citta moskva=new Citta(); moskva.setDenominazione("Moskva");
        Citta paris=new Citta(); paris.setDenominazione("Paris");
        Citta marseille = new Citta(); marseille.setDenominazione("Marseille");

        Editore hachette = new Editore(); hachette.setDenominazione("Hachette"); hachette.getCitta().add(paris);hachette.getCitta().add(marseille);
        Editore chancellor = new Editore(); chancellor.setDenominazione("Chancellor"); chancellor.getCitta().add(london);
        Editore tekst=new Editore(); tekst.setDenominazione("Tekst");tekst.getCitta().add(moskva);
        Editore bountyBooks = new Editore(); bountyBooks.setDenominazione("Bounty Books"); bountyBooks.getCitta().add(newyork);
        Editore christianBourgois = new Editore(); christianBourgois.setDenominazione("Christian Bourgois"); christianBourgois.getCitta().add(paris);

        Libro l0=new Libro();
        l0.setTitolo("Through the Magic Door Illustrated");
        l0.setEditore(bountyBooks);
        l0.setIsbn("9798609179708");
        l0.setAnnoEdizione(2020);
        conanddoyle.getOpere().add(l0);

        Libro l1=new Libro();
        l1.setTitolo("The guards came through, and other poems");
        l1.setEditore(chancellor);
        l1.setIsbn("1591070341");
        l1.setAnnoEdizione(1919);
        conanddoyle.getOpere().add(l1);

        Libro l2=new Libro();
        l2.setTitolo("Bedside Austen");
        l2.setEditore(chancellor);
        l2.setIsbn("1851523588");
        l2.setAnnoEdizione(1993);
        janeausten.getOpere().add(l2);

        Libro l3=new Libro();
        l3.setTitolo("Love & Friendship (Collection of Letters / Love & Friendship / Three Sisters)");
        l3.setEditore(chancellor);
        l3.setIsbn("1843910608");
        l3.setAnnoEdizione(2003);
        janeausten.getOpere().add(l3);

        Libro l4=new Libro();
        l4.setTitolo("Novels (Northanger Abbey / <Pride> and Prejudice / Sense and Sensibility)");
        l4.setEditore(tekst);
        l4.setIsbn("5873228205");
        l4.setAnnoEdizione(1998);
        janeausten.getOpere().add(l4);


        Libro l5=new Libro();
        l5.setTitolo("Novels (Persuasion / Pride and Prejudice)");
        l5.setEditore(tekst);
        l5.setIsbn("585050317X");
        l5.setAnnoEdizione(1992);
        janeausten.getOpere().add(l5);

        Libro l6=new Libro();
        l6.setTitolo("The Great Keinplatz Experiment and Other Tales of Twilight and the Unseen");
        l6.setEditore(bountyBooks);
        l6.setIsbn("1532953372");
        l6.setAnnoEdizione(1919);
        conanddoyle.getOpere().add(l6);

        Libro l7=new Libro();
        l7.setTitolo("Novels (Northanger Abbey / Pride and Prejudice)");
        l7.setEditore(bountyBooks);
        l7.setIsbn("1851525467");
        l7.setAnnoEdizione(1861);
        janeausten.getOpere().add(l7);

        Libro l8=new Libro();
        l8.setTitolo("Lady Susan");
        l8.setEditore(christianBourgois);
        l8.setIsbn("2267019264");
        l8.setAnnoEdizione(2007);
        janeausten.getOpere().add(l8);

        Libro l9=new Libro();
        l9.setTitolo("Orgueil et prejuges");
        l9.setEditore(hachette);
        l9.setIsbn("2012035434");
        l9.setAnnoEdizione(2013);
        janeausten.getOpere().add(l9);

        Biblioteca biblos = new Biblioteca();
        biblos.getAutori().add(janeausten);
        biblos.getAutori().add(conanddoyle);

        return biblos;

    }
}
