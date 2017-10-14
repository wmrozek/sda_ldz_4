package com.sda.javaldz4.sortowanie.sortowanieprzezzliczanie;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.Sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowaniePrzezZliczanie implements Sortowanie{
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        int max =0;
        for(int i=0;i<tablicaElementow.length;i++){
            if (tablicaElementow[i] > max){
                max = tablicaElementow[i];
            }
        }
        int[] zliczanieElementow = new int[max+1];
        for(int i=0;i<tablicaElementow.length;i++){
            int liczba = tablicaElementow[i];
            zliczanieElementow[liczba] += 1;
        }

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<zliczanieElementow.length;i++){
            for(int j=0;j<zliczanieElementow[i];j++){
                list.add(i);
            }
        }

        for (int i=0;i<list.size();i++){
            tablicaElementow[i] = list.get(i);
        }

        return tablicaElementow;
    }
}
