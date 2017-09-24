package com.sda.javaldz4.wielokrotnosc;

import java.util.Scanner;

public class WielokrotnoscLiczby {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        String liczbaUzytkownika = scanner.nextLine();
        try{
            Integer liczba = Integer.parseInt(liczbaUzytkownika);
            System.out.println("Podaj, którą wielokrotność liczby chcesz uzyskać.");
            liczbaUzytkownika = scanner.nextLine();
            Integer wielokrotnosc = Integer.parseInt(liczbaUzytkownika);
            if (wielokrotnosc >=0){
                int wynik = liczba * wielokrotnosc;
                System.out.println("Wynikiem jest liczba "+wynik);
            }else{
                System.out.println("Nie możemy wyświetlić ujemnej wielokrotności liczby.");
            }
        }catch(NumberFormatException e){
            System.out.println("Wprowadziłeś niepoprawne dane. Program zakończy pracę.");
        }
    }
}
