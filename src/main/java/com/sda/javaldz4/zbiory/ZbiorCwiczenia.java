package com.sda.javaldz4.zbiory;

import com.sda.javaldz4.biblioteka.Kategoria;
import com.sda.javaldz4.biblioteka.Kryterium;
import com.sda.javaldz4.biblioteka.Ksiazka;
import com.sda.javaldz4.biblioteka.PorownywarkaKsiazek;
import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.dodatkowe.Narzedzia;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ZbiorCwiczenia {
    public static void main(String[] args) {
        Set<Ksiazka> hashSet = new HashSet<>();
//        Set<Ksiazka> treeSet = new TreeSet<>(new PorownywarkaKsiazek(Kryterium.TYTUL, Porzadek.MALEJACO));
        Set<Ksiazka> treeSet = new TreeSet<>();
        Ksiazka ksiazka = Narzedzia.utworzKsiazke("Adam", "Mickiewicz",
              219, "Pan Tadeusz", "1234567890",
                900, Kategoria.EPOPEJA  );
        Ksiazka ksiazka2 = Narzedzia.utworzKsiazke("Adam", "Mickiewicz",
                219, "Dziady", "1234567890",
                258, Kategoria.EPOPEJA  );
        Ksiazka ksiazka3 = Narzedzia.utworzKsiazke("Adam", "Mickiewicz",
                219, "Dziady", "1234567890",
                259, Kategoria.EPOPEJA  );
        Ksiazka ksiazka4 = Narzedzia.utworzKsiazke("Adam", "Mickiewicz",
                219, "Dziady", "1234567890",
                258, Kategoria.EPOPEJA  );
        System.out.println(ksiazka.equals(ksiazka2));
        hashSet.add(ksiazka);
        treeSet.add(ksiazka);
        hashSet.add(ksiazka2);
        treeSet.add(ksiazka2);
        hashSet.add(ksiazka3);
        treeSet.add(ksiazka3);
        hashSet.add(ksiazka4);
        treeSet.add(ksiazka4);

//        for(Ksiazka ks : hashSet){
//            System.out.println(ks);
//        }

//        Iterator<Ksiazka> iterator = hashSet.iterator();
//        while(iterator.hasNext()){
//            Ksiazka ks = iterator.next();
//            System.out.println(ks);
//        }

//        hashSet.remove(ksiazka);



        System.out.println(hashSet);
        System.out.println(treeSet);



    }
}
