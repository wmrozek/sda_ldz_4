package com.sda.javaldz4.pesel;

import java.util.Scanner;

public class PeselUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj PESEL do weryfikacji: ");
        String pesel = scanner.nextLine();
        //Miejsce na wywołanie metody weryfikującej
        try {
            boolean poprawny = PeselWeryfikator.czyPoprawny(pesel);
            if (poprawny) {
                System.out.println("Podany PESEL jest prawidłowy");
            } else {
                System.out.println("Podany PESEL jest błędny");
            }
        } catch (Exception e) {
            if (e.getMessage().equalsIgnoreCase("wrong_number")) {
                System.out.println("Podany PESEL jest błędny. Przyczyna błędu: "
                        + "Numer PESEL nie zawiera 11 znaków");
            }
        }


    }
}
