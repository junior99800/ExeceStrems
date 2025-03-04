package exexStreamsaapi;

import java.util.Arrays;
import java.util.List;

public class execicio3 {

    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        boolean todosPositivos = numerosAleatorios.stream()
                .map(Integer::parseInt) // Converte cada string para um inteiro
                .allMatch(n -> n > 0);

        if (todosPositivos) {
            System.out.println("todos os numeros sao positivos");
        } else {
            System.out.println("nem todos os numeros sao positivos");
        }
    }
}