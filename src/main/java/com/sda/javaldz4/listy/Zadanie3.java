package com.sda.javaldz4.listy;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        int rozmiarListy = Integer.parseInt(args[0]);
        List<Integer> lista = wypelnijListe(rozmiarListy);
        System.out.println(lista);
        lista = coTrzeciaZwiekszamyOWartoscPoprzednika(lista);
        System.out.println(lista);
        lista = parzystaDzielimyPrzezDwa(lista);
        MinMaxSumList wyniki = zwrocMinMaxISumeElementowListy(lista);
        System.out.println(String.format(
                "Suma elementów listy: %d. Minimum: %d. Maksimum: %d",
                wyniki.getSuma(), wyniki.getMin(), wyniki.getMax()));

    }

    private static MinMaxSumList zwrocMinMaxISumeElementowListy(List<Integer> lista){
        int sum = lista.get(0);
        int min = lista.get(0);
        int max = lista.get(0);
        for (int i=1;i<lista.size();i++){
            int liczba = lista.get(i);
            sum+= liczba;
            if (liczba < min){
                min = liczba;
            }
            if (liczba > max){
                max = liczba;
            }
        }
        return new MinMaxSumList(sum, max, min);
    }

    private static List<Integer> parzystaDzielimyPrzezDwa(List<Integer> lista) {
        for (int i=0;i<lista.size();i++){
            if (lista.get(i)%2 == 0){
                lista.set(i, lista.get(i)/2);
            }
        }
        return lista;
    }

    private static List<Integer> coTrzeciaZwiekszamyOWartoscPoprzednika(List<Integer> lista) {
        for (int i=2;i<lista.size();i=i+3){
            lista.set(i, lista.get(i)+lista.get(i-1));
        }
        return lista;
    }

    private static List<Integer> wypelnijListe(int ileElementow) {
        List<Integer> listaElementow = new ArrayList<>(ileElementow);
        for (int i=0;i<ileElementow;i++){
            listaElementow.add(i+1);
        }
        return listaElementow;
    }
}
