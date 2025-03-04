package exexStreamsaapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exexcicio2 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        List<Integer> imprimirSomaNumerosPares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        int somaPares = imprimirSomaNumerosPares.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("soma dos numeros pares: " + somaPares);

    }
}