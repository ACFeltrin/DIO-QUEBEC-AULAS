package com.dio.collection.streamApi2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class exerciciotreamApi {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos desta lista de String: ");

        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set: ");

//        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());

        System.out.println("Transforme esta lista de String em lista de numeros inteiros: ");

        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");

        List<Integer> listParesMaiores = numerosAleatorios.stream().map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaiores);

        System.out.println("Mostre a media dos números: ");

        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("Exclua os números Impares:");

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));
        System.out.println(numerosAleatoriosInteger);



    }
}
