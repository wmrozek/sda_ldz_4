package com.sda.javaldz4.biblioteka;

public class Ksiazka implements Comparable<Ksiazka>{
    private String tytul;
    private Integer liczbaStron;
    private String isbn;
    private Autor autor;
    private Kategoria kategoria;

    public Ksiazka(String tytul, Integer liczbaStron, String isbn, Autor autor, Kategoria kategoria) {
        this.tytul = tytul;
        this.liczbaStron = liczbaStron;
        this.isbn = isbn;
        this.autor = autor;
        this.kategoria = kategoria;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Integer getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(Integer liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", liczbaStron=" + liczbaStron +
                ", isbn='" + isbn + '\'' +
                ", autor=" + autor +
                ", kategoria=" + kategoria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ksiazka ksiazka = (Ksiazka) o;

        return compareTo(ksiazka) == 0;
    }

    @Override
    public int hashCode() {
        int result = liczbaStron.hashCode();
        return result;
    }

    @Override
    public int compareTo(Ksiazka o) {
        return this.tytul.compareTo(o.tytul);
    }
}
