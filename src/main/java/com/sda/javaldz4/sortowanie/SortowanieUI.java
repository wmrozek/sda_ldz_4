package com.sda.javaldz4.sortowanie;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.sortowaniebabelkowe.SortowanieBabelkowe;
import com.sda.javaldz4.sortowanie.sortowanieprzezwstawianie.SortowaniePrzezWstawianie;
import com.sda.javaldz4.sortowanie.sortowanieprzezwybor.SortowaniePrzezWybor;
import com.sda.javaldz4.sortowanie.sortowanieprzezzliczanie.SortowaniePrzezZliczanie;
import com.sda.javaldz4.sortowanie.sortowanieszybkie.SortowanieSzybkie;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SortowanieUI {
    public static void main(String[] args) {
        int[] tablica = new int[100000];
        Random random = new Random();
        for (int i=0;i<100000;i++){
            tablica[i] = random.nextInt(10000);
        }

        Sortowanie[] sortowanie = new Sortowanie[5];
        sortowanie[0] = new SortowanieBabelkowe();
        sortowanie[1] = new SortowaniePrzezWstawianie();
        sortowanie[2] = new SortowaniePrzezZliczanie();
        sortowanie[3] = new SortowaniePrzezWybor();
        sortowanie[4] = new SortowanieSzybkie();

        for (Sortowanie algorytm : sortowanie){
            int[] kopia = kopiaTablicy(tablica);
//            wyswietlTablice(kopia);
            long start = System.currentTimeMillis();
            kopia = algorytm.sortuj(kopia, Porzadek.ROSNACO);
            long end = System.currentTimeMillis();
            System.out.println(String.format("Czas wykonania algorytmem %s: %s", algorytm.getClass().getName(), Long.toString(end-start)));
//            wyswietlTablice(kopia);
        }

//        wyswietlTablice(tablica);
//        Sortowanie sortowanie = new SortowanieBabelkowe();
//        Sortowanie sortowanie = new SortowaniePrzezWybor();
//        Sortowanie sortowanie = new SortowaniePrzezZliczanie();
//        Sortowanie sortowanie = new SortowanieSzybkie();
//        tablica = sortowanie.sortuj(tablica, Porzadek.ROSNACO);
//        wyswietlTablice(tablica);
    }

    private static int[] kopiaTablicy(int[] tablica){
        int[] kopia = new int[tablica.length];
        for (int i=0;i<tablica.length;i++){
            kopia[i] = tablica[i];
        }
        return kopia;
    }

    public static void wyswietlTablice(int[] tablica) {
        for (int elem : tablica) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
