package com.sda.javaldz4.biblioteka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Biblioteka {
    private List<Ksiazka> listaKsiazek;

    private Map<Ksiazka, List<Osoba>> rejestrCzytelnikow;

    public Biblioteka() {
        this.listaKsiazek = new ArrayList<>();
        this.rejestrCzytelnikow = new HashMap<>();
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (ksiazka != null) {
            listaKsiazek.add(ksiazka);
        }
    }

    public void zapiszCzytelnika(Ksiazka wypozyczonaKsiazka,
                                 Osoba czytelnik) {
        if (rejestrCzytelnikow.containsKey(wypozyczonaKsiazka)) {
            rejestrCzytelnikow.get(wypozyczonaKsiazka).add(czytelnik);
        } else {
            rejestrCzytelnikow.put(wypozyczonaKsiazka,
                    new ArrayList<Osoba>());
            rejestrCzytelnikow.get(wypozyczonaKsiazka).add(czytelnik);
        }
    }

    public List<String> pokazCzytelnikowWgKsiazki(Ksiazka ksiazka) {
        List<String> wyniki = new ArrayList<>();
        if (rejestrCzytelnikow.containsKey(ksiazka)) {
            List<Osoba> osobyZRejestru = rejestrCzytelnikow.get(ksiazka);
            for (Osoba osoba : osobyZRejestru) {
                wyniki.add(osoba.getImie() + " " + osoba.getNazwisko());
            }
            return wyniki;
        } else {
            return wyniki;
        }
    }

    public List<Ksiazka> zwrocListeKsiazekPrzeczytanychPrzezCzytelnika(Osoba osoba) {
        List<Ksiazka> wyniki = new ArrayList<>();
        for(Ksiazka ksiazka : rejestrCzytelnikow.keySet()){
            List<Osoba> czytelnicy = rejestrCzytelnikow.get(ksiazka);
            for(int i=0;i<czytelnicy.size();i++){
                if (czytelnicy.get(i).equals(osoba)){
                   wyniki.add(ksiazka);
                   break;
                }
            }
        }
        return wyniki;
    }

    public Map<Ksiazka, Integer> zwrocKsiazkiPrzeczytanePrzezOsobeIIloscRazy(Osoba osoba){
        Map<Ksiazka, Integer> wyniki = new HashMap<>();
        for(Ksiazka ksiazka : rejestrCzytelnikow.keySet()){
            List<Osoba> czytelnicy = rejestrCzytelnikow.get(ksiazka);
            for (Osoba czytelnik : czytelnicy){
                if (czytelnik.equals(osoba)){
                    if (wyniki.containsKey(ksiazka)){
                        Integer poprzedniaWartosc = wyniki.get(ksiazka);
                        wyniki.put(ksiazka, poprzedniaWartosc+1);
                    }else{
                        wyniki.put(ksiazka, 1);
                    }
                }
            }
        }
        return wyniki;
    }

    public List<String> pokazListeKsiazek() {
        List<String> wynik = new ArrayList<>();
        for (Ksiazka ksiazka : listaKsiazek) {
            String opis = String.format("%s, %s. %s",
                    ksiazka.getAutor().toString(), ksiazka.getTytul(),
                    ksiazka.getKategoria().getCzytelnaNazwa());
            wynik.add(opis);
        }
        return wynik;
    }

    public Queue<Ksiazka> zwrocListeKsiazekWgKryterium(Kryterium kryterium, Porzadek porzadek) {
        PorownywarkaKsiazek porownywarka = new PorownywarkaKsiazek(kryterium, porzadek);
        Queue<Ksiazka> wynik = new PriorityQueue<>(porownywarka);
        wynik.addAll(listaKsiazek);
        return wynik;
    }


    public Set<Ksiazka> znajdzKsiazkePoFragmencieTytulu(String fragment) {
        Set<Ksiazka> wyniki = new TreeSet<>();
        for (Ksiazka ksiazka : listaKsiazek) {
            if (ksiazka.getTytul().contains(fragment)) {
                wyniki.add(ksiazka);
            }
        }
        return wyniki;
    }


}
