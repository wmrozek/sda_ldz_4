package com.sda.javaldz4.ksiegowosc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Interfejs {
    public static void main(String[] args) {
        String sciezkaDoPliku = "E:/Baza/baza.csv";
        List<Map<String, Object>> wierszePliku = NarzedziaCsv.wczytajCsvZPliku(sciezkaDoPliku);
//        System.out.println(wierszePliku.get(0));
        List<Persona> osoby = NarzedziaCsv.zamienMapeNaPersone(wierszePliku);

//        //Wszystkie osoby o imieniu Dariusz
//        List<Persona> adamowie = osoby.stream().filter(persona -> persona.getImie().equals("Dariusz")).collect(Collectors.toList());
//        wyswietlListe(adamowie);
//        System.out.println(adamowie.size());
//
//        //Zwracamy wszystkie nazwiska
//        List<String> nazwiska = osoby.stream().map(persona -> persona.getNazwisko()).collect(Collectors.toList());
//        System.out.println(nazwiska);
//        Set<String> nazwiskaUnikalne = osoby.stream().map(persona -> persona.getNazwisko()).collect(Collectors.toSet());
//        System.out.println(nazwiskaUnikalne);

        //Pierwsze 20 osób z najwyższymi dochodami
        List<Persona> burzuje = osoby.stream().sorted((o1, o2) -> o2.getZarobki().compareTo(o1.getZarobki()))
                .limit(20).collect(Collectors.toList());
        wyswietlListe(burzuje);
        System.out.println("=========================");
        //Innym sposobem
        List<Persona> copy = new ArrayList<>(osoby);
        Collections.sort(copy, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getZarobki().compareTo(o1.getZarobki());
            }
        });
        int from = 0;
        int to = 20;
        List<Persona> burzujePoNowemu = copy.subList(from, to);
        wyswietlListe(burzujePoNowemu);

        int[] wynik = osoby.stream().map(persona -> {
            if (persona.getPlec().equals(Plec.KOBIETA)){
                return new int[]{1,0};
            }else{
                return new int[]{0,1};
            }
        }).reduce(new int[2], (a,b) -> {
            a[0] = a[0] + b[0]; //ilość kobiet
            a[1] = a[1] + b[1]; //ilość mężczyzn
            return a;
        });

        System.out.println(wynik[0] + " "+wynik[1]);



    }

    private static void wyswietlListe(List<Persona> lista){
        for (Persona persona : lista){
            System.out.println(persona);
        }
    }
}
