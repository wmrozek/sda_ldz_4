package com.sda.javaldz4.biblioteka;

import com.sda.javaldz4.dodatkowe.Narzedzia;

import java.util.Queue;
import java.util.Set;

public class InterfejsUzytkownika {
    public static void main(String[] args) {
        Biblioteka b1 = new Biblioteka();
        Biblioteka b2 = new Biblioteka();
        dodajKsiazkiDoBibliotek(b1, b2);

        System.out.println(b1.pokazListeKsiazek());

        System.out.println(b2.pokazListeKsiazek());

//        Queue<Ksiazka> ksiazkiPoAutorze = b2.zwrocListeKsiazekWgKryterium(Kryterium.LICZBA_STRON, Porzadek.MALEJACO);
//        while(!ksiazkiPoAutorze.isEmpty()){
//            System.out.println(ksiazkiPoAutorze.poll());
//        }
        Set<Ksiazka> ksiazkiWB1 = b1.znajdzKsiazkePoFragmencieTytulu("a");
        System.out.println(ksiazkiWB1);

        Set<Ksiazka> ksiazkiWB2 = b2.znajdzKsiazkePoFragmencieTytulu("a");
        System.out.println(ksiazkiWB2);

    }

    private static void dodajKsiazkiDoBibliotek(Biblioteka b1, Biblioteka b2) {
        Ksiazka javaPodstawy = Narzedzia.utworzKsiazke("Ray", "Horstmann", 45,
                "Java Podstawy. Wydanie X", "1234567890", 989,
                Kategoria.IT);
        b1.dodajKsiazke(javaPodstawy);
        b1.dodajKsiazke(Narzedzia.utworzKsiazke("Cay", "Horstmann", 45,
                "Java Techniki Zaawansowane", "2345678901",
                944, Kategoria.IT));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Adam", "Mickiewicz", 219,
                "Pan Tadeusz", "4567890123", 300,
                Kategoria.EPOPEJA));
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Dan", "Brown", 55,
                "Inferno", "83838383838", 500, Kategoria.SCI_FI));
        b2.dodajKsiazke(javaPodstawy);
        b2.dodajKsiazke(Narzedzia.utworzKsiazke("Cay", "Horstmann", 45,
                "Java Techniki Zaawansowane", "2345678901",
                944, Kategoria.IT));

    }


}
