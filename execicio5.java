package exexStreamsaapi;

import java.util.*;

import java.util.stream.Collectors;

public class execicio5 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        List<Integer> numerosPositivos = numerosAleatorios.stream()
                .map(Integer::parseInt)// converte a lista de numeros em inteiros
                .filter(n -> n > 5)// numeros maiores que 5
                .collect(Collectors.toList());// coleta os resultados em uma lista

        double media = numerosPositivos.stream()
                .mapToInt(Integer::intValue) // Converte os valores para int
                .average() // Calcula a média dos valores
                .orElse(0); // Retorna 0 se a lista estiver vazia

        System.out.println("A média é: " + media);
    }
}
