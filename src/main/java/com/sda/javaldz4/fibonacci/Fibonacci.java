package com.sda.javaldz4.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        String liczbaUzytkownika = scanner.nextLine();
        try {
            Integer liczba = Integer.parseInt(liczbaUzytkownika);
            if (liczba < 0){
                System.out.println("Ciąg Fibonacciego zawiera tylko elementy naturalne");
                return;
            }
            fibonacciIteracyjnie(liczba);
            int wynik = fibonacciRekurencyjnie(liczba);
            System.out.println("Ostatni element ciągu to "+wynik);
        }catch(NumberFormatException e){
            System.out.println("Niepoprawne dane");
        }
    }

    public static void fibonacciIteracyjnie(int liczbaElementow){
        int ostatnia =1;
        int przedostatnia =1;
        for (int i = 0; i<liczbaElementow; i++){
            if (i < 2){
                System.out.println(String.format("%d element ciągu jest równy %d",  i, 1));
            }else{
                int wynik = ostatnia + przedostatnia;
                przedostatnia = ostatnia;
                ostatnia = wynik;
                System.out.println(String.format("%d element ciągu jest równy %d", i, wynik));
            }
        }
    }

    public static int fibonacciRekurencyjnie(int liczbaElementow){
        if (liczbaElementow == 0 || liczbaElementow == 1){
            return 1;
        }
        int wynik = fibonacciRekurencyjnie(liczbaElementow - 1) + fibonacciRekurencyjnie(liczbaElementow - 2);
        return wynik;

    }
}
