package com.sda.javaldz4.sortowanie.sortowaniebabelkowe;

import com.sda.javaldz4.biblioteka.Porzadek;
import com.sda.javaldz4.sortowanie.Sortowanie;
import com.sda.javaldz4.sortowanie.SortowanieUI;

public class SortowanieBabelkowe implements Sortowanie{
    @Override
    public int[] sortuj(int[] tablicaElementow, Porzadek porzadek) {
//        int iloscOperacji = 0;
        for(int i=0; i<tablicaElementow.length;i++){
//            System.out.println("Biorę i-ty element tablicy: "+i+" - jest to liczba: "+tablicaElementow[i]);
            for(int j=i+1; j<tablicaElementow.length;j++){
//                System.out.println("Biorę j-ty element tablicy: "+j+" - jest to liczba: "+tablicaElementow[j]);
//                iloscOperacji++;
                if (i!=j){ //Nie chcemy porównywać tego samego elementu
                    switch (porzadek){
                        case ROSNACO:
//                            System.out.println(String.format("Porównuję, czy liczba %d < %d", tablicaElementow[j], tablicaElementow[i]));
                            //Czy element o indeksie 0 < element o indeksie 1 itd.
                            if(tablicaElementow[j] < tablicaElementow[i]){
//                                System.out.println("Zamieniam miejscami liczby");
//                                System.out.println(String.format("Indeksy i i j wskazują na liczby: %d, %d", tablicaElementow[i], tablicaElementow[j]));
                                //Zamień miejscami wartości w tablicy
                                int tmp = tablicaElementow[i];
                                tablicaElementow[i] = tablicaElementow[j];
                                tablicaElementow[j] = tmp;
//                                System.out.println(String.format("Indeksy i i j wskazują na liczby: %d, %d", tablicaElementow[i], tablicaElementow[j]));
                            }
                            break;
                        case MALEJACO:
                            //Czy element o indeksie 0 > element o indeksie 1 itd.
                            if(tablicaElementow[j] > tablicaElementow[i]){
                                //Zamień miejscami wartości w tablicy
                                int tmp = tablicaElementow[i];
                                tablicaElementow[i] = tablicaElementow[j];
                                tablicaElementow[j] = tmp;
                            }
                            break;
                    }

                }
            }
//            SortowanieUI.wyswietlTablice(tablicaElementow);
        }
//        System.out.println("Ilość operacji: "+iloscOperacji);
        return tablicaElementow;
    }
}
