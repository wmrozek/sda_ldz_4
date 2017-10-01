package com.sda.javaldz4.kolejki;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class KolejkiCwiczenia{
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.equals(o2)){
                    return 0;
                }else if(o1.intValue() > o2.intValue()){
                    return -1;
                }else{
                    return 1;
                }
            }
        };
        Queue<Integer> linkedList = new LinkedList<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>(comparator);
        Random random = new Random();

        for (int i=0;i<10;i++){
            int liczba = random.nextInt(100);
            linkedList.offer(liczba);
            priorityQueue.offer(liczba);
        }

        System.out.println(linkedList);
        System.out.println(priorityQueue);
        //Iterujemy po kolejnych elementach kolejki
//        wyswietlKolejke(linkedList);
//        wyswietlKolejke(priorityQueue);
        while(!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll()+" ");
        }


    }

    private static void wyswietlKolejke(Queue<Integer> queue) {
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("");
    }
}
