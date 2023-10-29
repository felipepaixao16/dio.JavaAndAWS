package Desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Desafios {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, -6, 7, 8, 9, 10, 5, 4, 3);


        System.out.println("imprimir a lista em ordem crescente.");
        List<Integer> ordemCrescente = numeros.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(ordemCrescente);


        System.out.println("imprimir a soma dos numeros pares da lista.");
        int sum = numeros.stream()
                .filter(integer -> integer % 2 == 0)
                .mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);


        System.out.println("imprimir os números da lista que for positivo.");
        Predicate<Integer> maiorQueUm = numero -> numero >= 0;
        numeros.stream()
                .filter(maiorQueUm)
                .forEach(numero -> {
                    System.out.printf("O número %d é positivo\n", numero);
                });

    }
}
