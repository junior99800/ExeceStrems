package exexStreamsaapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercicio8 {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        List<Integer> numerosPositivos = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(n -> n > 0)
                .collect(Collectors.toList());

        int somaPositivos = numerosPositivos.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("SOMA DE TODOS OS NUMEROS " + somaPositivos);

    }
}
