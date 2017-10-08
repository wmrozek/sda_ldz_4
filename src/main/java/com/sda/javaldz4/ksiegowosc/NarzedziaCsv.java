package com.sda.javaldz4.ksiegowosc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NarzedziaCsv {
    public List<Map<String, Object>> wczytajCsvZPliku(String sciezkaDoPliku){
        List<Map<String, Object>> wyniki = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sciezkaDoPliku));
            String linia = reader.readLine();
            Map<String, Object> wiersz = new HashMap<>();
            String[] wierszTablica = linia.split(",");
            wiersz.put("Płeć", wierszTablica[0]);
            wiersz.put("Imię", wierszTablica[1]);
            wiersz.put("Nazwisko", wierszTablica[2]);
            wiersz.put("Miasto", wierszTablica[3]);
            wiersz.put("Ulica", wierszTablica[4]);
            wiersz.put("KodPocztowy", wierszTablica[5]);
            wiersz.put("Wiek",wierszTablica[8]);
            wiersz.put("DataUrodzenia",wierszTablica[9]);
            wiersz.put("Zawód",wierszTablica[10]);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
