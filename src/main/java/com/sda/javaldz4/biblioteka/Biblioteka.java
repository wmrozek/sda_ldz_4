package com.sda.javaldz4.biblioteka;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Biblioteka {
    private List<Ksiazka> listaKsiazek;

    public Biblioteka(){
        this.listaKsiazek = new ArrayList<>();
    }

    public void dodajKsiazke(Ksiazka ksiazka){
        if(ksiazka != null){
            listaKsiazek.add(ksiazka);
        }
    }

    public List<String> pokazListeKsiazek(){
        List<String> wynik = new ArrayList<>();
        for (Ksiazka ksiazka : listaKsiazek){
            String opis = String.format("%s, %s. %s",
                    ksiazka.getAutor().toString(), ksiazka.getTytul(),
                    ksiazka.getKategoria().getCzytelnaNazwa());
            wynik.add(opis);
        }
        return wynik;
    }

    public Queue<Ksiazka> zwrocListeKsiazekWgKryterium(Kryterium kryterium, Porzadek porzadek){
        PorownywarkaKsiazek porownywarka = new PorownywarkaKsiazek(kryterium, porzadek);
        Queue<Ksiazka> wynik = new PriorityQueue<>(porownywarka);
        wynik.addAll(listaKsiazek);
        return wynik;
    }


    public Set<Ksiazka> znajdzKsiazkePoFragmencieTytulu(String fragment){
        Set<Ksiazka> wyniki = new TreeSet<>();
        for(Ksiazka ksiazka : listaKsiazek){
            if (ksiazka.getTytul().contains(fragment)){
                wyniki.add(ksiazka);
            }
        }
        return wyniki;
    }





}
