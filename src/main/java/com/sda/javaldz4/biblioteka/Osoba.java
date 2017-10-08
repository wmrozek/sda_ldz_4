package com.sda.javaldz4.biblioteka;

import java.time.LocalDate;

public class Osoba {
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;


    public Osoba(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;

        if (!imie.equals(osoba.imie)) return false;
        return nazwisko.equals(osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        int result = imie.hashCode();
        result = 31 * result + nazwisko.hashCode();
        return result;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }
}
