package com.sda.javaldz4.tablice;

import java.util.Scanner;

public class Tab {
    public static void main(String[] args) {
        //deklaracjeTablic();
        // wstawianiePobieranieWartosci();
        int[] tablica1 = wypelnijTablice(10);
        int[] tablica2 = zwiekszanieOWartoscPoprzednika(tablica1);
        int[] tablica3 = parzysteDzielonePrzez2(tablica2);
        System.out.println("Suma elementów wynosi " + sumaElementów(tablica3));
        System.out.println("Ile elementów ciągu fibonacciego mam wyświetlić ?");
        Scanner s = new Scanner(System.in);
        int ileFibo = s.nextInt();
        wyswietlListe(fibo(ileFibo));
        System.out.println("Do jakiej liczby mam podać liczby pierwsze ?");
        int noPrimes = s.nextInt();
        long starttime = System.currentTimeMillis();
        wyswietlListe(primes(noPrimes));
        System.out.println("Wyswietlenie algorytmem n^2 zajelo " + (System.currentTimeMillis() - starttime) + " milisekund");
        starttime = System.currentTimeMillis();
        wyswietlListe(sito(noPrimes));
        System.out.println("Wyswietlenie algorytmem sita Erastotenesa zajelo " + (System.currentTimeMillis() - starttime) + " milisekund");
    }

    private static void wstawianiePobieranieWartosci() {
        int[] liczbyCalkowite = new int[10];
        liczbyCalkowite[1] = 20;
        liczbyCalkowite[5] = -23;
        liczbyCalkowite[0] = liczbyCalkowite[1] + liczbyCalkowite[5];
        wyswietlListe(liczbyCalkowite);
        //Zamiana wartości komórek
        int tmp = liczbyCalkowite[1];
        liczbyCalkowite[1] = liczbyCalkowite[5];
        liczbyCalkowite[5] = tmp;
        wyswietlListe(liczbyCalkowite);
    }

    private static void deklaracjeTablic() {
        Integer[] liczbyCalkowite = new Integer[10];
        int[] liczbyCalkowite2 = {1, 2, 3, 4, 5, 6};
        int[] liczbyCalkowite3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < liczbyCalkowite.length; i++) {
            System.out.print(liczbyCalkowite[i] + " ");
        }
        wyswietlListe(liczbyCalkowite);
        wyswietlListe(liczbyCalkowite2);
        wyswietlListe(liczbyCalkowite3);
    }

    private static void wyswietlListe(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != 0) {
                System.out.print(lista[i] + " ");
            }
        }
        System.out.println("\n=============================");
    }

    private static void wyswietlListe(Integer[] lista) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != 0) {
                System.out.print(lista[i] + " ");
            }
        }
        System.out.println("=============================");
    }

    private static void wyswietlListe(boolean[] lista) {
        for (int i = 2; i < lista.length; i++) {
            if (!lista[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n=============================");
    }

    private static int[] wypelnijTablice(int dlugosc) {
        int[] tablica = new int[dlugosc];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 1;
        }
        wyswietlListe(tablica);
        return tablica;
    }

    private static int[] zwiekszanieOWartoscPoprzednika(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            if (i % 3 == 2 && i != 0) {
                tablica[i] += tablica[i - 1];
            }
        }
        wyswietlListe(tablica);
        return tablica;
    }

    private static int[] parzysteDzielonePrzez2(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 2 == 0) {
                tablica[i] /= 2;
            }
        }
        wyswietlListe(tablica);
        return tablica;
    }

    private static int sumaElementów(int[] tablica) {
        int suma = 0;
        for (int i : tablica) {
            suma += i;
        }
        return suma;
    }

    private static int[] fibo(int dlugosc) {
        int[] fibo = new int[dlugosc];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < dlugosc; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
    }

    private static int[] primes(int zakres) {
        int[] primes = new int[zakres / 2];
        int index = 0;

        for (int i = 2; i < zakres; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes[index] = i;
                index++;

            }
        }
        return primes;
    }

    private static boolean[] sito(int zakres) {
        boolean[] primes = new boolean[zakres + 1];
        for (int i = 2; i <= zakres; i++) {
            if (primes[i] == true) {
                continue;
            }
            for (int j = i + i; j <= zakres; j += i) {
                if (primes[j]) {
                    continue;
                }
                primes[j] = true;

            }
        }
        return primes;
    }

}
