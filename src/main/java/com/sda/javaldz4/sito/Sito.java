package com.sda.javaldz4.sito;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sito {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            lista.add(i + 1);
        }
        List<Integer> prim = lista.stream().filter(liczba -> {
            List<Integer> zlozone = new ArrayList<>();
            for (Integer numer : lista) {
                List<Integer> comp = lista.stream().filter(liczba1 -> liczba1 % numer == 0&&liczba1>numer&&numer>1).collect(Collectors.toList());
                zlozone.addAll(comp);
            }
            return !zlozone.contains(liczba);

        }).collect(Collectors.toList());
        System.out.println(prim);
    }
}
