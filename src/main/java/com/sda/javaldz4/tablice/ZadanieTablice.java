package com.sda.javaldz4.tablice;

public class ZadanieTablice {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        tablica = wypelnijTablice(tablica);
        Tablice.wyswietlListe(tablica);
        tablica = zwiekszOWartoscPoprzednika(tablica);
        Tablice.wyswietlListe(tablica);
        tablica = podzielParzystaPrzezDwa(tablica);
        Tablice.wyswietlListe(tablica);
        int suma = sumaLiczbWTablicy(tablica);
        System.out.println("Suma elementów w tablicy: "+suma);
    }

    private static int[] wypelnijTablice(int[] tablica){
        for (int i=0;i<tablica.length;i++){
            tablica[i] = i+1;
        }
        return tablica;
    }

    private static int[] zwiekszOWartoscPoprzednika(int[] tablica){
        for(int i=2;i<tablica.length; i+=3){
            tablica[i] =  tablica[i] + tablica[i-1];
        }
        return tablica;
    }

    private static int[] podzielParzystaPrzezDwa(int[] tablica){
        for (int i=0; i<tablica.length; i++){
            if (tablica[i]%2 == 0){
                tablica[i] = tablica[i]/2;
            }
        }
        return tablica;
    }

    private static int sumaLiczbWTablicy(int[] tablica){
        int suma = 0;
        for (int i=0;i<tablica.length; i++){
            suma += tablica[i];
        }
        return suma;
    }
}
