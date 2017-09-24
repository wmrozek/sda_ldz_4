package com.sda.javaldz4.tablice;

public class Tablice {
    public static void main(String[] args) {
//        przykladDeklaracjiTablic();
        wstawianiePobieranieWartosci();
    }

    private static void wstawianiePobieranieWartosci(){
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

    private static void przykladDeklaracjiTablic() {
        int[] liczbyCalkowite = new int[10];
        int[] liczbyCalkowite2 = {1,2,3,4,5,6};
        int[] liczbyCalkowite3 = new int[]{1,2,3,4,5,6,7,8};

        Integer[] liczbyCalkowiteInteger = new Integer[10];
        char[] liczbyCalkowiteChar = new char[10];

        wyswietlListe(liczbyCalkowite);
        for(int i =0; i<liczbyCalkowite2.length;i++){
            System.out.print(liczbyCalkowite2[i]+" ");
        }

        System.out.println("==========================");
        for(int i =0; i<liczbyCalkowite3.length;i++){
            System.out.print(liczbyCalkowite3[i]+" ");
        }

        System.out.println("==========================");
        for(int i =0; i<liczbyCalkowiteChar.length;i++){
            System.out.print(liczbyCalkowiteChar[i]+" ");
        }
    }

    public static void wyswietlListe(int[] lista) {
        for(int i = 0; i< lista.length; i++){
            System.out.print(lista[i]+" ");
        }
        System.out.println("\n==========================");
    }
}
