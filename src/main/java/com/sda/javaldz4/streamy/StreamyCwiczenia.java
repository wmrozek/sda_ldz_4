package com.sda.javaldz4.streamy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamyCwiczenia {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i=0;i<100;i++){
            lista.add(i+1);
        }
        Random random = new Random();
        random.nextInt(200);
        //Wszystkie liczby podzielne przez 2
        List<Integer> podzielnePrzez2 = lista.stream()
                .filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2 == 0;
            }
        }).collect(Collectors.toList());

        List<Integer> podzielnePrzez2PlusLambda = lista.stream()
                .filter(liczba -> liczba%2==0).collect(Collectors.toList());

        List<Integer> wyniki1 = lista.stream()
                .filter(liczba -> {
                    if(liczba < 51){
                        return liczba%2==0;
                    }else{
                        return liczba%3==0;
                    }
                }).collect(Collectors.toList());

        List<Integer> wieksze3Razy = lista.stream()
                .map(liczba -> liczba*3)
                .collect(Collectors.toList());

        Integer max = lista.stream()
                .mapToInt(liczba -> liczba * random.nextInt(100))
                .max().getAsInt();
        System.out.println(max);

        OptionalInt max2 = lista.stream().mapToInt(liczba -> liczba)
                .filter(liczba -> liczba>1000)
                .max();
        if(max2.isPresent()){
            System.out.println(max2.getAsInt());
        }else{
            System.out.println("Zbiór jest pusty");
        }

        Double avg = lista.stream().mapToInt(liczba -> liczba)
                .average().getAsDouble();

        System.out.println(avg);

        Optional<Integer> pierwszaPodzielnaPrzez2 = lista.stream()
                .map(liczba -> liczba * random.nextInt(100))
                .filter(liczba -> liczba%2==0)
                .findFirst();

        if (pierwszaPodzielnaPrzez2.isPresent()){
            System.out.println(pierwszaPodzielnaPrzez2.get());
        }else{
            System.out.println("Nie znaleziono wyników");
        }


//        System.out.println(max2);

//        System.out.println(wieksze3Razy);
//        System.out.println(lista);
//        System.out.println(podzielnePrzez2);
//        System.out.println(podzielnePrzez2PlusLambda);

    }

}
