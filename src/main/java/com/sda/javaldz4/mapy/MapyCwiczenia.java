package com.sda.javaldz4.mapy;

import com.sda.javaldz4.biblioteka.Kategoria;
import com.sda.javaldz4.biblioteka.Ksiazka;
import com.sda.javaldz4.dodatkowe.Narzedzia;

import java.util.HashMap;
import java.util.Map;

public class MapyCwiczenia {
    public static void main(String[] args) {
        Map<String, Ksiazka> mapa = new HashMap<>();
        Ksiazka ksiazka1 = Narzedzia.utworzKsiazke("Adam",
                "Mickiewicz", 300,
                "Pan Tadeusz", "1234567890",
                400, Kategoria.EPOPEJA);
        Ksiazka ksiazka2 = Narzedzia.utworzKsiazke("Adam",
                "Mickiewicz", 300,
                "Dziady", "2345678901",
                400, Kategoria.EPOPEJA);
        mapa.put("1", ksiazka1);
        mapa.put("2", ksiazka2);
        Ksiazka poprzednia = mapa.put("1", ksiazka2);
        Ksiazka poprzedniaPod3 = mapa.put("3", ksiazka1);

        Ksiazka ksiazkaPod1 = mapa.get("1");

//        System.out.println(ksiazkaPod1);

//        mapa.remove("1");

        ksiazkaPod1 = mapa.get("1");

//        System.out.println(ksiazkaPod1);

        System.out.println("Mapa zawiera klucz 2: "
                +mapa.containsKey("2"));
        System.out.println("Mapa zawiera klucz 1: "
                +mapa.containsKey("1"));
        //Wyświetlamy wszystkie klucze znajdujące się w mapie
        System.out.println("Klucze");
        for (String key : mapa.keySet()){
            Ksiazka ksiazka = mapa.get(key);
            System.out.println(key);
        }
        System.out.println("Wartości");
        for (Ksiazka ksiazka : mapa.values()){
            System.out.println(ksiazka);
        }

        for(Map.Entry<String, Ksiazka> entry : mapa.entrySet()){
            System.out.println("Klucz: "+entry.getKey());
            System.out.println("Wartość: "+entry.getValue());
        }




//        System.out.println(mapa);

//        System.out.println(poprzedniaPod3);



    }
}
