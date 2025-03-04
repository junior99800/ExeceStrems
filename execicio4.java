package exexStreamsaapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class execicio4 {
        public static void main(String[] args) {
                List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

                List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());

                System.out.println("Remova os valores ímpares: ");
                numerosAleatorios.removeIf(integer -> integer % 2 != 0);
                System.out.println(numerosAleatorios);
                numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
                System.out.println(numerosAleatoriosInteger);
        }
}