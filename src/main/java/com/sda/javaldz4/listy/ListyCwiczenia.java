package com.sda.javaldz4.listy;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListyCwiczenia {
    public static void main(String[] args) {
//        tworzenieList();
//        dodawanieElementowDoList();
//        zamianaMiejscNaLiscie();
        iterowaniePoLiscie();
    }

    private static void iterowaniePoLiscie() {
        List<Integer> listaLiczb = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            int liczba = random.nextInt(200);
            listaLiczb.add(liczba);
        }

        for(int i=0;i<listaLiczb.size();i++){
            System.out.println(String.format("%d element listy wynosi %d", i, listaLiczb.get(i)));
        }

        for(Integer liczba : listaLiczb){
            System.out.println(String.format("Kolejny element listy to: %d", liczba));
        }

        Iterator<Integer> iterator = listaLiczb.iterator();
        while(iterator.hasNext()){
            Integer liczba = iterator.next();
            System.out.println("Wartość pobrana z iteratora: "+liczba);
        }

    }

    private static void zamianaMiejscNaLiscie(){
        List<Integer> listaLiczb = new ArrayList<>();
        for (int i=20;i>10;i--){
            listaLiczb.add(i);
        }
        System.out.println(listaLiczb);
        //Zamieniamy miejscami liczbę 13 i 18
        int liczba13 = listaLiczb.get(7);
        int liczba18 = listaLiczb.get(2);
        listaLiczb.remove(2);
        listaLiczb.add(2, liczba13);
        listaLiczb.remove(7);
        listaLiczb.add(7, liczba18);
        System.out.println(listaLiczb);
    }

    private static void dodawanieElementowDoList() {
        List<Integer> listaLiczb = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            int liczba = random.nextInt(200);
            listaLiczb.add(liczba);
        }
        System.out.println(listaLiczb);
        listaLiczb.add(5, 500);
        System.out.println(listaLiczb);
        List<Integer> drugaLista = new ArrayList<>();
        for(int i=0;i<20;i++){
            int liczba = random.nextInt(10);
            drugaLista.add(liczba);
        }
        System.out.println("===================");
        System.out.println("Druga lista: ");
        System.out.println(drugaLista);

        drugaLista.addAll(listaLiczb);
        System.out.println("Połączone listy: ");
        System.out.println(drugaLista);
    }

    private static void tworzenieList(){
        List<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        List lista3 = new ArrayList();

        lista1 = new LinkedList();

        if (lista1 instanceof ArrayList){
            ((ArrayList) lista1).ensureCapacity(123);
        }
        lista2.ensureCapacity(123);
    }
}
