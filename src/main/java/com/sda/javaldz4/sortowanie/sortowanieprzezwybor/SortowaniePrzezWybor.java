package com.sda.javaldz4.sortowanie.sortowanieprzezwybor;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.Sortowanie;

public class SortowaniePrzezWybor implements Sortowanie{
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
        for (int i=0;i<tablicaElementow.length;i++){
            int min = tablicaElementow[i];
            int indexMinimum = i;
            for(int j=i+1;j<tablicaElementow.length;j++){
                //Szukamy najmniejszego elementu w tablicy
                if (tablicaElementow[j] < min){
                    min = tablicaElementow[j];
                    indexMinimum = j;
                }
            }
            //Zamieniamy miejscami minimum
            // i pierwszą liczbę w tablicy, od której zaczęła się iteracja
            tablicaElementow[indexMinimum] = tablicaElementow[i];
            tablicaElementow[i] = min;
        }
        return tablicaElementow;
    }
}
